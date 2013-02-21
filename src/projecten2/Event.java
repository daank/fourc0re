package projecten2;


public class Event extends Melding{
    
    private String titel;
    private String datum;
    private String tijdstip;
    private EType type;
    private String omschrijving;
    
    public Event(String titel, String datum, String tijdstip, EType type, String omschrijving){
        this.titel = titel;
        this.datum = datum;
        this.tijdstip = tijdstip;
        this.type = type;
        this.omschrijving = omschrijving;
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
    
    public void setType(EType type){
        this.type = type;
    }
    
    public String getOmschrijving(){
        return omschrijving;
    }
    
    public void setOmschrijving(String omschrijving){
        this.omschrijving = omschrijving;
    }
}
