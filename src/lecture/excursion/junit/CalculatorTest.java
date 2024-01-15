package lecture.excursion.junit;

import org.junit.jupiter.api.*;

//import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

  private Calculator testCalculator;

  @BeforeAll
  static void setUpAll(){
    System.out.println("Läuft EINMAL vor allen Test - aufbauen");
  }

  @BeforeEach
  void setUp() {
    System.out.println("Läuft vor jedem Test - aufbauen");
    testCalculator = new Calculator();
  }

  @AfterEach
  void tearDown() {
    System.out.println("Läuft nach jedem Test - aufräumen");
    testCalculator = null;
  }

  @AfterAll
  static void tearDownAll(){
    System.out.println("Läuft EINMAL nach allen Test - aufräumen");
  }

  @Test
  void add() {
    System.out.println("Test - add");
    // Arrange
    // Nothing to do

    // Act
    double result = testCalculator.add(10.0, 20.0);

    // Assert
    Assertions.assertEquals(30.0, result);
  }

  @Test
  void addWithIntegerValue() {
    System.out.println("Test - addWithIntegerValue");
    // Arrange
    // Nothing to do

    // Act
    double result = testCalculator.add(5, 10);

    // Assert
    Assertions.assertEquals(15.0, result);
  }

  @Test
  void addWithSmallValue() {
    System.out.println("Test - addWithSmallValue");
    // Arrange
    // Nothing to do

    // Act
    double result = testCalculator.add(0.00005, 0.00001);

    // Assert
    Assertions.assertEquals(0.00006, result);
  }
}