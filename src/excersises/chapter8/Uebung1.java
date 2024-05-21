package excersises.chapter8;

import java.io.FileWriter;
import java.io.IOException;

public class Uebung1 {
  public static void main(String[] args) { // throws IOException {
    FileWriter datei = null;
    String text;

    try {
      datei = new FileWriter("ausgabe.txt");

      text = "1\n";

      for(int i = 2; i <=100; i++){
        text += i;
        text += "\n";
      }

      datei.write(text, 0, text.length());
      datei.flush();

    }catch (IOException e){
      System.out.println("Fehler beim anlegen / öffnen der Datei!");
    }finally {
      // finally zum aufräumen von benötigten Resourcen
      try {
        datei.close();
      }catch (IOException e){
        System.out.println("Fehler beim schließen der Datei!");
      }
    }


    try (FileWriter datei2 = new FileWriter("ausgabe.txt")) {

      text = "1\n";

      for(int i = 2; i <=100; i++){
        text += i;
        text += "\n";
      }

      datei2.write(text, 0, text.length());
      datei2.flush();

    }catch (IOException e){
      System.out.println("Fehler beim anlegen / öffnen der Datei!");
    }

  }
}