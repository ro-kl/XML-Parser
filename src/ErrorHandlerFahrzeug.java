
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/**
 * @author Roman Kluth
 */
public class ErrorHandlerFahrzeug implements ErrorHandler{
    
 
    @Override
    public void warning(SAXParseException e) throws SAXException {
        System.out.println("warning:");
        System.out.println("Zeile: "+ e.getLineNumber());
        System.out.println("Spalte: "+ e.getColumnNumber());
        System.out.println("Meldung: "+ e.getMessage());
    }
  
    @Override
    public void error(SAXParseException e) throws SAXException {
        System.out.println("error:");
        System.out.println("Zeile: "+ e.getLineNumber());
        System.out.println("Spalte: "+ e.getColumnNumber());
        System.out.println("Meldung: "+ e.getMessage());
    }
  
    @Override
    public void fatalError(SAXParseException e) throws SAXException {
        System.out.println("fatalError");
        System.out.println("Zeile: "+ e.getLineNumber());
        System.out.println("Spalte: "+ e.getColumnNumber());
        System.out.println("Meldung: "+ e.getMessage());;
    }   
    
    
}
