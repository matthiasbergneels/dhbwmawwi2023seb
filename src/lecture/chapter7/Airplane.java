package lecture.chapter7;

public class Airplane implements Bookable{

  // false = frei / true = besetzt
  private boolean[] seats;

  public Airplane(int slots){
    seats = new boolean[slots];
  }

  public void fly(){
    System.out.println("Und ich flieg, flieg, flieg... *sing* ");
  }

  @Override
  public boolean book(int slots) {
    if(freeSlots() >= slots){
      for(int i = 0; i < seats.length; i++){
        if(!seats[i]){
          seats[i] = true;
          slots--;
        }
        if(slots <= 0){
          return true;
        }
      }
    }
    return false;
  }

  @Override
  public int freeSlots() {
    int freeSlots = 0;
    for(boolean seat : seats){
      if(!seat){
        freeSlots++;
      }
    }
    return freeSlots;
  }
}
