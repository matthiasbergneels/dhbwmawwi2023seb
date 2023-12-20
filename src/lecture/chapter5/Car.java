package lecture.chapter5;

public class Car {

    // Attribute
    private String color;
    private int hp;
    private double currentSpeed;
    public final Brand BRAND;
    private byte doorCount;

    // Klassenattribute
    private static int carCount;

    // finale Klassenattribute
    public static final String COLOR_RED = "ROT";
    public static final String COLOR_BLUE = "BLAU";
    public static final String COLOR_BLACK = "SCHWARZ";
    public static final String COLOR_WHITE = "WEISS";
    public static final String COLOR_GREY = "GRAU";


    static{
        // Lade aktuelle CarCount aus Datenbank
        System.out.println("Initialisierungsblock für die Klasse Car");
        carCount = 0;
    }


    {
        System.out.println("Initialisierungsblock vor dem Konstruktor");
        currentSpeed = 0;
    }

    // Konstruktoren
    public Car(String color, Brand brand, int hp, byte doorCount){
        this.color = color;
        BRAND = brand;
        this.hp = hp;
        this.doorCount = doorCount;

        carCount++;
    }



    public Car(){
        this("Schwarz", Brand.TESLA, 500, (byte)5);
        /*color = "Schwarz";
        BRAND = "Tesla";
        hp = 500;
        doorCount = 5;

        currentSpeed = 0;
         */
    }

    // Methoden
    public void accelerate(double speedDelta){
        this.currentSpeed += speedDelta;
    }

    public void brake(){
        currentSpeed -= 10;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public String getColor(){
        return color;
    }

    public int getHp(){
        return hp;
    }

    public void setColor(String color){
        if(color.equals(COLOR_BLUE) ||
            color.equals(COLOR_BLACK)||
            color.equals(COLOR_RED)||
            color.equals(COLOR_GREY)||
            color.equals(COLOR_WHITE)){
            this.color = color;
        } else {
            this.color = COLOR_BLACK;
        }
    }

    protected void setHp(int pHp){
        // TODO
    }

    public String getBrandPriceTag(){
        return BRAND.getPriceTag();
    }

    @Override
    protected void finalize() throws Throwable {
        carCount--;
        System.out.println("Das Auto von der Marke " + this.BRAND + " mit " + this.hp + " PS wird verschrottet.");
    }

    // Klassen-Methoden
    public static int getCarCount(){
        return carCount;
    }

    public static void printCarInfo(Car carToPrint){
        System.out.println("Autodetails:");
        System.out.println("Marke: " + carToPrint.BRAND);
        System.out.println("Farbe: " + carToPrint.color);
        System.out.println("Leistung: " + carToPrint.hp);
        System.out.println("Aktuelle Geschwindigkeit: " + carToPrint.currentSpeed);
    }


}
