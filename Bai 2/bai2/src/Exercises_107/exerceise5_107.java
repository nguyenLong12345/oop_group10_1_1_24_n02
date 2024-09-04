package Exercises_107;

public class exerceise5_107 {
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

    public static void main(String[] args) {
        exerceise5_107 myDog = new exerceise5_107();
        myDog.bark(3);
        myDog.bark(8.5);
        myDog.bark('H');
        myDog.bark('B');
        myDog.bark("Woof Woof!");
    }
}
