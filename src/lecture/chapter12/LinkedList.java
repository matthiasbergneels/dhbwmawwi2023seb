package lecture.chapter12;

public class LinkedList<T> {

  private Node<T> firstNode;
  private int size = 0;

  public void add(T data){
    Node<T> newNode = new Node(data);
    size++;

    if(firstNode == null){
      firstNode = newNode;
      return;
    }

    Node<T> currentNode = firstNode;
    while(currentNode.getNextNode() != null){
      currentNode = currentNode.getNextNode();
    }

    currentNode.setNextNode(newNode);
  }

  // Laufzeitkomplexität --> O(1) konstant
  public int size(){
    return size;
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

  public boolean remove(T data){
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

    //System.out.println(currentNode.getData());
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

}
