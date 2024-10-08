package Java_Classes;

abstract class abstractClass {
    
  public abstract void animalSound();
  
  public void sleep() {
    System.out.println("Zzz");
  }
}


class Pig extends abstractClass {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
}

class Main {
  public static void main(String[] args) {
    Pig myPig = new Pig(); // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}

