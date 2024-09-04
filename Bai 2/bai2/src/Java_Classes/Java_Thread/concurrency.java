package Java_Classes.Java_Thread;

public class concurrency extends Thread {
    public static int amount = 0;

  public static void main(String[] args) {
    concurrency thread = new concurrency();
    thread.start();
    // Wait for the thread to finish
    while(thread.isAlive()) {
      System.out.println("Waiting...");
    }
    // Update amount and print its value
    System.out.println("Main: " + amount);
    amount++;
    System.out.println("Main: " + amount);
  }
  public void run() {
    amount++;
  }

}
