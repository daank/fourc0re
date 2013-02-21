package projecten2;


public enum EType {
    
    TYPE1 ("Acties met Buurtbewoners"),
    TYPE2 ("Buurtfeesten"),
    TYPE3 ("Andere");
    
    private String naam;
    
    private EType(String s){
        naam = s;
    }
    
    public String toString(){
        return naam;
    }
}
