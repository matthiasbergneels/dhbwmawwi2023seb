package lecture.chapter4;

import lecture.chapter5.Brand;
import lecture.chapter5.Car;

public class CarRun {

    public static void main(String[] args) {

        Car myCar = new Car("Blau", Brand.FIAT, 100, (byte)5);

        //lecture.chapter5.Car myCar = new lecture.chapter5.Car("Blau", "Tesla", 100, (byte)5);

        System.out.println("Mein Auto ist ein " + myCar.BRAND
                + " in " + myCar.getColor()
                + " mit " + myCar.getHp() + " PS");

    }
}
