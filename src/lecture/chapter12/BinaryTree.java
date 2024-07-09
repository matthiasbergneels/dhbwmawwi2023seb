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
    if(root == null){
      return false;
    }
    return contains(root, data);
  }

  private boolean contains(Node<T> currentNode, T data){
    if(currentNode.getData().equals(data)){
      return true;
    }

    if(currentNode.getData().compareTo(data) < 0){
      if(currentNode.getRightNode() != null){
        return contains(currentNode.getRightNode(), data);
      }
    } else if(currentNode.getData().compareTo(data) > 0){
      if(currentNode.getLeftNode() != null){
        return contains(currentNode.getLeftNode(), data);
      }
    }

    return false;
  }

  public void print(){
    if(root == null){
      System.out.println("Baum ist leer");
      return;
    }

    System.out.println("In-Order-Ausgabe:");
    printInOrder(root);
  }

  // in-order-Traversierung --> left - current - right
  private void printInOrder(Node<T> currentNode){
    if(currentNode.getLeftNode() != null){
      printInOrder(currentNode.getLeftNode());
    }

    System.out.println(currentNode.getData());

    if(currentNode.getRightNode() != null){
      printInOrder(currentNode.getRightNode());
    }
  }

  // pre-order-Traversierung --> current-left-right
  public void printPreOrder(){
    if(root == null){
      System.out.println("Baum ist leer");
      return;
    }
    System.out.println("Pre-Order-Ausgabe:");
    printPreOrder(root);
  }

  private void printPreOrder(Node<T> currentNode){
    System.out.println(currentNode.getData());

    if(currentNode.getLeftNode() != null){
      printPreOrder(currentNode.getLeftNode());
    }

    if(currentNode.getRightNode() != null){
      printPreOrder(currentNode.getRightNode());
    }
  }

  // post-order-Traversierung --> left-right-current
  public void printPostOrder(){
    if(root == null){
      System.out.println("Baum ist leer");
      return;
    }

    System.out.println("Post-Order-Ausgabe:");
    printPostOrder(root);
  }

  private void printPostOrder(Node<T> currentNode){
    if(currentNode.getLeftNode() != null){
      printPostOrder(currentNode.getLeftNode());
    }

    if(currentNode.getRightNode() != null){
      printPostOrder(currentNode.getRightNode());
    }

    System.out.println(currentNode.getData());
  }

  // Level-Order-Traversierung --> Level von oben nach unten und rechts nach links
  void printLevelOrder() {
    record LevelNode(int level, Node node){

    }

    if(root == null){
      System.out.println("Baum ist leer");
      return;
    }

    System.out.println("Level-Order-Ausgabe:");

    int currentLevel = 0;
    Queue<LevelNode> queue = new Queue<>();
    queue.enqueue(new LevelNode(1, root));

    while (!queue.isEmpty()) {
      LevelNode currentLevelNode = queue.dequeue();
      if(currentLevel != currentLevelNode.level()){
        System.out.println();
        System.out.print(++currentLevel);
      }

      System.out.print(" - " + currentLevelNode.node().data);

      if (currentLevelNode.node().getLeftNode() != null) {
        queue.enqueue(new LevelNode(currentLevel + 1, currentLevelNode.node().getLeftNode()));
      }

      if (currentLevelNode.node().getRightNode() != null) {
        queue.enqueue(new LevelNode(currentLevel + 1, currentLevelNode.node().getRightNode()));
      }
    }
    System.out.println();
  }

  private static class Node<T>{

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
