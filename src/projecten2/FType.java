package Projecten2;


public enum FType {
    
    TYPE1 ("Bevestiging"),
    TYPE2 ("Reactie"),
    TYPE3 ("Foute Melding"),
    TYPE4 ("Meld Misbruik");
    
    private final String naam;
    
    private FType(String s){
        naam = s;
    }
    
    @Override
    public String toString(){
        return naam;
    }
    
}
