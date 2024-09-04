package Exercises_107;

public class exerceise6_107 {
    public void bark(int times) {
        System.out.println("The dog barks " + times + " times.");
    }
    public void bark(double volume) {
        System.out.println("The dog barks at volume level " + volume + ".");
    }
    public void bark(char type) {
        switch (type) {
            case 'H':
                System.out.println("The dog howls!");
                break;
            case 'B':
                System.out.println("The dog barks loudly!");
                break;
            default:
                System.out.println("The dog makes a sound.");
                break;
        }
    }
    public void bark(String message) {
        System.out.println("The dog says: " + message);
    }
    public void bark(int times, double volume) {
        System.out.println("The dog barks " + times + " times at volume level " + volume + ".");
    }
    public void bark(double volume, int times) {
        System.out.println("The dog barks at volume level " + volume + " for " + times + " times.");
    }

    public static void main(String[] args) {
        exerceise6_107 myDog = new exerceise6_107();

        myDog.bark(3);                  
        myDog.bark(8.5);              
        myDog.bark('H');                
        myDog.bark("Woof Woof!");       
        myDog.bark(5, 3.14);//bark(int, double)
        myDog.bark(2.718, 10);//bark(double, int)
    }
}
