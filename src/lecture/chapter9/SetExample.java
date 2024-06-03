package lecture.chapter9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

  public static void main(String[] args) {

    Set<String> mySetNames = new TreeSet<>();

    mySetNames.add("Gabi");
    mySetNames.add("Zeus");
    mySetNames.add("Frank");
    mySetNames.add("Monika");
    mySetNames.add("Gabi");
    mySetNames.add("Klaus");


    System.out.println("Größe der Menge: " + mySetNames.size());

    System.out.println("Ausgabe über For-Each");
    for(String currentName : mySetNames){
      System.out.println(currentName);
    }

    System.out.println("Ausgabe über Iterator");
    Iterator<String> mySetNamesIterator = mySetNames.iterator();
    while(mySetNamesIterator.hasNext()){
      String currentName = mySetNamesIterator.next();
      System.out.println(currentName);
    }


    // Student Set

    Set<Student> myStudentSet = new TreeSet<>();

    // TODO: 5 Studenten in das TreeSet einfügen + 1 Dublikat
    myStudentSet.add(new Student(4711, "Gabi", "Müller"));

    // TODO: Ausgabe der Menge über einen Iterator
    

  }
}
