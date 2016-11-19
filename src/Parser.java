
import com.sun.org.apache.xerces.internal.parsers.SAXParser;
import java.io.IOException;
import java.util.ArrayList;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.XMLReader;

/**
 * @author Roman Kluth
 */
public class Parser {
    private XMLReader parser;
    private ContentHandlerFahrzeug handler;
    private ErrorHandlerFahrzeug error;
    
    public Parser() throws SAXNotSupportedException, SAXNotRecognizedException, IOException {
        handler = new ContentHandlerFahrzeug();
        error = new ErrorHandlerFahrzeug();
        parser = new SAXParser();
        parser.setContentHandler(handler);
        parser.setErrorHandler(error);
        parser.setFeature("http://xml.org/sax/features/validation", true);
    }
    
    public void parse(String pfad) {
        try{
            System.out.println("#beginnt zu parsen");
            parser.parse(pfad); // fehler
            System.out.println("#fertig mit parsen");
        } catch (SAXException e) {
            System.out.println("Fehler beim parsen!");
        }catch (IOException e) {
            System.out.println("IO Fehler!");
        } 
    }
    
    public ArrayList<Fahrzeug> getFahrzeuge() {
        return handler.getFahrzeuge();
    }
}
