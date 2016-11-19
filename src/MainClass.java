
import java.io.IOException;
import java.util.ArrayList;
import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;

/**
 * @author Roman Kluth
 */
public class MainClass {
    
    public static void main(String[] args) throws IOException, SAXException {
        Parser parser;
        try{
            parser = new Parser();
            parser.parse("src/Oldsmobil.xml");
            ArrayList<Fahrzeug> fahrzeuge = parser.getFahrzeuge();
            XMLGenerator generator = new XMLGenerator(fahrzeuge);
            generator.generateXML();
        } catch (SAXNotSupportedException ex) {
        } catch (SAXNotRecognizedException ex) {
        }
    }
    
}
