package projecten2;


public class Feedback {
    
    private Melding melding;
    private FType type;
    private String omschrijving;
    
    public Feedback(Melding melding, FType type, String omschrijving){
        this.melding = melding;
        this.type = type;
        this.omschrijving = omschrijving;
    }
    
    public Melding getMelding(){
        return melding;
    }
    
    public void setMelding(Melding melding){
        this.melding = melding;
    }
    
    public String getType(){
        return type.toString();
    }
    
    public void setType(FType type){
        this.type = type;
    }
    
    public String getOmschrijving(){
        return omschrijving;
    }
    
    public void setOmschrijving(String omschrijving){
        this.omschrijving = omschrijving;
    }
}
