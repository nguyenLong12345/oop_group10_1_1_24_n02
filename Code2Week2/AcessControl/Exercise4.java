package Code2Week2.AcessControl;

import Code2Week2.AcessControl.access.Animals;
import Code2Week2.AcessControl.access.Dog;

public class Exercise4 {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        
        Animals a = new Animals();
        // a.makeSound(); not access
    }
}
