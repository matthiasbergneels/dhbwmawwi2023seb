package lecture.chapter6;

import lecture.chapter9.Student;

public abstract class Animal {

  private String description;
  private float weight;
  private float size;

  public Animal(String description, float weight, float size) {
    setDescription(description);
    setWeight(weight);
    setSize(size);
  }

  public abstract void breath();

  public void eat(){
    System.out.println("Das Tier " + description + " frisst!");
  }

  final public void move(){
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

  @Override
  public boolean equals(Object obj) {
    if(this == obj){
      return true;
    }

    if(obj == null){
      return false;
    }

    if(this.getClass() != obj.getClass()){
      return false;
    }

    Animal a = (Animal)obj;

    if(this.size != a.size){
      return false;
    }

    if(this.weight != a.weight){
      return false;
    }

    if(!this.description.equals(a.description)){
      return false;
    }

    return true;
  }
}
