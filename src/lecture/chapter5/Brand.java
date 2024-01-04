package lecture.chapter5;

public enum Brand {
    MERCEDES("$$$"),
    TESLA("$$"),
    FIAT("$"),
    OPEL("$");

    private String priceTag;
    Brand(String priceTag){
        this.priceTag = priceTag;
    }

    public String getPriceTag(){
        return priceTag;
    }

    @Override
    public String toString(){
     return switch(this){
       case MERCEDES -> "Mercedes";
       case TESLA -> "Tesla";
       case FIAT -> "FIAT";
       case OPEL -> "Opel";
     };
    }
}
