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
