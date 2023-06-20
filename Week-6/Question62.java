public class Question62 implements Runnable {

  @Override
  public void run() {
    System.out.print(Thread.currentThread().getName() + " has ended.");
  }

  public static void main(String[] args) {
    Question62 ex = new Question62();
    Thread t0 = new Thread(ex);
    t0.setName("Main Thread");
    t0.start();
    System.out.println("Welcome to Java Week 6 New Question.");
    t0.setName("Main Thread");
  }
}