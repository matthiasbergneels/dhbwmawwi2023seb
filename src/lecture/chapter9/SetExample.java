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
    System.out.println("Student Beispiel - Set");

    Set<Student> myStudentSet = new TreeSet<>();

    Student s1 = new Student(2812, "Frank", "Mayer");
    Student s2 = new Student(2812, "Frank", "Mayer");
    Student s3 = new Student(4711, "Gabi", "Müller");
    Student s4 = s1;

    System.out.println("s1 == s2: " + (s1 == s2));          // --> false
    System.out.println("s1.equals(s2): " + s1.equals(s2));  // --> true

    System.out.println("s1 == s3: " + (s1 == s3));          // --> false
    System.out.println("s1.equals(s3): " + s1.equals(s3));  // --> false

    System.out.println("s1 == s4: " + (s1 == s4));          // --> true
    System.out.println("s1.equals(s4): " + s1.equals(s4));  // --> true

    // TODO: 5 Studenten in das TreeSet einfügen + 1 Dublikat
    myStudentSet.add(s3);
    myStudentSet.add(new Student(7281, "Hans", "Schmidt"));
    myStudentSet.add(s1);
    myStudentSet.add(new Student(2831, "Monika", "Schmidt"));
    myStudentSet.add(s2);    // Dublikat
    myStudentSet.add(new Student(8382, "Zeus", "Müller"));
    myStudentSet.add(new Student(3331, "Monika", "Schmidt"));

    // TODO: Ausgabe der Menge über einen Iterator
    System.out.println("Ausgabe Studierende nach Matrikelnummer:");
    for(Student currentStudent : myStudentSet){
      System.out.println(currentStudent);
    }


    Set<Student> myStudentsByFamilyName = new TreeSet<>(new SortStudentByFamilyName());
    myStudentsByFamilyName.addAll(myStudentSet);

    System.out.println("Ausgabe Studierende nach Nachname:");
    for(Student currentStudent : myStudentsByFamilyName){
      System.out.println(currentStudent);
    }

  }
}
