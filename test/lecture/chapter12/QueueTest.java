package lecture.chapter12;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest{

  private static List<String> TEST_DATA = Arrays.asList(new String[]{"eins", "zwei", "drei", "vier", "fünf", "sechs"});
  @Test
  void queueTest() {

    Queue<String> testQueue = new Queue<>();

    // validate size() & isEmpty()
    assertTrue(testQueue.isEmpty());
    assertEquals(0, testQueue.size());

    // fill queue
    for(String word : TEST_DATA){
      testQueue.enqueue(word);
    }

    // validate size()
    assertEquals(TEST_DATA.size(), testQueue.size());

    // dequeue
    for(String word : TEST_DATA){
      assertEquals(word, testQueue.dequeue());
    }

    // validate size() & isEmpty()
    assertTrue(testQueue.isEmpty());
    assertEquals(0, testQueue.size());

  }
}