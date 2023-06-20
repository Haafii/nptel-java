// The following is the declaration of the main class named Question42
public class Question42 {
  public static void main(String args[]) {
    int year; // integer type variable to store year
    // Create an object of Calendar class.

    // Use getInstance() method to initialize the Calendar object.

    // Initialize the int variable year with the current year
    java.util.Calendar current;
    current = java.util.Calendar.getInstance();
    year = current.get(current.YEAR);

    // Print the current Year
    System.out.println("Current Year: " + year);
  }
}