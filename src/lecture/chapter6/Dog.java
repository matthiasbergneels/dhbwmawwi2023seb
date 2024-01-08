package lecture.chapter6;

public final class Dog extends Animal{

  private String breed;

  public Dog(String description, float weight, float size, String breed) {
    super(description, weight, size);
    setBreed(breed);
  }

  public void bark(){
    System.out.println("Der Hund " + getDescription() + " bellt! *wuff*");
  }

  @Override
  public void breath() {
    System.out.println("Der Hund " + getDescription() + "atmet!");
  }

  @Override
  public void eat(){
    super.eat();
    System.out.println("und zwar Fleisch");
  }

  public void eat(float amount){
    this.eat();
    System.out.println("Menge: " + amount + " g");
  }

  public String getBreed() {
    return breed;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }

  @Override
  public String toString(){
    return super.toString() + ", Rasse: " + breed;
  }
}
