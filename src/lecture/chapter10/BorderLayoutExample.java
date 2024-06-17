package lecture.chapter10;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample extends JFrame {

  public BorderLayoutExample(){
    super("BorderLayout Example");

    JPanel mainPanel = new JPanel(new BorderLayout());

    mainPanel.add(new JButton("Button - CENTER"), BorderLayout.CENTER);
    mainPanel.add(new JButton("Button - NORTH"), BorderLayout.NORTH);
    JPanel southPanel = new JPanel(new FlowLayout());
    southPanel.add(new JButton("Button 1 - SOUTH"));
    southPanel.add(new JButton("Button 2 - SOUTH"));
    southPanel.add(new JButton("Button 3 - SOUTH"));
    mainPanel.add(southPanel, BorderLayout.SOUTH);
    mainPanel.add(new JButton("Button - EAST"), BorderLayout.EAST);
    mainPanel.add(new JButton("Button - WEST"), BorderLayout.WEST);


    this.add(mainPanel);


    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.pack();
    this.setVisible(true);
  }


  public static void main(String[] args) {
    new BorderLayoutExample();
  }
}
