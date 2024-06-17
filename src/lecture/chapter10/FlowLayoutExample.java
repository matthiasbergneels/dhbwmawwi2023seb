package lecture.chapter10;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample extends JFrame {

  public FlowLayoutExample(){
    super("FlowLayout Beispiel");

    JPanel mainJPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

    mainJPanel.add(new JLabel("Bitte den Button drücken: "));
    mainJPanel.add(new Button("Mich drücken!"));
    mainJPanel.add(new JLabel("Danke"));

    this.add(mainJPanel);

    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.pack();
    this.setVisible(true);
  }

  public static void main(String[] args) {
    new FlowLayoutExample();

    System.out.println("Ende der Main-Methode");
  }

}
