package lecture.chapter9;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExamples {

  public static void main(String[] args) {

    Map<Integer, String> colorMap = new TreeMap<>();

    colorMap.put(0xFF0000, "ROT");
    colorMap.put(0xF70000, "ROT");
    colorMap.put(0xFA0000, "ROT");
    colorMap.put(0x00FF00, "GRÜN");
    colorMap.put(0x0000FF, "BLAU");
    colorMap.put(0x2B2B2B, "SIGNAL_SCHWARZ");

    colorMap.put(0xFA0000, "PFIRSICH_ROT");

    System.out.println("Gelöscht: " + colorMap.remove(0xF70000));
    System.out.println("enthält Blau? " + colorMap.containsValue("BLAU"));

    System.out.println("Schlüssel: FF0000 -> " + colorMap.get(0xFF0000));

    Set<Integer> colorKeys = colorMap.keySet();

    for(int colorKey : colorKeys){
      System.out.println("Schlüssel: " + colorKey + "; Wert: " + colorMap.get(colorKey));
    }

  }
}
