package lecture.chapter12;

import lecture.chapter5.Car;

public class BinaryTreeExample {

  public static void main(String[] args) {

    BinaryTree<String> myTree = new BinaryTree<>();

    myTree.add("Hallo");
    myTree.add("Fritz");
    myTree.add("Gabi");
    myTree.add("Helmut");
    myTree.add("Dorothea");

    System.out.println("Enthält Fritz: " + myTree.contains("Fritz"));
    System.out.println("Enthält Harald: " + myTree.contains("Harald"));

    myTree.print();

    System.out.println("Ende");
  }
}
