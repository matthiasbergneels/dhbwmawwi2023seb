package lecture.chapter12;

import lecture.chapter5.Car;

public class BinaryTreeExample {

  public static void main(String[] args) {

    BinaryTree<String> myTree = new BinaryTree<>();

    myTree.add("Hanno");
    myTree.add("Fritz");
    myTree.add("Gabi");
    myTree.add("Helmut");
    myTree.add("Dorothea");
    myTree.add("Zeus");
    myTree.add("Harald");
    myTree.add("Michael");
    myTree.add("Anton");
    myTree.add("Benjamin");

    System.out.println("Enthält Fritz: " + myTree.contains("Fritz"));
    System.out.println("Enthält Harald: " + myTree.contains("Harald"));

    myTree.print();
    myTree.printPreOrder();
    myTree.printPostOrder();
    myTree.printLevelOrder();

    System.out.println("Ende");
  }
}
