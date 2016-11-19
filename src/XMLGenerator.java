import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

/**
 * @author Roman Kluth
 */
public class XMLGenerator {

    
    private ArrayList<Fahrzeug> fahrzeuge;


    public XMLGenerator(ArrayList<Fahrzeug> fahrzeug) throws IOException,SAXException {
        this.fahrzeuge = fahrzeug;
    }

public void generateXML(){
    try{


    FileOutputStream fout = new FileOutputStream("src/fahrzeugdatenbank.xml");
    OutputFormat of = new OutputFormat("XML", "ISO-8859-1", true);

    of.setDoctype(null, "fahrzeugdatenbank.dtd");

    XMLSerializer serializer = new XMLSerializer(fout, of);

    ContentHandler ch = serializer.asContentHandler();

    ch.startDocument();

    AttributesImpl atts = new AttributesImpl();
    
    ch.startElement("","","fahrzeugdatenbank",atts);

        System.out.println("#XML-Datei wird erstellt");
    for (int i=0; i<fahrzeuge.size(); i++) {
                
//                ch.startElement("","","fahrzeug",atts);
                
                atts.clear();
        
                atts.addAttribute("", "", "hersteller", "CDATA", "");
                atts.addAttribute("", "", "vorbesitzer", "CDATA", (fahrzeuge.get(i).getVorbesitzer()));
                atts.addAttribute("", "", "modellbezeichnung", "CDATA", (fahrzeuge.get(i).getModellbezeichnung()));
                atts.addAttribute("", "", "seriennummer", "CDATA", fahrzeuge.get(i).getSeriennummer());
                atts.addAttribute("", "", "farbe", "CDATA", fahrzeuge.get(i).getFarbe());
                ch.startElement("","","fahrzeug", atts);
//                ch.endElement("","","fahrzeug");
                atts.clear(); 
                
                
                atts.addAttribute("", "", "tag", "CDATA", fahrzeuge.get(i).getTag());
                atts.addAttribute("", "", "monat", "CDATA", fahrzeuge.get(i).getMonat());
                atts.addAttribute("", "", "jahr", "CDATA", fahrzeuge.get(i).getJahr());
                ch.startElement("","","produktionsdatum", atts);
                ch.endElement("","","produktionsdatum");
                atts.clear();
                
                ch.startElement("", "", "anmerkung", atts);
                String anmerkung = fahrzeuge.get(i).getAnmerkung();
                ch.characters(anmerkung.toCharArray(), 0, anmerkung.length());
                ch.endElement("", "", "anmerkung");
                atts.clear();
                
                
                atts.addAttribute("", "", "zylinderanzahl", "CDATA", fahrzeuge.get(i).getZylinderanzahl());
                atts.addAttribute("", "", "brennstoffart", "CDATA", fahrzeuge.get(i).getBrennstoffart());
                atts.addAttribute("", "", "hubraum", "CDATA", fahrzeuge.get(i).getHubraum());
                ch.startElement("","","motor", atts);
                ch.endElement("","","motor");
                atts.clear();
                
                ch.startElement("", "", "ausstattungsliste", atts);
                
                int index = fahrzeuge.get(i).getIndex();
                
                while(index != 0){
                int a = 0;
                
                atts.addAttribute("", "", "bezeichnung", "CDATA", fahrzeuge.get(i).getBezeichnung(index - 1));
                atts.addAttribute("", "", "anzahl", "CDATA", fahrzeuge.get(i).getAnzahl(index - 1));
                atts.addAttribute("", "", "einzelpreis", "CDATA", fahrzeuge.get(i).getEinzelpreis(index - 1));
             
                ch.startElement("","","ausstattungsoption", atts);
                ch.endElement("","","ausstattungsoption");
                atts.clear();
                a++;
                index--;
                }
      
                ch.endElement("","","ausstattungsliste");
  
                ch.endElement("","","fahrzeug");
    }
    
    ch.endElement("","","fahrzeugdatenbank");
    ch.endDocument();
        System.out.println("#Schreiben in XML-Datei beendet");
    fout.close();
        } catch (FileNotFoundException e) {
            System.out.println("Die Datei konnte nicht gefunden werden.");
        } catch (IOException io) {
            System.out.println("Die Datei ist nicht vorhanden.");
        } catch (SAXException sax) {
            System.out.println("Fehler beim Parsen.");
            
        }  
}
}
