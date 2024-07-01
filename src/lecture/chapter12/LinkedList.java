package lecture.chapter12;

public class LinkedList<T> {

  private Node<T> firstNode;

  public void add(T data){
    Node<T> newNode = new Node(data);

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

  public int size(){
    //TODO: Wieviele Elemente sind aktuell in der Liste
    return 0;
  }

  public boolean remove(T data){
    // TODO: löschen eines bestimmten Daten-Elements (erste, welches in der Liste vorkommt!)
    return false;
  }

  public void printList(){
    // TODO: Ausgabe aller Listen-Elemente
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
