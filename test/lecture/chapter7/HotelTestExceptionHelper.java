package lecture.chapter7;

import org.junit.jupiter.api.function.Executable;

public class HotelTestExceptionHelper implements Executable {

  private Hotel testHotel;
  private int slotsToBook;

  public HotelTestExceptionHelper(Hotel testHotel, int slotsToBook){
    this.testHotel = testHotel;
    this.slotsToBook = slotsToBook;
  }

  @Override
  public void execute() throws Throwable {
      testHotel.book(slotsToBook);
  }
}
