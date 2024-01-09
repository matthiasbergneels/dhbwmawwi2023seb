package lecture.chapter7;

public class Hotel implements PriorityBookable{

  private int slots;
  private int bookedSlots;

  public Hotel(int slots){
    this.slots = slots;
    this.bookedSlots = 0;
  }

  public void cleanRooms(){
    System.out.println("und ich putz, putz, putz... *sing*");
  }

  @Override
  public boolean book(int slots) {
    if(freeSlots() >= slots){
      bookedSlots += slots;
      return true;
    }

    return false;
  }

  @Override
  public int freeSlots() {
    return slots - bookedSlots;
  }

  @Override
  public boolean priorityBooking(int slots) {
    return false;
  }
}
