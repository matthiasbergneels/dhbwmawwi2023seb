package lecture.chapter7;

import lecture.chapter8.NotEnoughFreeSlotsException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

  @Test
  void book() {
    // arrange
    Hotel testHotel = new Hotel(50);
    NotEnoughFreeSlotsException notEnoughFreeSlotsException = null;

    // act
      try {
          testHotel.book(55);
      } catch (NotEnoughFreeSlotsException e) {
          notEnoughFreeSlotsException = e;
      }

      // assert
      assertNotNull(notEnoughFreeSlotsException);
  }

  @Test
  void bookWithAssertExceptionHandling() {
    // arrange
    Hotel testHotel = new Hotel(50);

    // act & assert
    NotEnoughFreeSlotsException e = (NotEnoughFreeSlotsException) assertThrows(NotEnoughFreeSlotsException.class, new HotelTestExceptionHelper(testHotel, 55));
    assertEquals(50, e.freeRemainingSlots);
  }

  @Test
  void bookWithOutException(){
    // arrange
    Hotel testHotel = new Hotel(50);

    // act & assert
    assertDoesNotThrow(new HotelTestExceptionHelper(testHotel, testHotel.freeSlots()));

  }

  @Test
  void bookWithAssertionThrowsLambda(){
    // arrange
    Hotel testHotel = new Hotel(50);

    // act & arrange
    assertThrows(NotEnoughFreeSlotsException.class, ()-> testHotel.book(55));
  }

  @Test
  void bookWithAssertionThrowsInnerAnonymousClass(){
    // arrange
    Hotel testHotel = new Hotel(50);

    // act & arrange
    //assertThrows(NotEnoughFreeSlotsException.class, TODO);
  }
}