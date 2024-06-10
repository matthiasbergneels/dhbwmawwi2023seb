package lecture.chapter9;

import java.util.Comparator;
import java.util.Objects;

public class Student implements Comparable<Student>{
  private int id;
  private String name;
  private String familyName;


  public final static Comparator<Student> SORT_BY_NAME_CHARACTER_COUNT = (s1, s2) -> {
    return (s1.familyName.length() + s1.name.length()) - (s2.familyName.length() + s2.name.length());
  };

  /*
  public static Comparator<Student> SORT_BY_NAME_CHARACTER_COUNT = new Comparator<Student>() {
    @Override
    public int compare(Student o1, Student o2) {
      return 0;
    }
  };
   */

  public Student(int id, String name, String familyName) {
    this.id = id;
    this.name = name;
    this.familyName = familyName;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFamilyName() {
    return familyName;
  }

  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }

  @Override
  public String toString() {
    return "Student{" +
      "id=" + id +
      ", name='" + name + '\'' +
      ", familyName='" + familyName + '\'' +
      '}';
  }

  @Override
  public int compareTo(Student o) {
    if(this.id - o.id != 0){
      return this.id - o.id;
    }

    if(this.familyName.compareTo(o.familyName) != 0){
      return this.familyName.compareTo(o.familyName);
    }

    if(this.name.compareTo(o.name) != 0){
      return this.name.compareTo(o.name);
    }

    return 0;
  }

  /*
  @Override
  public boolean equals(Object obj) {

    // Alias-Check
    if (this == obj) {
      return true;
    }
    // Test auf null
    if (obj == null){
      return false;
    }
    // Typverträglichkeit
    if(!(obj instanceof Student)){
      return false;
    }

    Student s = (Student)obj;

    if(this.id != s.id){
      return false;
    }

    if(!this.name.equals(s.name)){
      return false;
    }

    if(!this.familyName.equals(s.familyName)){
      return false;
    }

    return true;
  }

   */

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Student student = (Student) o;

    if (id != student.id) return false;
    if (!Objects.equals(name, student.name)) return false;
      return Objects.equals(familyName, student.familyName);
  }

  /*
  @Override
  public int hashCode() {
    return this.id ^ this.name.hashCode() ^ this.familyName.hashCode();
  }

   */

  @Override
  public int hashCode() {
    int result = id;
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (familyName != null ? familyName.hashCode() : 0);
    return result;
  }
}
