package Exercises_193;

public class main(){

public class cycle {
    public void ride() {
        System.out.println("Riding a generic cycle.");
    }
}

class Unicycle extends cycle {
    public void ride(int sobanh) {
        System.out.println(sobanh);
    }
}

class Bicycle extends cycle {
    public void ride(int x) {
        System.out.println(x);
    }
}

class Tricycle extends cycle {
    public void ride(int x) {
        System.out.println(x);
    }
}


    public static void main(String[] args) {
        main myUnicycle = new Unicycle();
        main myBicycle = new Bicycle();
        main myTricycle = new Tricycle();

        myUnicycle.ride(1); 
        myBicycle.ride(2);  
        myTricycle.ride(3); 
}
}