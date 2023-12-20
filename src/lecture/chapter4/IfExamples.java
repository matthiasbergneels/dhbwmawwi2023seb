package lecture.chapter4;

public class IfExamples {

    public static void main(String[] args) {

        int numberA = 10;
        int numberB = 5;

        if(numberA < numberB) {
            System.out.println("Kleinere Zahl: ");
            System.out.println(numberA);
        } else {
            System.out.println("Kleinere Zahl: ");
            System.out.println(numberB);
        }

        System.out.println("Ende");


        int speed = 25;

        if(speed > 30 && speed <= 50){
            System.out.println("So fährt man anständig");
        }else if(speed > 0 && speed <= 30){
            System.out.println("Schon ein bisschen lahm!");
        }else if(speed > 50 && speed <= 70){
            System.out.println("Das ist jetzt schon etwas schnell");
        }else if(speed > 70 && speed <= 100){
            System.out.println("Das war zu schnell!");
            System.out.println("Jetzt ist der Führerschein weg!!");
        }else{
            System.out.println("Ungültige Geschwindigkeit - Auto kaputt!");
        }

    }
}
