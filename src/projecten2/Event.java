package projecten2;


public class Event extends Melding{
    private int meldingId;
    private int gebruikerId;
    private String titel;
    private String datum;
    private String tijdstip;
    private String locatie;
    private EType type;
    private String omschrijving;
    private int afbeeldingId;
    
    public Event(int eventId, int gebruikerId, String titel, String datum, 
            String tijdstip, String locatie, EType type, String omschrijving, int afbeeldingId){
	this.meldingId = eventId;
        this.gebruikerId = gebruikerId;
        this.titel = titel;
        this.datum = datum;
        this.tijdstip = tijdstip;
        this.locatie = locatie;
        this.type = type;
        this.omschrijving = omschrijving;
        this.afbeeldingId = afbeeldingId;
    }

    public Event() {
        this(1, 1, "Geen titel","","","",EType.TYPE3,"");
    }

    public int getMeldingId() {
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
    
    public String getDatum(){
        return datum;
    }
    
    public void setDatum(String datum){
        this.datum = datum;
    }
    
    public String getTijdstip(){
        return tijdstip;
    }
    
    public void setTijdstip(String tijdstip){
        this.tijdstip = tijdstip;
    }
    
    public String getLocatie(){
        return locatie;
    }
    
    public void setLocatie(String locatie){
        this.locatie = locatie;
    }
    
    public String getType(){
        return type.toString();
    }
    
    public void setType(EType type){
        this.type = type;
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


public class Event extends Melding{
    private int idMelding;
    private String titel;
    private String datum;
    private String tijdstip;
    private String type;
    private String omschrijving;
    
    public Event(int idMelding, String titel, String datum, String tijdstip, String type, String omschrijving){
	this.idMelding = idMelding;
        this.titel = titel;
        this.datum = datum;
        this.tijdstip = tijdstip;
        this.type = type;
        this.omschrijving = omschrijving;
    }

    public Event() {
        this(1,"onbekend","onbekend","onbekend","onbekend","onbekend");
    }

    public int getIdMelding() {
        return idMelding;
    }

    public void setIdMelding(int idMelding) {
        this.idMelding = idMelding;
    }
    
    public String getTitel(){
        return titel;
    }
    
    public void setTitel(String titel){
        this.titel = titel;
    }
    
    public String getDatum(){
        return datum;
    }
    
    public void setDatum(String datum){
        this.datum = datum;
    }
    
    public String getTijdstip(){
        return tijdstip;
    }
    
    public void setTijdstip(String tijdstip){
        this.tijdstip = tijdstip;
    }
    
    public String getType(){
        return type.toString();
    }
    
    public void setType(String type){
        this.type = type;
    }
    
    public String getOmschrijving(){
        return omschrijving;
    }
    
    public void setOmschrijving(String omschrijving){
        this.omschrijving = omschrijving;
    }
}
