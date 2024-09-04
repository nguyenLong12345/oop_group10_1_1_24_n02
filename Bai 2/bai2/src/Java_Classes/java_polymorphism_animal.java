package Java_Classes;

class java_polymorphism_animal {
    public void animalSound(){
        System.out.println("The animal makes a sound");
    }
}
class Dog extends java_polymorphism_animal{
    public void animalSound(){
        System.out.println("The dog says: bow wow");
    }   
}
class Pig extends java_polymorphism_animal {
    public void animalSound() {
      System.out.println("The pig says: wee wee");
    }
}

class Main {
    public static void main(String[] args) {
        java_polymorphism_animal myAnimal = new java_polymorphism_animal();
        java_polymorphism_animal myDog = new Dog();
        java_polymorphism_animal myPig = new Pig();
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}
  