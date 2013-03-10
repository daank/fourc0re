package Projecten2;


public class Situatie extends Melding{
    
    private int meldingId;
    private int gebruikerId;
    private String titel;
    private SType type;
    private String locatie;
    private String omschrijving;
    private int afbeeldingId;
    
    public Situatie(int meldingId, int gebruikerId, String titel, SType type, String locatie, String omschrijving){
        this.meldingId = meldingId;
        this.gebruikerId = gebruikerId;
        this.titel = titel;
        this.type = type;
        this.locatie = locatie;
        this.omschrijving = omschrijving;
    }
    
    public Situatie() {
        this(1, 1, "Geen titel",SType.TYPE4,"","");
    }
    
    public int getMeldingId(){
        return meldingId;
    }
    
    public void setMeldingId(int meldingId){
        this.meldingId = meldingId;
    }
    
    public int getGebruikerId(){
        return gebruikerId;
    }
    
    public void setGebruikerId(int gebruikerId){
        this.gebruikerId = gebruikerId;
    }
    
    public String getTitel(){
        return titel;
    }
    
    public void setTitel(String titel){
        this.titel = titel;
    }
    
    public String getType(){
        return type.toString();
    }
    
    public void setType(SType type){
        this.type = type;
    }
    
    public String getLocatie(){
        return locatie;
    }
    
    public void setLocatie(String locatie){
        this.locatie = locatie;
    }
    
    public String getOmschrijving(){
        return omschrijving;
    }
    
    public void setOmschrijving(String omschrijving){
        this.omschrijving = omschrijving;
    }
    
    public int getAfbeeldingId(){
        return afbeeldingId;
    }
    
    public void setAfbeeldingId(int afbeeldingId){
        this.afbeeldingId = afbeeldingId;
    }
}
package projecten2;


public class Situatie extends Melding{
    
    private String titel;
    private SType type;
    private String omschrijving;
    
    public Situatie(String titel, SType type, String omschrijving){
        this.titel = titel;
        this.type = type;
        this.omschrijving = omschrijving;
    }
    
    public String getTitel(){
        return titel;
    }
    
    public void setTitel(String titel){
        this.titel = titel;
    }
    
    public String getType(){
        return type.toString();
    }
    
    public void setType(SType type){
        this.type = type;
    }
    
    public String getOmschrijving(){
        return omschrijving;
    }
    
    public void setOmschrijving(String omschrijving){
        this.omschrijving = omschrijving;
    }

      
}
