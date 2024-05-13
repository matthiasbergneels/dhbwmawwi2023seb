package lecture.chapter7;

import lecture.chapter8.NotEnoughFreeSlotsException;

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
  public void book(int slots) throws NotEnoughFreeSlotsException{

    if(slots > freeSlots()){
      NotEnoughFreeSlotsException notEnoughFreeSlots = new NotEnoughFreeSlotsException(slots, freeSlots());
      throw notEnoughFreeSlots;
    }

    bookedSlots += slots;
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
