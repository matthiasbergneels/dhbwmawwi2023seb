package lecture.chapter7;

public class TravelAgency {

  public static void main(String[] args) {

    Airplane myAirplane = new Airplane(250);

    myAirplane.fly();
    System.out.println(myAirplane.freeSlots());

    Bookable[] bookableEntities = new Bookable[5];

    // narrowing Cast
    bookableEntities[0] = myAirplane;
    bookableEntities[1] = new Hotel(100);
    bookableEntities[2] = new Hotel(500);
    bookableEntities[3] = new Airplane(50);
    bookableEntities[4] = new Airplane(750);

    for(Bookable currentBookableEntity : bookableEntities){
      // Polymorphie mit Interfaces
      System.out.println("Freie Plätze: " + currentBookableEntity.freeSlots());
      boolean isBooked = currentBookableEntity.book(55);
      if(isBooked){
        System.out.println("Erfolgreich gebucht - restliche freie Plätze: " + currentBookableEntity.freeSlots());
      } else {
        System.out.println("Nicht genug freie Plätze!");
      }

      if(currentBookableEntity instanceof Airplane currentAirplane){
        currentAirplane.fly();
      }
    }



  }

}
