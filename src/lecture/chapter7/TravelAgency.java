package lecture.chapter7;

import lecture.chapter8.NotEnoughFreeSlotsException;

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

      try {
        System.out.println("Freie Plätze: " + currentBookableEntity.freeSlots());
        currentBookableEntity.book(55);
        System.out.println("Es wurden erfolgreich 55 Plätze gebucht!");
      } catch (NotEnoughFreeSlotsException e){
        System.out.println("Buchen ist fehlgeschlagen");
        System.out.println(e.getMessage());

        //currentBookableEntity.book(e.freeRemainingSlots);
        return;
      } catch (Exception e) {
        // generischer Catch-Block für alle Ausnahmen
        System.out.println("Fehler :-( ");
      } finally {
        System.out.println("Dieser Code wird IMMER! durchlaufen!");
      }

      if(currentBookableEntity instanceof Airplane currentAirplane){
        currentAirplane.fly();
      }
    }



  }

}
