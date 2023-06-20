import java.util.Scanner;

class Shape {
  double length, breadth;

  Shape(double l, double b) { // Constructor to initialize a Shape object
    length = l;
    breadth = b;
  }

  Shape(double len) { // Constructor to initialize another Shape object
    length = breadth = len;
  }

  double calculate() {// To calculate the area of a shape object
    return length * breadth;
  }
}

public class Test1 extends Shape {

  // Create a derived class constructor which can call the one parametrized
  // constructor of the base class
  // Create a derived class constructor which can call the two parametrized
  // constructor of the base class
  // Override the method calculate() in the derived class to find the volume of a
  // shape instead of finding the area of a shape
  // Template code:
  double height;

  Test1(double length, double h) {
    // base class constructor with one parameter is called
    super(length);
    height = h;
  }

  Test1(double length, double breadth, double h) {
    // base class constructor having two argument is called
    super(length, breadth);
    height = h;
  }

  double calculate() {
    return length * breadth * height;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);// Create an object to read
                                        // input
    double l = sc.nextDouble(); // Read length
    double b = sc.nextDouble(); // Read breadth
    double h = sc.nextDouble(); // Read height
    Test1 myshape1 = new Test1(l, h);
    Test1 myshape2 = new Test1(l, b, h);
    double volume1;
    double volume2;
    volume1 = myshape1.calculate();
    volume2 = myshape2.calculate();
    System.out.println(volume1);
    System.out.println(volume2);
  }
}