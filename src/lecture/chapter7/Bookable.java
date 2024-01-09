package lecture.chapter7;

public interface Bookable {

  boolean book(int slots);
  public abstract int freeSlots();
  default boolean reserveSlots(int slots){
    return false;
  };

}
