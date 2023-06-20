// This is the class named Printer
class Printer {
  // This are the methods in class Printer
  public void print() {
    System.out.println("Hi! I class SCHOOL.");
  }

  public void print(String s) {
    System.out.println(s);
  }
}

public class Question22 {
  public static void main(String[] args) {

    Printer ptr = new Printer();
    ptr.print();
    ptr.print("Hi! I am class STUDENT");
  }
}