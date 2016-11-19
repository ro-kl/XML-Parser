
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


/**
 * @author Roman Kluth
 */
public class Fahrzeug {
   
    private String anmerkung="";
    private String vorbesitzer;

    private String hersteller;
    private String modellbezeichnung;
    private String seriennummer;
    private String farbe;
    private String tag;
    private String monat;
    private String jahr;
    
    // motor
    
    private int index;
    
    private String zylinderanzahl;
    private String brennstoffart;
    private String hubraum;
    
    private ArrayList<String> bezeichnung;
    private ArrayList<String> anzahl;
    private ArrayList<String> einzelpreis;

    public Fahrzeug(){
    

        index = 0;

        
    bezeichnung = new ArrayList();
    anzahl = new ArrayList();
    einzelpreis = new ArrayList();


    }

    public void indexPlus(){
        index++;
    }
    public int getIndex(){
        return index;
    }
    

    public void setVorbesitzer(String aVorbesitzer){
        this.vorbesitzer = aVorbesitzer;
    }
    public String getVorbesitzer(){
        return this.vorbesitzer;
    }
    public void setAnmerkung(String aAnmerkung){
        this.anmerkung = aAnmerkung;
    }
    public String getAnmerkung(){
        return this.anmerkung;
    }
    public void setHersteller(String aHersteller){
        this.hersteller = aHersteller;
    }
    public String getHersteller(){
        return hersteller;
    }
    
    public void setModellbezeichnung(String aModellbezeichnung){
        this.modellbezeichnung = aModellbezeichnung;
    }
    public String getModellbezeichnung(){
        return modellbezeichnung;
    }
    
    public void setSeriennummer(String aSeriennummer){
        this.seriennummer = aSeriennummer;
    }
    public String getSeriennummer(){
        return seriennummer;
    }
    
    public void setFarbe(String aFarbe){
        farbe = aFarbe;
    }
    public String getFarbe(){
        return farbe;
    }
    
    public void setTag(String aTag){
        this.tag = aTag;
    }
    public String getTag(){
        return tag;
    }
    
    public void setMonat(String aMonat){
        this.monat = aMonat;
    }
    public String getMonat(){
        return monat;
    }
    
    public void setJahr(String aJahr){
        jahr = aJahr;
    }
    public String getJahr(){
        return jahr;
    }
    
    public void setZylinderanzahl(String aZylinderanzahl){
        zylinderanzahl = aZylinderanzahl;
    }
    public String getZylinderanzahl(){
        return zylinderanzahl;
    }
    
    public void setBrennstoffart(String aBrennstoffart){
       brennstoffart = aBrennstoffart;
    }
    public String getBrennstoffart(){
        return brennstoffart;
    }
    public String getHubraum(){
        return hubraum;
    }
    
    public void setHubraum(String aHubraum){
        this.hubraum =  aHubraum;
    }

    
    
    
    
    
    
    // ausstattung
    
    
    
    
    public void setBezeichnung(String aBezeichnung){
        bezeichnung.add(aBezeichnung);
//        ausstattungsoptionen.put(bezeichnung, this.bezeichnung);
//        this.fuegeHinzu();
    }

    
    public void setAnzahl(String aAnzahl){
        anzahl.add(aAnzahl);
//        ausstattungsoptionen.put(anzahl, this.anzahl);
//        this.fuegeHinzu();
    }

    
    public void setEinzelpreis(String aEinzelpreis){
        einzelpreis.add(aEinzelpreis);
//        ausstattungsoptionen.put(einzelpreis, this.einzelpreis);
//        this.fuegeHinzu();
    }
    
    public String getEinzelpreis(int i){
        return einzelpreis.get(i);
    }
    public String getBezeichnung(int i){
        return bezeichnung.get(i);
    }

    
    public String getAnzahl(int i){
        return anzahl.get(i);
    }
  
    
//    public ArrayList getAusstattungsliste(){
//        return this.ausstattungsliste;
//    }
//    
//    public void fuegeHinzu(){
//        if(this.ausstattungsoptionen.containsKey(bezeichnung)&&
//                this.ausstattungsoptionen.containsKey(anzahl)&&
//                this.ausstattungsoptionen.containsKey(einzelpreis)){
//            
//            this.ausstattungsliste.add(ausstattungsoptionen);
//            this.ausstattungsoptionen.clear();
//        }
//         
//    }
    

    
}
