package lecture.excursion.innerclasses;

public class OuterClass {

  interface Printable{
    void printMessage(String message);
  }

  abstract class AbstractInnerElementClass{
    abstract void printMessage(String message);
  }

  class ImplementAbstractInnerClass extends AbstractInnerElementClass{

    @Override
    void printMessage(String message) {

    }
  }

  private final int identifier;

  public OuterClass(int identifier){
      this.identifier = identifier;
  }

  public void printMessageFromInnerLocalClass(String message){
    class InnerLocalClass{
      public void printMessage(String message){
        System.out.println("Nachricht: " + message + " from " + this.getClass() + " - Identifier " + identifier);
      }
    }

    InnerLocalClass myInnerLocalClass = new InnerLocalClass();
    myInnerLocalClass.printMessage(message);
  }

  public void printMessageFromSecondInnerLocalClass(String message){
    class InnerLocalClass{
      public void printMessage(String message){
        System.out.println("Nachricht: " + message + " from " + this.getClass() + " - Identifier " + identifier);
      }
    }

    InnerLocalClass myInnerLocalClass = new InnerLocalClass();
    myInnerLocalClass.printMessage(message);
  }

  public void printMessageFromInnerAnonymousClass(String message){

    Printable myInnerAnonymousClass = new Printable() {

      private int counter = 0;
      @Override
      public void printMessage(String message) {
        counter++;
        System.out.println("Nachricht: " + message + " from " + this.getClass() + " - Identifier " + identifier + " - Counter: " + counter);
      }
    };

    myInnerAnonymousClass.printMessage(message);
    myInnerAnonymousClass.printMessage(message);
    myInnerAnonymousClass.printMessage(message);

  }

  public void printMessageFromInnerAnonymousClassBasedOnAbstractClass(String message){

    AbstractInnerElementClass myInnerAnonymousClass = new AbstractInnerElementClass() {
      @Override
      void printMessage(String message) {
        System.out.println("Nachricht: " + message + " from " + this.getClass() + " - Identifier " + identifier);
      }
    };

    myInnerAnonymousClass.printMessage(message);
  }

  // InnerTopLevelClass
  static class InnerTopLevelClass{

    public void printMessage(String message){
      System.out.println("Nachricht: " + message + " from " + this.getClass());
    }
  }

  // InnerElementClass
  class InnerElementClass{
    public void printMessage(String message){
      System.out.println("Nachricht: " + message + " from " + this.getClass() + " - Identifier " + identifier);
    }
  }

  public void printMessage(String message){
    System.out.println("Nachricht: " + message + " from " + this.getClass());
  }


  public static void main(String[] args) {
    String message = "Nachricht von den Klassen!";

    OuterClass myOuterClass = new OuterClass(4711);
    OuterClass myOuterClassTwo = new OuterClass(5500);
    myOuterClass.printMessage(message);

    OuterClass.InnerTopLevelClass myInnerTopLevelClass = new InnerTopLevelClass();

    myInnerTopLevelClass.printMessage(message);

    OuterClass.InnerElementClass myInnerElementClassInstanceOne = myOuterClass.new InnerElementClass();
    myInnerElementClassInstanceOne.printMessage(message);

    OuterClass.InnerElementClass myInnerElementClassInstanceTwo = myOuterClassTwo.new InnerElementClass();
    myInnerElementClassInstanceTwo.printMessage(message);

    myOuterClass.printMessageFromInnerLocalClass(message);
    myOuterClass.printMessageFromSecondInnerLocalClass(message);
    myOuterClassTwo.printMessageFromInnerLocalClass(message);
    myOuterClassTwo.printMessageFromSecondInnerLocalClass(message);

    myOuterClass.printMessageFromInnerAnonymousClass(message);

    myOuterClass.printMessageFromInnerAnonymousClassBasedOnAbstractClass(message);
  }
}
