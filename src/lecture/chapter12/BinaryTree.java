package lecture.chapter12;

public class BinaryTree<T extends Comparable<T>> {

  private Node<T> root;

  public boolean add(T data){
    Node<T> newNode = new Node<>(data);

    if(root == null){
      root = newNode;
      return true;
    }

    return add(root, newNode);
    /*
    Node<T> currentNode = root;
    while (currentNode != null){
      if (currentNode.getData().compareTo(newNode.getData()) < 0) {
        if(currentNode.getRightNode() != null){
          currentNode = currentNode.getRightNode();
        } else {
          currentNode.setRightNode(newNode);
          return true;
        }
      } else if (currentNode.getData().compareTo(newNode.getData()) > 0) {
        if(currentNode.getLeftNode() != null){
          currentNode = currentNode.getLeftNode();
        } else {
          currentNode.setLeftNode(newNode);
          return true;
        }
      } else {
        return false;
      }
    }
    return false;

     */
  }

  private boolean add(Node<T> currentNode, Node<T> newNode){

    if(currentNode.getData().compareTo(newNode.getData()) < 0){
      if(currentNode.getRightNode() != null){
        return add(currentNode.getRightNode(), newNode);
      } else {
        currentNode.setRightNode(newNode);
        return true;
      }
    } else if(currentNode.getData().compareTo(newNode.getData()) > 0){
      if(currentNode.getLeftNode() != null){
        return add(currentNode.getLeftNode(), newNode);
      } else {
        currentNode.setLeftNode(newNode);
        return true;
      }
    }

    return false;
  }

  public boolean contains(T data){
    // TODO: element finden im Baum
    // equals
    return true;
  }

  public void print(){
    // TODO: Ausgabe aller Daten - von klein nach groß aufsteigend
  }

  private class Node<T>{

    private T data;
    private Node<T> leftNode;
    private Node<T> rightNode;

    Node(T data){
      this.data = data;
    }

    public T getData() {
      return data;
    }

    public Node getLeftNode() {
      return leftNode;
    }

    public void setLeftNode(Node leftNode) {
      this.leftNode = leftNode;
    }

    public Node getRightNode() {
      return rightNode;
    }

    public void setRightNode(Node rightNode) {
      this.rightNode = rightNode;
    }
  }
}
