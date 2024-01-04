package lecture.chapter6;

public class Animal {

  private String description;
  private float weight;
  private float size;

  public Animal(String description, float weight, float size) {
    setDescription(description);
    setWeight(weight);
    setSize(size);
  }

  public void breath(){
    System.out.println("Das Tier " + description + " atmet!");
  }

  public void eat(){
    System.out.println("Das Tier " + description + " frisst!");
  }

  public void move(){
    System.out.println("Das Tier " + description + " bewegt sich!");
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public float getWeight() {
    return weight;
  }

  public void setWeight(float weight) {
    this.weight = weight;
  }

  public float getSize() {
    return size;
  }

  public void setSize(float size) {
    this.size = size;
  }


  @Override
  public String toString(){
    return "Name: " + description + ", Gewicht: " + weight + ", Größe: " + size;
  }
}
