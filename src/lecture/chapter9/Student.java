package lecture.chapter9;

public class Student implements Comparable<Student>{
  private int id;
  private String name;
  private String familyName;

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

  @Override
  public boolean equals(Object obj) {

    if(this == obj){
      return true;
    }

    if(obj == null){
      return false;
    }

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
}
