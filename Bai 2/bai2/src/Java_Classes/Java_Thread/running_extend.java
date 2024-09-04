package Java_Classes.Java_Thread;

public class running_extend extends Thread {
    public static void main(String[] args) {
        running_extend thread = new running_extend();
      thread.start();
      System.out.println("This code is outside of the thread");
    }
    public void run() {
      System.out.println("This code is running in a thread");
    }
  }
