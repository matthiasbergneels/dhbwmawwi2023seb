package lecture.chapter7.clone;

public class CloneMachineRun {

  public static void main(String[] args) throws CloneNotSupportedException {
    Sheep dolly = new Sheep("Dolly", 5);
    System.out.println("Dolly: " + dolly);

    Sheep clonedDolly = dolly.clone();
    System.out.println("Cloned Dolly: " + clonedDolly);
  }
}
