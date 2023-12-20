package lecture.chapter5;

public class CarRun {

    public static void main(String[] args) {

        Car myCar = new Car("BLAU", Brand.TESLA, 100, (byte)5);

        System.out.println("Aktuelle Anzahl an Autos: " + Car.getCarCount());

        Car yourCar = new Car(Car.COLOR_RED, Brand.OPEL, 150, (byte)3);
        Car herCar = new Car(Car.COLOR_BLACK, Brand.MERCEDES, 100, (byte)5);

        System.out.println("Aktuelle Anzahl an Autos: " + Car.getCarCount());

        new Car();
        new Car();
        new Car();

        /*
        myCar.brand = "Tesla";
        myCar.hp = 100;
        myCar.doorCount = 5;
        myCar.color = "Blau";

        herCar.brand = "Tesla";
        herCar.hp = 100;
        herCar.doorCount = 5;
        herCar.color = "Blau";

        yourCar.brand = "Opel";
        yourCar.hp = 150;
        yourCar.doorCount = 3;
        yourCar.color = "Grün";
         */

        // myCar.color = "Post-Gelb"; --> kein Zugriff, da private
        // myCar.currentSpeed = -500000; --> kein Zugriff, da private
        //myCar.brand = "Lada"; --> final (nicht änderbar)

        myCar.setColor("Lila");
        myCar.setColor("Post-Gelb");


        System.out.println("Aktuelle Geschwindigkeit mein Auto: " + myCar.getCurrentSpeed());
        System.out.println("Aktuelle Geschwindigkeit dein Auto: " + yourCar.getCurrentSpeed());
        myCar.accelerate(50);
        yourCar.accelerate(100);
        System.out.println("Aktuelle Geschwindigkeit mein Auto: " + myCar.getCurrentSpeed());
        System.out.println("Aktuelle Geschwindigkeit dein Auto: " + yourCar.getCurrentSpeed());
        myCar.brake();
        myCar.brake();
        System.out.println("Aktuelle Geschwindigkeit mein Auto: " + myCar.getCurrentSpeed());
        System.out.println("Aktuelle Geschwindigkeit dein Auto: " + yourCar.getCurrentSpeed());

        System.out.println("Mein Auto ist ein " + myCar.BRAND
                            + " in " + myCar.getColor()
                            + " mit " + myCar.getHp() + " PS"
                            + " und die Preisklasse ist: " + myCar.getBrandPriceTag());

        System.out.println("Dein Auto ist ein " + yourCar.BRAND
                + " in " + yourCar.getColor()
                + " mit " + yourCar.getHp() + " PS"
                + " und die Preisklasse ist: " + yourCar.getBrandPriceTag());

        System.out.println("Ihr Auto ist ein " + herCar.BRAND
                + " in " + herCar.getColor()
                + " mit " + herCar.getHp() + " PS"
                + " und die Preisklasse ist: " + herCar.getBrandPriceTag());


        Car.printCarInfo(myCar);

        System.out.println("Aktuelle Anzahl an Autos: " + Car.getCarCount());

        System.gc();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Aktuelle Anzahl an Autos: " + Car.getCarCount());


        myCar = null;
        yourCar = null;
        herCar = null;

        System.gc();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Aktuelle Anzahl an Autos: " + Car.getCarCount());
    }
}
