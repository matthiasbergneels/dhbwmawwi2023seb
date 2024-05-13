package lecture.chapter8;

public class NotEnoughFreeSlotsException extends Exception{

  public final int freeRemainingSlots;

  public NotEnoughFreeSlotsException(int slotsToBook, int freeRemainingSlots){
    super("Es wurde versucht " + slotsToBook + "Plätze zu buchen, es sind aber nur "
                                + freeRemainingSlots + " Plätze frei.");

    this.freeRemainingSlots = freeRemainingSlots;
  }
}
