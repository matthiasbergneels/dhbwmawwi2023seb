package lecture.chapter10;

import javax.swing.*;
import java.awt.*;

public class MyFirstUI {

  public static void main(String[] args) {

    JFrame myFirstUI = new JFrame();
    myFirstUI.setTitle("Mein erstes UI");

    JButton myButton = new JButton("Juhu");

    myFirstUI.setLayout(new FlowLayout());

    myFirstUI.add(new JLabel("Bitte auf den Button klicken: "));
    myFirstUI.add(myButton);

    myFirstUI.getContentPane().add(myButton);

    //myFirstUI.setSize(200, 200);
    myFirstUI.pack();
    myFirstUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    myFirstUI.setVisible(true);

  }
}
