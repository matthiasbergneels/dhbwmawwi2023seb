 package lecture.chapter12;

 import java.util.Collection;
 import java.util.Iterator;
 import java.util.List;
 import java.util.ListIterator;

 public class LinkedListCollectionFramework<T> implements List<T> {

  private Node<T> firstNode;
  private int size = 0;

  public boolean add(T data){
    Node<T> newNode = new Node(data);
    size++;

    if(firstNode == null){
      firstNode = newNode;
      return true;
    }

    Node<T> currentNode = firstNode;
    while(currentNode.getNextNode() != null){
      currentNode = currentNode.getNextNode();
    }

    currentNode.setNextNode(newNode);
    return true;
  }

   @Override
   public boolean containsAll(Collection<?> c) {
     return false;
   }

   @Override
   public boolean addAll(Collection<? extends T> c) {
     return false;
   }

   @Override
   public boolean addAll(int index, Collection<? extends T> c) {
     return false;
   }

   @Override
   public boolean removeAll(Collection<?> c) {
     return false;
   }

   @Override
   public boolean retainAll(Collection<?> c) {
     return false;
   }

   @Override
   public void clear() {

   }

   @Override
   public T get(int index) {
     return null;
   }

   @Override
   public T set(int index, T element) {
     return null;
   }

   @Override
   public void add(int index, T element) {

   }

   @Override
   public T remove(int index) {
     return null;
   }

   @Override
   public int indexOf(Object o) {
     return 0;
   }

   @Override
   public int lastIndexOf(Object o) {
     return 0;
   }

   @Override
   public ListIterator<T> listIterator() {
     return null;
   }

   @Override
   public ListIterator<T> listIterator(int index) {
     return null;
   }

   @Override
   public List<T> subList(int fromIndex, int toIndex) {
     return null;
   }

   // Laufzeitkomplexität --> O(1) konstant
  public int size(){
    return size;
  }

   @Override
   public boolean isEmpty() {
     return false;
   }

   @Override
   public boolean contains(Object o) {
     return false;
   }

   @Override
   public Iterator<T> iterator() {
     return null;
   }

   @Override
   public Object[] toArray() {
     return new Object[0];
   }

   @Override
   public <T1> T1[] toArray(T1[] a) {
     return null;
   }

  /* Laufzeitkopmplexität --> O(n) linear
  public int size(){
    if(firstNode == null){
      return 0;
    }

    int count = 1;
    Node currentNode = firstNode;
    while(currentNode.getNextNode() != null){
      currentNode = currentNode.getNextNode();
      count++;
    }
    return count;
  }
   */

  public boolean remove(Object data){
    // TODO: löschen eines bestimmten Daten-Elements (erste, welches in der Liste vorkommt!)
    if(firstNode == null){
      return false;
    }

    if(firstNode.getData().equals(data)){
      firstNode = firstNode.getNextNode();
      size--;
      return true;
    }

    Node currentNode = firstNode;
    while(currentNode.getNextNode() != null){
      if(currentNode.getNextNode().getData().equals(data)){
        currentNode.setNextNode(currentNode.getNextNode().getNextNode());
        size--;
        return true;
      }
      currentNode = currentNode.getNextNode();
    }

    return false;
  }

  public void printList(){
    if(firstNode == null){
      System.out.println("Leere Liste");
      return;
    }

    Node currentNode = firstNode;
    while(currentNode != null){
      System.out.println(currentNode.getData());
      currentNode = currentNode.getNextNode();
    }
  }

  public void printListRecursive(){
    if(firstNode == null){
      System.out.println("Leere Liste");
      return;
    }

    printElement(firstNode);
  }

  private void printElement(Node currentNode){
    if(currentNode == null){
      return;
    }
    System.out.println(currentNode.getData());
    printElement(currentNode.getNextNode());
  }

  private class Node<T>{
    private T data;
    private Node<T> nextNode;

    Node(T data){
      this.data = data;
    }
    public void setNextNode(Node<T> nextNode) {
      this.nextNode = nextNode;
    }
    public Node<T> getNextNode() {
      return nextNode;
    }
    public T getData() {
      return data;
    }
  }

  class LinkedListIterator implements Iterator<T>{

    @Override
    public boolean hasNext() {
      return false;
    }

    @Override
    public T next() {
      return null;
    }
  }
}
