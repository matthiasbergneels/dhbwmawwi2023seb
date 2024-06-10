package lecture.chapter9;

import java.util.Comparator;

public class SortStudentByFamilyName implements Comparator<Student> {


  @Override
  public int compare(Student o1, Student o2) {

    if(o1.getFamilyName().compareTo(o2.getFamilyName()) != 0){
      return o1.getFamilyName().compareTo(o2.getFamilyName());
    }

    if(o1.getName().compareTo(o2.getName()) != 0){
      return o1.getName().compareTo(o2.getName());
    }

    if(o1.getId() - o2.getId() != 0){
      return o1.getId() - o2.getId();
    }

    return 0;
  }
}
