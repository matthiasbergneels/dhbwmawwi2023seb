package excersises.chapter5.hausbau.builderpattern.house;

public class HouseBuilder {

  private House constructionHouse;

  public HouseBuilder() {
    //private House(int doors, int windows, int floors, int floorSpace, String street, String housenumber, int zipCode, String city, boolean hasFlatRoof){
    constructionHouse = new House(House.DEFAULT_DOOR, House.DEFAULT_WINDOW, House.DEFAULT_FLOOR, House.DEFAULT_FLOOR_SPACE, House.DEFAULT_STREET, House.DEFAULT_HOUSENUMBER, House.DEFAULT_ZIP_CODE, House.DEFAULT_CITY, false);
  }

  public HouseBuilder buildDoors(int doors) {
    constructionHouse.setDoors(doors);
    return this;
  }

  public HouseBuilder buildWindows(int windows) {
    constructionHouse.setWindows(windows);
    return this;
  }

  public HouseBuilder buildFloors(int floors) {
    constructionHouse.setFloors(floors);
    return this;
  }

  public HouseBuilder setFloorSpace(int floorSpace) {
    constructionHouse.setFloorSpace(floorSpace);
    return this;
  }

  public HouseBuilder buildFlatRoof() {
    constructionHouse.setHasFlatRoof(true);
    return this;
  }

  public HouseBuilder setAddress(String street, String houseNumber, String city, int zipCode) {
    constructionHouse.setStreet(street);
    constructionHouse.setHouseNumber(houseNumber);
    constructionHouse.setCity(city);
    constructionHouse.setZipCode(zipCode);

    return this;
  }

  public HouseBuilder setStreet(String street) {
    constructionHouse.setStreet(street);
    return this;
  }

  public HouseBuilder setCity(String city) {
    constructionHouse.setCity(city);
    return this;
  }

  public HouseBuilder setZipCode(int zipCode) {
    constructionHouse.setZipCode(zipCode);
    return this;
  }

  public HouseBuilder setHouseNumber(String houseNumber) {
    constructionHouse.setHouseNumber(houseNumber);
    return this;
  }

  public House finalizeHouseBuilding() {
    return constructionHouse;
  }
}
