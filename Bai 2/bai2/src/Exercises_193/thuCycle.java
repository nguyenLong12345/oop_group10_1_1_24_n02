package Exercises_193;

public class Cycle {
    public void ride() {
        System.out.println("Riding a generic cycle.");
    }
}

class Unicycle extends Cycle {
    public void ride() {
        System.out.println("Riding a unicycle.");
    }
}

class Bicycle extends Cycle {
    public void ride() {
        System.out.println("Riding a bicycle.");
    }
}

class Tricycle extends Cycle {
    public void ride() {
        System.out.println("Riding a tricycle.");
    }
}
public class thuCycle{

    public static void main(String[] args) {
        Cycle myUnicycle = new Unicycle();
        Cycle myBicycle = new Bicycle();
        Cycle myTricycle = new Tricycle();

        myUnicycle.ride(); 
        myBicycle.ride();  
        myTricycle.ride(); 
}
}