package lecture.chapter8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotEnoughFreeSlotsExceptionTest {

  @Test
  void NotEnoughFreeSlotsCreation() {
    // arrange

    // act
    NotEnoughFreeSlotsException e = new NotEnoughFreeSlotsException(50, 20);

    // assert
    assertEquals(20, e.freeRemainingSlots);
    assertEquals("Es wurde versucht 50 Plätze zu buchen, es sind aber nur 20 Plätze frei.", e.getMessage());
  }

}