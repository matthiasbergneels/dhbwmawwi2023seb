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
}
