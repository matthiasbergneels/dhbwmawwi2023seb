package lecture.chapter6;

public class OurLittleFarmRun {

  public static void main(String[] args) {

    //Animal myAnimal = new Animal("Klaus", 56f, 10f);
    Dog myDog = new Dog("Bello", 50f, 20f, "Schäferhund");
    Bird myBird = new Bird("Tweety", 5f, 0.56f, true);

    /*
    myAnimal.breath();
    myAnimal.eat();
    myAnimal.move();
    //myAnimal.bark();
    //myAnimal.tweet();
     */

    //System.out.println(myAnimal);

    myDog.breath();
    myDog.eat();
    myDog.eat(500.0f);
    myDog.move();
    myDog.bark();

    System.out.println(myDog);
    System.out.println(myDog.toString());

    myBird.breath();
    myBird.eat();
    myBird.move();
    myBird.tweet();

    System.out.println(myBird);


    // Narrowing Cast
    Animal myAnimal = myDog;

    myAnimal.move();

    // Narrowing Cast
    Object myObject = myDog;

    Animal[] shelter = new Animal[5];

    // Narrowing Cast
    shelter[0] = myDog;
    shelter[1] = myBird;
    shelter[2] = new Dog("Hasso", 40f, 25f, "Dackel");
    shelter[3] = new Bird("Tarnbir", 40f, 25f, true);
    shelter[4] = new Bird("Raphael", 40f, 25f, false);


    for(Animal currentAnimal : shelter){

      // Polymorphie
      currentAnimal.breath();
      currentAnimal.eat();
      currentAnimal.move();

      System.out.println(currentAnimal.toString());

      //currentAnimal.bark();
      if(currentAnimal instanceof Dog){
        // Widening Cast
        Dog currentDog = (Dog)currentAnimal;
        currentDog.bark();
      } else {
        System.out.println("Kein Hund!");
      }

      // Prüfung durch instanceof und widening cast bei "true"
      if(currentAnimal instanceof Bird currentBird){
        currentBird.tweet();
      }

    }

  }
}
