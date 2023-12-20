package lecture.chapter5.ParkingLot;

//import lecture.chapter5.Car;

import lecture.chapter5.Brand;

public class ValetService {

    public static void main(String[] args) {
        lecture.chapter5.Car myCar = new lecture.chapter5.Car("Blau", Brand.OPEL, 100, (byte)5);

        //lecture.chapter5.Car myCar = new lecture.chapter5.Car("Blau", "Tesla", 100, (byte)5);

        System.out.println("Mein Auto ist ein " + myCar.BRAND
                + " in " + myCar.getColor()
                + " mit " + myCar.getHp() + " PS");

    }
}
