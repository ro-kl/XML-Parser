import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/**
 * @author Roman Kluth
 */
public class ContentHandlerFahrzeug implements ContentHandler{
    


    
    private ArrayList<Fahrzeug> fahrzeugListe = new ArrayList<Fahrzeug>();
    private Fahrzeug neuesFahrzeug;
  
    
    private String aktAnmerkung = "";
    private boolean anmerkung;
    private boolean modellbezeichnung;
    private String aktModellbezeichnung = "";
    private boolean seriennummer;
    private String aktSeriennummer = "";
    private boolean farbe;
    private String aktFarbe = "";
    private boolean tag;
    private boolean monat;
    private boolean jahr;
    private boolean zylinderanzahl;
    private boolean brennstoffart;
    private boolean hubraum;
    private String aktTag = "";
    private String aktMonat = "";
    private String aktJahr = "";
    private String aktZylinder = "";
    private String aktBrennstoffart = "";
    private String aktHubraum = "";
    private boolean bezeichnung;
    private String aktBezeichnung = "";
    private boolean anzahl;
    private String aktAnzahl = "";
    private boolean preis;
    private String aktPreis;
    private boolean vorbesitzer;
    private String aktVorbesitzer;
    
    
    public ContentHandlerFahrzeug(){
    }
    

    @Override
    public void startPrefixMapping(String prefix, String uri) throws SAXException {

    }

    @Override
    public void endPrefixMapping(String prefix) throws SAXException {

    }
  
    @Override
    public void startDocument() throws SAXException {
    }
    
  
    @Override
    public void endDocument() throws SAXException {
    }

    
    
    public void ignorableWhitespace(char[]ch,int start, int length){
    }   

    @Override
    public void setDocumentLocator(Locator locator) {
    }
    
    @Override
    public void processingInstruction(String target, String data) throws SAXException {
    }
    
    @Override
    public void skippedEntity(String name) throws SAXException {
    }
    
     /*
     * uri: Namensraum URI
     * local: lokale name des Elements
     * name: kompletter name + Präfix 
     * atts: ????, Interface welches die Attribute erkennt
     */ 
    @Override
    public void startElement(String uri, String localName, String name, Attributes atts) throws SAXException {
        
        if(localName.equals("fahrzeug")) {
            neuesFahrzeug = new Fahrzeug();
        } else if (localName.equals("vorbesitzer")){
            vorbesitzer = true;  
        } else if (localName.equals("modellbezeichnung")){
            modellbezeichnung = true;  
        } else if (localName.equals("seriennummer")){
            seriennummer = true;
        } else if (localName.equals("farbe")){
            farbe = true;
        } else if (localName.equals("produktionsdatum")){
  
        } else if (localName.equals("tag")){
            tag = true;
        } else if (localName.equals("monat")){
            monat = true;
        } else if (localName.equals("jahr")){
            jahr = true;   
        } else if(localName.equals("anmerkung")) {
            anmerkung = true;
        } else if (localName.equals("motor")) {


        } else if (localName.equals("zylinderanzahl")){
            zylinderanzahl = true;
        } else if (localName.equals("brennstoffart")){
            brennstoffart = true;
        } else if (localName.equals("hubraum")){
            hubraum = true;
   
        } else if(localName.equals("ausstattungsliste")) {

        } else if(localName.equals("ausstattungsoption")) {              
            neuesFahrzeug.indexPlus(); // Index für die While-Schleife im CH
        } else if (localName.equals("bezeichnung")){
            bezeichnung = true;
//            neuesFahrzeug.setBezeichnung(atts.getValue("bezeichnung"));   
        } else if (localName.equals("anzahl")){
            anzahl = true;
//            neuesFahrzeug.setAnzahl(atts.getValue("anzahl"));
        } else if (localName.equals("einzelpreis")){
            preis = true;
//            neuesFahrzeug.setEinzelpreis(atts.getValue("einzelpreis"));
        } else {
        }
    }
    
