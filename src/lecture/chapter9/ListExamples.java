package lecture.chapter9;

import lecture.chapter5.Car;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ListExamples {

  public static void main(String[] args) {

    List<String> myNameList = new ArrayList();

    myNameList.add("Karl");
    //myNameList.add(new Car());
    myNameList.add("Fritz");
    myNameList.add("Gabi");
    myNameList.add("Monika");
    myNameList.add("Julius");
    myNameList.add("Monika");
    myNameList.add("Zeus");
    myNameList.add("Monika");
    //myNameList.add(new ArrayList());
    //myNameList.add(17);
    //myNameList.add('a');
    //myNameList.add(true);

    System.out.println("Anzahl Element: " + myNameList.size());

    System.out.println("Julius enthalten? " + myNameList.contains("Julius"));
    System.out.println("Franz enthalten? " + myNameList.contains("Franz"));

    System.out.println("Gelöscht: " + myNameList.remove(0));

    System.out.println("Monika gelöscht: " + myNameList.remove("Monika"));
    System.out.println("Monika enthalten? " + myNameList.contains("Monika"));



    // Sequentieller Ablauf über die Liste

    // Zählerschleife -> Wahlfreier Zugriff
    System.out.println("Iteration über For-Schleife:");
    for(int i = 0; i < myNameList.size(); i++){
      System.out.println(myNameList.get(i));
    }

    // For-Each
    System.out.println("Iteration über For-Each-Schleife:");
    for(String currentName : myNameList){
      System.out.println(currentName);
    }

    // Iterator
    System.out.println("Iteration über Iterator:");
    Iterator<String> myNameListeIterator = myNameList.iterator();
    while(myNameListeIterator.hasNext()){
      String currentName = myNameListeIterator.next();
      System.out.println(currentName);
    }






  }
}
