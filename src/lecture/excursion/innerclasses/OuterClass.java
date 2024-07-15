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
      System.out.println("Nachricht: " + message + " from " + this.getClass() + " - Identifier " + identifier);
    }
  }

  private static final String CLASS_IDENTIFIER = "STATIC_CLASS_ATTRIBUTE_IDENTIFIER";
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
    String localText = "Lokaler Text aus Methode";
    class InnerLocalClass{

      private int count = 0;
      public void printMessage(String message){
        count++;
        String localText = "Lokaler Text in der inneren Klasse";
        System.out.println("Nachricht: " + message + " from " + this.getClass() + " - Identifier " + identifier);
        System.out.println("++++++" + localText + " from " + this.getClass());
      }
    }

    InnerLocalClass myInnerLocalClass = new InnerLocalClass();
    myInnerLocalClass.printMessage(message);
    System.out.println(myInnerLocalClass.count);
  }

  public void printMessageFromInnerAnonymousClass(String message){

    Printable myInnerAnonymousClass = new Printable() {

      private int counter = 0;
      @Override
      public void printMessage(String message) {
        counter++;
        System.out.println("Nachricht: " + message + " from " + this.getClass() + " - Identifier " + identifier + " - Counter: " + counter);
      }

      public void externallyUncallableMethod(){
        System.out.println("I can't get called externally!");
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

  public void printMessageFromLambdaFunction(String message){
    String localText = "Lokaler Text in Methode";

    Printable lambdaFunction = pMessage -> {
      //String localText = "";
      System.out.println("Nachricht: " + pMessage + " from " + this.getClass() + " - Identifier " + identifier);
      System.out.println(localText);
    };

    lambdaFunction.printMessage(message);
  }

  // InnerTopLevelClass
  static class InnerTopLevelClass{

    public void printMessage(String message){
      System.out.println("Nachricht: " + message + " from " + this.getClass() + " - static_Identifier " + CLASS_IDENTIFIER);
    }
  }

  // InnerElementClass
  class InnerElementClass{

    private int count = 0;
    public void printMessage(String message){
      count++;
      System.out.println("Nachricht: " + message + " from " + this.getClass() + " - Identifier " + identifier + " - static_Identifier " + CLASS_IDENTIFIER);
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
    System.out.println(myInnerElementClassInstanceOne.count);
    myInnerElementClassInstanceOne.printMessage(message);

    OuterClass.InnerElementClass myInnerElementClassInstanceTwo = myOuterClassTwo.new InnerElementClass();
    myInnerElementClassInstanceTwo.printMessage(message);

    myOuterClass.printMessageFromInnerLocalClass(message);
    myOuterClass.printMessageFromSecondInnerLocalClass(message);
    myOuterClassTwo.printMessageFromInnerLocalClass(message);
    myOuterClassTwo.printMessageFromSecondInnerLocalClass(message);

    myOuterClass.printMessageFromInnerAnonymousClass(message);

    myOuterClass.printMessageFromInnerAnonymousClassBasedOnAbstractClass(message);

    myOuterClass.printMessageFromLambdaFunction(message);

  }
}
