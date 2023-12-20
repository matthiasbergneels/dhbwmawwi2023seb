package lecture.chapter5;

public class Student {

    private String name;
    private int sId;

    void drink(float amount){
        System.out.println(name + " trinkt " + amount + " l");
    }

    void drink(float amount, float alcoholPercentage){
        drink(amount);
        System.out.println("und wird " + (alcoholPercentage > 15 ? "schnell" : "langsam") + " betrunken");
    }

    void drink(float amount, double coffeinInMg){
        drink(amount);
        System.out.println("und wird " + (coffeinInMg > 150 ? "schnell" : "langsam") + " wach");
    }
}
