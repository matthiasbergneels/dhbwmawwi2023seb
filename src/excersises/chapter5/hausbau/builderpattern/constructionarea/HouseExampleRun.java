package excersises.chapter5.hausbau.builderpattern.constructionarea;

import excersises.chapter5.hausbau.builderpattern.house.House;
import excersises.chapter5.hausbau.builderpattern.house.HouseBuilder;

public class HouseExampleRun {

  public static void main(String[] args) {

    System.out.println("Aktuelle Anzahl Häuser: " + House.getObjCnt());
    House myHouse = new HouseBuilder().buildFloors(5).buildDoors(3).buildWindows(20).setFloorSpace(300).buildFlatRoof().finalizeHouseBuilding();
    House yourHouse = new HouseBuilder().buildFloors(5).buildDoors(3).buildWindows(20).finalizeHouseBuilding();
    House herHouse = new HouseBuilder().setCity("München").setStreet("Hauptstraße").setHouseNumber("150A").setFloorSpace(150).finalizeHouseBuilding();

    System.out.println(myHouse);
    System.out.println(yourHouse);
    System.out.println(herHouse);

    System.out.println("Aktuelle Anzahl Häuser: " + House.getObjCnt());
  }
}
