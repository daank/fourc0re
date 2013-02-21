package projecten2;


public enum SType {
    
    TYPE1 ("Gevaarlijke Omstandigheden"),
    TYPE2 ("Problemen met het Wegdek"),
    TYPE3 ("Vervuiling"),
    TYPE4 ("Andere");
    
    
    private final String naam;
    
    private SType(String s){
      naam = s;
    }
    
    public String toString(){
        return naam;
    }
}
