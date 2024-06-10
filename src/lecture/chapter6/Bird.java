package lecture.chapter6;

public class Bird extends Animal{

  private boolean canFly;

  public Bird(String description, float weight, float size, boolean canFly) {
    super(description, weight, size);
    setCanFly(canFly);
  }

  public void tweet(){
    System.out.println("Der Vogel " + getDescription() + " zwitschert! *trillili*");
  }

  public boolean isCanFly() {
    return canFly;
  }

  public void setCanFly(boolean canFly) {
    this.canFly = canFly;
  }

  @Override
  public void breath() {
      System.out.println("Der Vogel " + getDescription() + "atmet!");
  }

  @Override
  public boolean equals(Object obj) {
    if(this == obj){
      return true;
    }

    if(!super.equals(obj)){
      return false;
    }

    Bird a = (Bird)obj;

    if(this.canFly != a.canFly){
      return false;
    }

    return true;
  }
}
