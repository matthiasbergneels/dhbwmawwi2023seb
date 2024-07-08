package lecture.chapter12;

public class LinkedListExample {

  public static void main(String[] args) {
    LinkedList<String> wordLinkedList = new LinkedList<>();

    wordLinkedList.add("Hallo");
    wordLinkedList.add("an");
    wordLinkedList.add("diesem");
    wordLinkedList.add("sonnigen");
    wordLinkedList.add("Tag!");


    wordLinkedList.printList();

    wordLinkedList.printListRecursive();

    System.out.println("Ende");
  }
}
