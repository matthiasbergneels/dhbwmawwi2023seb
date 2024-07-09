package lecture.chapter12;

public class Stack<T> {

  private Node<T> head;
  private int size;

  public void push(T data){
    head = new Node(data, head);
    size++;
  }

  public T pop(){
    if(head == null){
      return null;
    }

    T data = head.getData();
    head = head.getNextNode();
    size--;
    return data;
  }

  public T peek(){
    return (head == null) ? null : head.getData();
  }

  public int size(){
    return size;
  }

  public boolean isEmpty(){
    return head == null;
  }

  private class Node<T>{
    private T data;
    private Node<T> nextNode;

    Node(T data, Node<T> nextNode){
      this.data = data;
      this.nextNode = nextNode;
    }

    T getData(){
      return this.data;
    }
    Node<T> getNextNode(){
      return nextNode;
    }
  }
}
