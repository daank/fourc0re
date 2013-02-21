package projecten2;


public enum FType {
    
    TYPE1 ("Bevestiging"),
    TYPE2 ("Reactie"),
    TYPE3 ("Foute Melding"),
    TYPE4 ("Meld Misbruik");
    
    private String naam;
    
    private FType(String s){
        naam = s;
    }
    
    public String toString(){
        return naam;
    }
    
}
