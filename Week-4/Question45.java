// Interface ShapeX is created
interface ShapeX {
  public String base = "This is Shape1";

  public void display1();
}

interface ShapeY extends ShapeX {
  public String base = "This is Shape2";

  public void display2();
}

class ShapeG implements ShapeY {
  public String base = "This is Shape3";

  // Overriding method in ShapeX interface
  public void display1() {
    System.out.print("Circle: " + ShapeX.base);
  }

  // Overriding method in ShapeY interface
  public void display2() {
    System.out.println("Circle: " + ShapeY.base);
  }
}

// Main class Question
public class Question45 {
  public static void main(String[] args) {
    // Object of class shapeG is created and display methods are called.
    ShapeG circle = new ShapeG();
    circle.display2();
    circle.display1();

  }
}