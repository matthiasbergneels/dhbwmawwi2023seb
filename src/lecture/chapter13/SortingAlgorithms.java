package lecture.chapter13;
public class SortingAlgorithms {

  static long quickSortSwapCount = 0;

  public static void main(String[] args) {

    int[] toSort = {50, 70, 100, 80, 40, 30, 20, 10 ,60};
    System.out.println("Unsortiert: ");
    printArray(toSort);


    System.out.println("Sortierte Arrays:");
    System.out.println("===================");
    System.out.println("Bubble Sort V1 sortiert: ");
    int[] sorted = bubbleSort(toSort.clone());
    printArray(sorted);

    System.out.println("Selection Sort sortiert: ");
    sorted = selectionSort(toSort.clone());
    printArray(sorted);


  }


  public static int[] bubbleSort(int[] numbers){

    // TODO

    return numbers;
  }


  public static int[] selectionSort(int[] numbers){

    int sortedMarker = numbers.length - 1;
    long swapCount = 0;

    long startTime = System.nanoTime();

    // TODO

    long stopTime = System.nanoTime();

    printRuntimeDuration("SelectionSort", numbers.length, startTime, stopTime, swapCount);

    return numbers;
  }


  public static int[] quickSort(int[] numbers){
    quickSortSwapCount = 0;
    long startTime = System.nanoTime();

    // TODO

    long stopTime = System.nanoTime();
    printRuntimeDuration("QuickSort", numbers.length, startTime, stopTime, quickSortSwapCount);
    return numbers;
  }



  private static void swap(int[] array, int a, int b) {
    int temp = array[a];
    array[a] = array[b];
    array[b] = temp;
  }

  public static void printArray(int[] numbers){
    for(int i = 0; i < numbers.length; i++){
      System.out.print(numbers[i] + ((i == numbers.length-1)?"" : ", "));
    }
    System.out.println();
  }

  private static void printRuntimeDuration(String algorithmName, int elementCount, long startTime, long endTime, long swapCount){
    long durationInNanoSeconds = endTime - startTime;
    long durationInMilliSeconds = (long) (durationInNanoSeconds / 10e5);

    System.out.println("Runtime for " + elementCount + " Elements with " + algorithmName + ": " + durationInNanoSeconds + " ns (" + durationInMilliSeconds + " ms); swapped " + swapCount + " times");
  }
}