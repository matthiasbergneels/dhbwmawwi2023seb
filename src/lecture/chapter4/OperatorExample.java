package lecture.chapter4;

public class OperatorExample {

    public static void main(String[] args) {

        int numberA = 5;
        int numberB = 9;
        double numberC = 9;

        int result = numberA + numberB;     // ==> 14

        result = numberA % numberB;         // ==> 5
        result = numberA / numberB;         // ==> 0
        System.out.println(result);

        double doubleResult = numberA / (float)numberB;    // ==> 0.0
        System.out.println(doubleResult);

        // result = numberA / numberC;
        doubleResult = numberA / numberC;    // ==> 0.55555555
        System.out.println(doubleResult);

        System.out.println("numberA: " + numberA);
        numberA++;                                  // numberA = numberA + 1;
        System.out.println("numberA: " + numberA);


        result = numberA++ + numberB + numberA;
        System.out.println(result);
        System.out.println("numberA: " + numberA);

        // result = numberA++ + ++numberA + numberA++;      // nicht machen! :-)



        numberA *= numberB;                 // ==> numberA = numberA * numberB;
        System.out.println(numberA);


        boolean isRaining = false;

        System.out.println("Brauche ich einen Regenschirm? " + isRaining);
        System.out.println("Brauche ich einen Regenschirm? " + (isRaining ? "Ja" : "Nein"));

        numberB = 100;
        int biggerNumber = (numberA >= numberB) ? numberA : numberB;
        System.out.println("Die größere Zahl ist: " + biggerNumber);

        String text1 = "Hallo";
        String text2 = "Welt!";

        String textResult = text1 + " " + text2;      // String-Verkettung mit +-Operator
        System.out.println(textResult);

        textResult = numberA + numberB + textResult + numberA + numberB;
        System.out.println(textResult);

    }
}
