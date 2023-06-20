// This is the class named School
class School {
  // This is a method in class School
  public void print() {
    System.out.println("Hi! I class SCHOOL.");
  }
}

// This is the class named Student
class Student {
  // This is a method in class Student
  public void print() {
    System.out.println("Hi! I am class STUDENT");
  }
}

public class Question21 {
  public static void main(String args[]) {
    Student st = new Student();
    School sc = new School();
    sc.print();
    st.print();
    
  }
}
