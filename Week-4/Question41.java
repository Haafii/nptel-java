
// Import the required package(s) and/or class(es)
import java.util.Scanner;
import java.util.LinkedList;

// main class Question is created
public class Question41 {
  public static void main(String[] args) {
    // Scanner object is created
    Scanner scanner = new Scanner(System.in);
    // Read String input using scanner class
    String courseName = scanner.nextLine();
    // Print the scanned String
    System.out.println("Course: " + courseName);

    LinkedList<String> cars = new LinkedList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
  }
}
