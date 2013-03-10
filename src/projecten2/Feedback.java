package Projecten2;


public class Feedback {
    
    private int meldingId;
    private int gebruikerId;
    private int feedbackId;
    private FType type;
    private String omschrijving;
    private int afbeeldingId;
    
    public Feedback(int meldingId, int gebruikerId, int feedbackId, FType type, String omschrijving){
        this.meldingId = meldingId;
        this.gebruikerId = gebruikerId;
        this.feedbackId = feedbackId;
        this.type = type;
        this.omschrijving = omschrijving;
    }
    
    public Feedback(){
        this(1, 1, 1, FType.TYPE1, "");
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
    
    public int getFeedbackId(){
        return feedbackId;
    }
    
    public void setFeedbackId(int feedbackId){
        this.feedbackId = feedbackId;
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
    
    public int getAfbeeldingId(){
        return afbeeldingId;
    }
    
    public void setAfbeeldingId(int afbeeldingId){
        this.afbeeldingId = afbeeldingId;
    }
}
