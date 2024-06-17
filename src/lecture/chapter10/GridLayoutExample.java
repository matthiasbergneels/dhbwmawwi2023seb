package lecture.chapter10;

import javax.swing.*;
import java.awt.*;

public class GridLayoutExample extends JFrame{

      public GridLayoutExample(){
      super("GridLayout Beispiel");

      JPanel mainJPanel = new JPanel(new GridLayout(0,2));

      mainJPanel.add(new JButton("Button 1"));
      mainJPanel.add(new JButton("Button 2"));
      mainJPanel.add(new JButton("Button 3"));
      mainJPanel.add(new JButton("Button 4"));
      mainJPanel.add(new JButton("Button 5"));
      mainJPanel.add(new JButton("Button 6"));
      mainJPanel.add(new JButton("Button 7"));
      JPanel gridPanel8 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        gridPanel8.add(new JButton("Button 8"));
      mainJPanel.add(gridPanel8);
      mainJPanel.add(new JButton("Button 9"));


      this.add(mainJPanel);

      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      this.pack();
      this.setVisible(true);
    }

    public static void main(String[] args) {
      new GridLayoutExample();

      System.out.println("Ende der Main-Methode");
    }

}
