package lecture.chapter9;

public class Student {
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
}
