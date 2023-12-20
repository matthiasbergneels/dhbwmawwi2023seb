package lecture.chapter3;

public class ReferenceDatatypeExamples {
    public static void main(String[] args) {
        byte[] lottoNumbers = {6, 17, 33, 16, 9, 24};
        System.out.println(lottoNumbers[0]);

        byte[] lottoNumbersTomorrow;

        lottoNumbersTomorrow = lottoNumbers;

        lottoNumbersTomorrow[0] = 100;

        System.out.println("Lottozahlen morgen: " + lottoNumbersTomorrow[0]);
        System.out.println("Lottozahlen heute: " + lottoNumbers[0]);


        String text1 = "Hallo";
        String text2 = "World";
        String text3 = "Hallo";
        String text4 = new String("Hallo");

        System.out.println("text1: " + text1);
        System.out.println("text2: " + text2);
        System.out.println("text3: " + text3);
        System.out.println("text4: " + text4);

        System.out.println("Hallo == World: " + (text1 == text2));
        System.out.println("Hallo == Hallo: " + (text1 == text3));
        System.out.println("Hallo == Hallo: " + (text1 == text4));

        System.out.println("text1.equals(text2): " + text1.equals(text2));
        System.out.println("text1.equals(text3): " + text1.equals(text3));
        System.out.println("text1.equals(text4): " + text1.equals(text4));

        String text5 = text1;

        text5 = text5 + " Welt!";

        System.out.println("text5: " + text5);
        System.out.println("text1: " + text1);
    }
}
