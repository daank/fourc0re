package Projecten2;


public class Like {
    
    private int meldingId;
    private int gebruikerId;
    
    public Like(int meldingId, int gebruikerId){
        this.meldingId = meldingId;
        this.gebruikerId = gebruikerId;
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
}
