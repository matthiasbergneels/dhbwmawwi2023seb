package lecture.chapter8;

public class UncheckExceptionExamples {

  public static void main(String[] args) {

    String[] words = new String[4];

    try {
      for (int i = 0; i <= words.length; i++) {
        words[i] = "Hallo " + i;
        System.out.println(words[i]);
      }
    }catch(IndexOutOfBoundsException e){
      System.out.println("lern zählen du Idiot!");
    }

    System.out.println("Ende :-)");

  }
}
