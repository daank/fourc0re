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