    /*
     * Wird am Ende jedes Elementes aufgerufen.
     */
    @Override
    public void endElement(String uri, String localName, String name) throws SAXException {
        if(name.equals("modellbezeichnung")){
            modellbezeichnung = false;
            neuesFahrzeug.setModellbezeichnung(aktModellbezeichnung);
            aktModellbezeichnung = "";
        } else if(name.equals("vorbesitzer")){
            vorbesitzer = false;
            neuesFahrzeug.setVorbesitzer(aktVorbesitzer);
            aktVorbesitzer = "";           
        } else if(name.equals("seriennummer")){
            seriennummer = false;
            neuesFahrzeug.setSeriennummer(aktSeriennummer);
            aktSeriennummer = "";
        } else if (name.equals("farbe")){
            farbe = false;
            neuesFahrzeug.setFarbe(aktFarbe);
            aktFarbe = "";
        } else if (name.equals("tag")){
            tag = false;
            neuesFahrzeug.setTag(aktTag);
            aktTag = "";
        } else if (name.equals("monat")){
            monat = false;
            neuesFahrzeug.setMonat(aktMonat);
            aktMonat = "";
        } else if (name.equals("jahr")){
            jahr = false;
            neuesFahrzeug.setJahr(aktJahr);
            aktJahr = "";
        } else if(name.equals("anmerkung")) {
            anmerkung = false;
            neuesFahrzeug.setAnmerkung(aktAnmerkung);
            aktAnmerkung = "";
        } else if(name.equals("motor")) {

        } else if (name.equals("zylinderanzahl")){
            zylinderanzahl = false;
            neuesFahrzeug.setZylinderanzahl(aktZylinder);
            aktZylinder = "";
        } else if (name.equals("brennstoffart")){
            brennstoffart = false;
            neuesFahrzeug.setBrennstoffart(aktBrennstoffart);
            aktBrennstoffart = "";
        } else if (name.equals("hubraum")){
            hubraum = false;
            neuesFahrzeug.setHubraum(aktHubraum);
            aktHubraum = "";
        } else if(name.equals("aussatungsliste")) {

        } else if (name.equals("bezeichnung")){
            bezeichnung = false;
            neuesFahrzeug.setBezeichnung(aktBezeichnung);
            aktBezeichnung = "";
        } else if (name.equals("anzahl")){
            anzahl = false;
            neuesFahrzeug.setAnzahl(aktAnzahl);
            
            aktAnzahl = "";
        } else if (name.equals("einzelpreis")){
            preis = false;
            neuesFahrzeug.setEinzelpreis(aktPreis);
            
            aktPreis = "";
        } else if(name.equals("fahrzeug")) {
            fahrzeugListe.add(neuesFahrzeug);
        }
    }

    /* Inhalt zwischen 2 Elementen.
     * Kindelemente -> wieder Element Methoden.
     */
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String s = new String(ch, start, length);
        if (modellbezeichnung){
            aktModellbezeichnung = s;
        } else if(vorbesitzer){
            aktVorbesitzer = s;
        } else if(seriennummer){
            aktSeriennummer = s;
        } else if (farbe){
            aktFarbe = s;
        } else if (tag){
            aktTag = s;
        } else if (monat){
            aktMonat= s;
        } else if (jahr){
            aktJahr = s;
        } else if(anmerkung) {
            aktAnmerkung = s;
        } else if (zylinderanzahl){
            aktZylinder = s;
        } else if (brennstoffart){
            aktBrennstoffart = s;
        } else if (hubraum){
            aktHubraum = s;
        } else if (bezeichnung){
            aktBezeichnung =s;
        } else if (anzahl){
            aktAnzahl =s;
        } else if (preis){
            aktPreis = s;
        }

    }
    
    
    public ArrayList<Fahrzeug> getFahrzeuge() {
        return fahrzeugListe;
    }

}
