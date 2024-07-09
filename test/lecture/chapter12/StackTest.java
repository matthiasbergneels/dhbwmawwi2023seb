package lecture.chapter12;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

  private static List<String> TEST_DATA = Arrays.asList(new String[]{"eins", "zwei", "drei", "vier", "fünf", "sechs"});
  @Test
  void queueTest() {

    Stack<String> testStack = new Stack<>();

    // validate size() & isEmpty()
    assertTrue(testStack.isEmpty());
    assertEquals(0, testStack.size());

    // fill Stack
    for(String word : TEST_DATA){
      testStack.push(word);
    }

    // validate size()
    assertEquals(TEST_DATA.size(), testStack.size());

    // clear Stack
    ListIterator<String> wordListIterator = TEST_DATA.listIterator(TEST_DATA.size());

    while(wordListIterator.hasPrevious()){
      assertEquals(wordListIterator.previous(), testStack.pop());
    }

    // validate size() & isEmpty()
    assertTrue(testStack.isEmpty());
    assertEquals(0, testStack.size());

  }
}