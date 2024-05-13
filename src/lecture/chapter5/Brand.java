package lecture.chapter5;

import lecture.chapter7.Bookable;

public enum Brand {
    MERCEDES("$$$", "High"),
    TESLA("$$", "Medium"),
    FIAT("$", "Low"),
    OPEL("$", "Medium");

    private String priceTag;
    private String quality;
    Brand(String priceTag, String quality){
        this.priceTag = priceTag;
        this.quality = quality;
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
