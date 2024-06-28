package lecture.chapter10;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;

public class Logon extends JFrame {

  private static final String ACTION_CLOSE = "ACTION_CLOSE";
  private static final String ACTION_PRINT = "ACTION_PRINT";

  static enum NetworkProtocol{
    SSH(22),
    FTP(21),
    HTTP(80),
    HTTPS(443);

    private int defaultPort;

    NetworkProtocol(int defaultPort){
      this.defaultPort = defaultPort;
    }

    public int getDefaultPort(){
      return defaultPort;
    }

    @Override
    public String toString() {

      switch(this){
        case HTTPS: return "HTTP(s):" + defaultPort;
        default:
          return super.toString() + ":" + defaultPort;
      }
    }
  }

  public Logon() throws ParseException {
    super();
    this.setTitle("Logon");
    this.setAlwaysOnTop(true);
    this.setName("Logon");
    this.setResizable(false);
    //this.setUndecorated(true);
    //this.setOpacity(0.5f);

    // Enumeration für ComboBox (Was für Infos wären bei Protokollen noch sinnvoll in der Enumeration?)
    //final String[] PROTOCOL_VALUE_HELP = {"FTP", "Telnet", "SMTP", "HTTP"};
    //JComboBox<String> myComboBox = new JComboBox<>(PROTOCOL_VALUE_HELP);
    JComboBox<NetworkProtocol> myComboBox = new JComboBox<>(NetworkProtocol.values());
    myComboBox.setName("NETWORK_DROPDOWN_BOX");

    JFormattedTextField portField = new JFormattedTextField(new MaskFormatter("#####"));
    portField.setName("PORT_INPUTFIELD");
    portField.setColumns(3);

    myComboBox.addItemListener(new ItemListener() {
      @Override
      public void itemStateChanged(ItemEvent e) {
        if(e.getStateChange() == ItemEvent.SELECTED){
          System.out.println("Item: " + e.getItem());
          System.out.println("StateChange: " + e.getStateChange());
          System.out.println("Parameter String: " + e.paramString());

          portField.setText(Integer.toString(((NetworkProtocol)e.getItem()).getDefaultPort()));
        }
      }
    });



    // initialize Panels
    JPanel mainPanel = new JPanel(new BorderLayout());

    JPanel southPanel = new JPanel(new FlowLayout());
    JPanel centerPanel = new JPanel(new FlowLayout());

    JPanel connectionPanel = new JPanel(new GridLayout(0, 2));
    JPanel filePanel = new JPanel(new GridLayout(0, 2));

    FlowLayout cellFlowLayout = new FlowLayout(FlowLayout.LEFT);

    //create & assign elements for connection area
    JPanel flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JLabel("User:"));
    connectionPanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JTextField(3));
    connectionPanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JLabel("Passwort:"));
    connectionPanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JPasswordField(5));
    connectionPanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JLabel("Art:"));
    connectionPanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(myComboBox);
    connectionPanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JLabel("Host:"));
    connectionPanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    JTextField host = new JTextField(5);
    flowLayoutForCell.add(host);
    connectionPanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JLabel("Port:"));
    connectionPanel.add(flowLayoutForCell);

    connectionPanel.add(portField);

    // create & add Fields for File Area
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JLabel("Quelle:"));
    filePanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JTextField(10));
    filePanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JLabel("Ziel:"));
    filePanel.add(flowLayoutForCell);
    flowLayoutForCell = new JPanel(cellFlowLayout);
    flowLayoutForCell.add(new JTextField(10));
    filePanel.add(flowLayoutForCell);

    // create & assign Buttons
    JButton okButton = new JButton("Ok");
    okButton.setName("OK_BUTTON");
    JButton cancelButton = new JButton("Beenden");
    cancelButton.setName("CANCEL_BUTTON");
    cancelButton.setActionCommand(ACTION_CLOSE);
    JButton printButton = new JButton("Ausgabe");
    printButton.setName("PRINT_BUTTON");
    printButton.setActionCommand(ACTION_PRINT);

    ActionListener buttonListener = e -> {
      System.out.println("Action Command: " + e.getActionCommand());
      System.out.println("Modifiers: " + e.getModifiers());
      System.out.println("Parameter String: " + e.paramString());
      System.out.println("When (Timestamp): " + e.getWhen());



      if(e.getActionCommand().equals(ACTION_PRINT)){
        System.out.println("ausgewähltes Protokoll: " + myComboBox.getSelectedItem() + "; manuell gesetzte Port: " + portField.getText());
      } else if(e.getActionCommand().equals(ACTION_CLOSE)){
        System.exit(0);
      }

      System.out.println("Modifiers (binär): " + Integer.toBinaryString(e.getModifiers()));
      System.out.println("Alt-Mask Modifier: " + Integer.toBinaryString(ActionEvent.ALT_MASK));
      System.out.println("Strg-Mask Modifier: " + Integer.toBinaryString(ActionEvent.CTRL_MASK));

      if((e.getModifiers() & ActionEvent.CTRL_MASK) == ActionEvent.CTRL_MASK){
        System.out.println("STRG - Taste wurde gedrückt");
      } else {
        System.out.println("STRG - Taste wurde NICHT gedrückt");
      }
    };

    okButton.addActionListener(buttonListener);
    printButton.addActionListener(buttonListener);
    cancelButton.addActionListener(buttonListener);

    southPanel.add(okButton);
    southPanel.add(cancelButton);
    southPanel.add(printButton);

    MouseListener fieldListener = new MouseListener() {
      @Override
      public void mouseClicked(MouseEvent e) {
        System.out.println("Element geklickt: " + ((Component)e.getSource()).getName());
        System.out.println("Button: " + e.getButton());
      }

      @Override
      public void mousePressed(MouseEvent e) {
        System.out.println("Element gedrückt: " + ((Component)e.getSource()).getName());
      }

      @Override
      public void mouseReleased(MouseEvent e) {
        System.out.println("Element losgelassen: " + ((Component)e.getSource()).getName());

      }

      @Override
      public void mouseEntered(MouseEvent e) {
        System.out.println("Zeiger auf Element: " + ((Component)e.getSource()).getName());

      }

      @Override
      public void mouseExited(MouseEvent e) {
        System.out.println("Zeiger weg von Element: " + ((Component)e.getSource()).getName());
      }
    };

    okButton.addMouseListener(fieldListener);
    printButton.addMouseListener(fieldListener);
    cancelButton.addMouseListener(fieldListener);
    portField.addMouseListener(fieldListener);
    myComboBox.addMouseListener(fieldListener);

    // create & assign Borders
    Border etchedBorder = BorderFactory.createEtchedBorder();
    Border connectionBorder = BorderFactory.createTitledBorder(etchedBorder, "Verbindung");
    Border fileBorder = BorderFactory.createTitledBorder(etchedBorder, "Datei");
    Border centerBorder = BorderFactory.createBevelBorder(BevelBorder.LOWERED);

    connectionPanel.setBorder(connectionBorder);
    filePanel.setBorder(fileBorder);
    centerPanel.setBorder(centerBorder);

    // combine Panels
    centerPanel.add(connectionPanel);
    centerPanel.add(filePanel);

    mainPanel.add(centerPanel, BorderLayout.CENTER);
    mainPanel.add(southPanel, BorderLayout.SOUTH);

    this.add(mainPanel);


    // Swing - JMenuBar
    JMenuBar myMenuBar = new JMenuBar();
    JMenu fileMenu = new JMenu("Datei");

    JMenuItem printMenuItem = new JMenuItem("Ausgabe");
    printMenuItem.setActionCommand(ACTION_PRINT);
    printMenuItem.addActionListener(buttonListener);
    JMenuItem closeMenuItem = new JMenuItem("Schließen");
    closeMenuItem.setActionCommand(ACTION_CLOSE);
    closeMenuItem.addActionListener(buttonListener);

    fileMenu.add(printMenuItem);
    fileMenu.addSeparator();
    fileMenu.add(closeMenuItem);

    myMenuBar.add(fileMenu);
    this.setJMenuBar(myMenuBar);

    // AWT MenuBar
    MenuBar myAwtMenuBar = new MenuBar();

    Menu fileAwtMenu = new Menu("Datei (AWT)");

    MenuItem printAwtMenuItem = new MenuItem("Ausgabe");
    printAwtMenuItem.setActionCommand(ACTION_PRINT);
    printAwtMenuItem.addActionListener(buttonListener);
    MenuItem closeAwtMenuItem = new MenuItem("Schließen");
    closeAwtMenuItem.setActionCommand(ACTION_CLOSE);
    closeAwtMenuItem.addActionListener(buttonListener);

    fileAwtMenu.add(printAwtMenuItem);
    fileAwtMenu.addSeparator();
    fileAwtMenu.add(closeAwtMenuItem);

    myAwtMenuBar.add(fileAwtMenu);
    this.setMenuBar(myAwtMenuBar);


    // set JFrame behavior
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    this.pack();
    this.setVisible(true);
  }

  public static void main(String[] args) throws ParseException, UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {

    // Set cross-platform Java L&F (also called "Metal")
    System.out.println(UIManager.getLookAndFeel());
    //UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
    //System.out.println(UIManager.getLookAndFeel());

    GraphicsDevice defaultScreenDevice = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();

    System.out.println(String.format("Screen Dimension: %.0f x %.0f",
      defaultScreenDevice.getDefaultConfiguration().getBounds().getWidth(),
      defaultScreenDevice.getDefaultConfiguration().getBounds().getHeight()));

    new Logon();

    GraphicsEnvironment virtualGraphicsEvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
    GraphicsDevice[] screens = virtualGraphicsEvironment.getScreenDevices();

    for(GraphicsDevice screen : screens){
      System.out.println(screen);
      System.out.println(screen.getDefaultConfiguration());
      System.out.println(screen.getDisplayMode());
      System.out.println(screen.getDefaultConfiguration().getBounds());
      System.out.println(screen.getDefaultConfiguration().getBounds().getWidth() + " x " + screen.getDefaultConfiguration().getBounds().getHeight());
      System.out.println(screen.getDefaultConfiguration().getBounds().getX() + " / " + screen.getDefaultConfiguration().getBounds().getY());
    }
  }
}