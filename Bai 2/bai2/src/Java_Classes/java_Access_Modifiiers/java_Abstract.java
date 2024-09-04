package Java_Classes.java_Access_Modifiiers;

abstract class java_Abstract {
    public String fname = "John";
    public int age = 24;
    public abstract void study(); 

}

class Student extends java_Abstract{
    public int graduationYear = 2018;
    public void study() { // the body of the abstract method is provided here
        System.out.println("Studying all day long");
  }
}
