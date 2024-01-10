package excersises.chapter5.hausbau.builderpattern.house;

public class House {
  final static int DEFAULT_DOOR = 1;
  final static int DEFAULT_WINDOW = 1;
  final static int DEFAULT_FLOOR = 1;
  final static int DEFAULT_FLOOR_SPACE = 100;
  final static String DEFAULT_STREET = "Coblitzallee";
  final static String DEFAULT_HOUSENUMBER = "7";
  final static int DEFAULT_ZIP_CODE = 69782;
  final static String DEFAULT_CITY = "Mannheim";

  private int doors;
  private int windows;
  private int floors;
  private int floorSpace;
  private String street;
  private String housenumber;
  private int zipCode;
  private String city;
  private boolean hasFlatRoof;

  private static int objCnt = 0;

  House(int doors, int windows, int floors, int floorSpace, String street, String housenumber, int zipCode, String city, boolean hasFlatRoof){
    this.setFloors(floors);
    this.setWindows(windows);
    this.setDoors(doors);
    this.setFloorSpace(floorSpace);
    this.setStreet(street);
    this.setHouseNumber(housenumber);
    this.setZipCode(zipCode);
    this.setCity(city);
    this.setHasFlatRoof(hasFlatRoof);

    objCnt++;
  }

  public int getDoors() {
    return doors;
  }
  public void setDoors(int doors) {
    this.doors = isNegativNumber(doors) ? DEFAULT_DOOR : doors;
  }
  public int getWindows() {
    return windows;
  }
  public void setWindows(int windows) {
    this.windows = isNegativNumber(windows) ? DEFAULT_WINDOW : windows;
  }
  public int getFloors() {
    return floors;
  }
  public void setFloors(int floors) {
    this.floors = isNegativNumber(floors) ? DEFAULT_FLOOR : floors;
  }
  public int getFloorSpace() {
    return floorSpace;
  }
  public void setFloorSpace(int floorSpace) {
    if(floorSpace >= 100 && floorSpace <= 500){
      this.floorSpace = floorSpace;
    }else{
      this.floorSpace = DEFAULT_FLOOR_SPACE;
    }
  }

  public String getStreet() {
    return street;
  }
  public void setStreet(String street) {
    this.street = isEmptyOrDefault(street, DEFAULT_STREET);
  }
  public String getHousenumber() {
    return housenumber;
  }
  public void setHouseNumber(String houseNumber) {
    this.housenumber = isEmptyOrDefault(houseNumber, DEFAULT_HOUSENUMBER);
  }
  public int getZipCode() {
    return zipCode;
  }
  public void setZipCode(int zipCode) {
    this.zipCode = isNegativNumber(zipCode) ? DEFAULT_ZIP_CODE : zipCode;
  }
  public String getCity() {
    return city;
  }
  public void setCity(String city) {
    this.city = isEmptyOrDefault(city, DEFAULT_CITY);
  }
  public boolean hasFlatRoof() {
    return hasFlatRoof;
  }
  public void setHasFlatRoof(boolean hasFlatRoof) {
    this.hasFlatRoof = hasFlatRoof;
  }

  private boolean isNegativNumber(int zahl){
    return (zahl > 0) ? false : true;
  }

  private String isEmptyOrDefault(String pruefen, String defaultString){
    return (pruefen == null || pruefen.isEmpty()) ? defaultString : pruefen;
  }

  @Override
  public String toString() {
    return "Hausinformationen: "
      + "Etagen: " + getFloors() + "; "
      + "Tueren: " + getDoors() + "; "
      + "Fenster: " + getWindows() + "; "
      + "Flaeche: " + getFloorSpace() + "qm; "
      + "Flachdach: " + (hasFlatRoof() ? "ja" : "nein") + "; "
      + "Adresse: " + getStreet() + " " + getHousenumber() + ", " + getZipCode() + " " + getCity()
      ;
  }

  @Override
  protected void finalize(){
    System.out.println("Das Haus " + this + " wurde abgerissen.");
    objCnt--;
  }

  public static int getObjCnt() {
    return objCnt;
  }
}