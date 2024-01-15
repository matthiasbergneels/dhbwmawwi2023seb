package lecture.excursion.var;

import excersises.chapter5.hausbau.builderpattern.house.HouseBuilder;

public class VarExamples {

  public static void main(String[] args) {

    int numberA; // Deklaration einer Integer-Variable
    int numberB = 10; // Deklaration und Initialisierung einer Integer-Variable

    var numberC = 15;   // Implizite Deklaration und Initialisierung einer Integer-Variable
    var numberD = 2.0;  // Implizite Deklaration und Initialisierung einer Double-Variable
    var numberE = 2.0f;  // Implizite Deklaration und Initialisierung einer Float-Variable

    // var numberF; --> Deklaration mit var setzt eine Initialisierung voraus

    var text = "Hier steht ein Text";

    var myHouse = new HouseBuilder().buildFloors(3).buildDoors(2).finalizeHouseBuilding();





  }
}
