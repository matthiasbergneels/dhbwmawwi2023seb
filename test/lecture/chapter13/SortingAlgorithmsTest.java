package lecture.chapter13;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SortingAlgorithmsTest {

  static int count = 50000;
  static int randomRange = 3000000;
  static int[] toSort = null;

  @Nested
  @DisplayName("Standard Sort cases on random generated Arrays")
  class StandardRandomSortCases {
    @BeforeAll
    static void setUp() {
      generateArray();
    }

    @Test
    void bubbleSort() {
      int[] bubbleSortedArray = SortingAlgorithms.bubbleSort(toSort.clone());
      assertTrue(isSorted(bubbleSortedArray));
    }

    @Test
    void bubbleSortV2() {
      int[] bubbleSortedArray = SortingAlgorithms.bubbleSortV2(toSort.clone());
      assertTrue(isSorted(bubbleSortedArray));
    }

    @Test
    void bubbleSortV3() {
      int[] bubbleSortedArray = SortingAlgorithms.bubbleSortV3(toSort.clone());
      assertTrue(isSorted(bubbleSortedArray));
    }

    @Test
    void selectionSort() {
      int[] bubbleSortedArray = SortingAlgorithms.selectionSort(toSort.clone());
      assertTrue(isSorted(bubbleSortedArray));
    }


    @Test
    void quickSort() {
      int[] bubbleSortedArray = SortingAlgorithms.quickSort(toSort.clone());
      assertTrue(isSorted(bubbleSortedArray));
    }

  }


  @Nested
  @DisplayName("Sort cases on ordered Arrays")
  class SortCasesOnOrderdArrays {
    @BeforeAll
    static void setUp() {
      generateOrderedArray();
    }

    @Test
    void bubbleSort() {
      int[] bubbleSortedArray = SortingAlgorithms.bubbleSort(toSort.clone());
      assertTrue(isSorted(bubbleSortedArray));
    }

    @Test
    void bubbleSortV2() {
      int[] bubbleSortedArray = SortingAlgorithms.bubbleSortV2(toSort.clone());
      assertTrue(isSorted(bubbleSortedArray));
    }

    @Test
    void bubbleSortV3() {
      int[] bubbleSortedArray = SortingAlgorithms.bubbleSortV3(toSort.clone());
      assertTrue(isSorted(bubbleSortedArray));
    }

    @Test
    void selectionSort() {
      int[] bubbleSortedArray = SortingAlgorithms.selectionSort(toSort.clone());
      assertTrue(isSorted(bubbleSortedArray));
    }

    @Test
    void quickSort() {
      int[] bubbleSortedArray = SortingAlgorithms.quickSort(toSort.clone());
      assertTrue(isSorted(bubbleSortedArray));
    }
  }

  @Nested
  @DisplayName("Sort cases on reverse ordered Arrays")
  @Disabled
  class SortCasesOnReverseOrderdArrays {
    @BeforeAll
    static void setUp() {
      generateReverseOrderedArray();
    }

    @Test
    void bubbleSort() {
      int[] bubbleSortedArray = SortingAlgorithms.bubbleSort(toSort.clone());
      assertTrue(isSorted(bubbleSortedArray));
    }

    @Test
    void bubbleSortV2() {
      int[] bubbleSortedArray = SortingAlgorithms.bubbleSortV2(toSort.clone());
      assertTrue(isSorted(bubbleSortedArray));
    }

    @Test
    void bubbleSortV3() {
      int[] bubbleSortedArray = SortingAlgorithms.bubbleSortV3(toSort.clone());
      assertTrue(isSorted(bubbleSortedArray));
    }

    @Test
    void selectionSort() {
      int[] bubbleSortedArray = SortingAlgorithms.selectionSort(toSort.clone());
      assertTrue(isSorted(bubbleSortedArray));
    }

    @Test
    void quickSort() {
      int[] bubbleSortedArray = SortingAlgorithms.quickSort(toSort.clone());
      assertTrue(isSorted(bubbleSortedArray));
    }
  }


  // Helper Methods
  private static void generateOrderedArray() {
    toSort = new int[count];
    for(int i = 0; i < count; i++){
      toSort[i] = i + 1;
    }
  }

  private static void generateReverseOrderedArray() {
    toSort = new int[count];
    for(int i = 0; i < count; i++){
      toSort[i] = toSort.length - i;
    }
  }

  private static boolean isSorted(int[] array){
    for(int i = 0; i < array.length-1; i++){
      if(array[i] > array[i+1]){
        return false;
      }
    }
    return true;
  }


  private static void generateArray(){
    toSort = new int[count];
    for(int i = 0; i < count; i++){
      boolean notInserted = true;
      while(notInserted){
        int randomNumber = (int)(Math.random() * randomRange);

        boolean found = false;
        for(int j = 0; j < i; j++){
          if(toSort[j] == randomNumber){
            found = true;
            break;
          }
        }

        if(!found){
          toSort[i] = randomNumber;
          notInserted = false;
        }

      }
    }
  }
}