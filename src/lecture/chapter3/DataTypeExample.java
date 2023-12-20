package lecture.chapter3;

public class DataTypeExample {

    public static void main(String[] args) {

        int numberA;        // Deklaration --> Speicher-Allokation
        numberA = 5;        // Initialisierung

        int numberB = 10;   // Deklaration & Initialisierung
        numberB = 15;

        int numberC, numberD, numberE;
        double numberF = 5.0, numberG = 100.5, numberH;


        final double PI = 3.14;
        // PI = 5;

        final double E;
        E = 2.4;
        // E = 5;



        // Konvertierungsregeln

        double doubleNumberA = 5.0;
        float floatNumberB = 3.0f;

        //floatNumberB = doubleNumberA;

        doubleNumberA = floatNumberB;       // implizite Konvertierung von Float zu Double!
        floatNumberB = (float)doubleNumberA;// Explizite Konvertierung durch Type Cast von Double zu (Float)

        byte shortNumberC = 42;
        int intNumberD = 35;

        intNumberD = shortNumberC;         // implizite Konvertierung von Short zu Integer!


        intNumberD = 128;
        System.out.println("Bit-Überlauf");
        shortNumberC = (byte)intNumberD;   // Explizite Konvertierung durch Type Cast von Integer zu (Short)
        System.out.println(shortNumberC);
        System.out.println(intNumberD);

        doubleNumberA = 3.789;


        intNumberD = (int)doubleNumberA;
        System.out.println(doubleNumberA);
        System.out.println(intNumberD);

        byte byteNumberE;
        intNumberD = 257;

        byteNumberE = (byte)intNumberD;
        System.out.println(intNumberD);
        System.out.println(byteNumberE);

        intNumberD = 70;
        char sign = (char)intNumberD;
        System.out.println(sign);

        sign = 'A';
        intNumberD = sign;
        System.out.println(intNumberD);
        System.out.println(sign);


        float floatNumberF;
        long longNumberG = 123_456_789L;

        floatNumberF = longNumberG;
        System.out.println(longNumberG);
        System.out.println(floatNumberF);

    }
}
