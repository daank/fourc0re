package Projecten2;


public enum EType{
    
    TYPE1 ("Acties met Buurtbewoners"),
    TYPE2 ("Buurtfeesten"),
    TYPE3 ("Andere");
    
    private final String naam;
    
    private EType(String s){
        naam = s;
    }
    
    @Override
    public String toString(){
        return naam;
    }
}
