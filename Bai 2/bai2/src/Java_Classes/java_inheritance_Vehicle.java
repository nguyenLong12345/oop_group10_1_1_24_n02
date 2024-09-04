package Java_Classes;

class java_inheritance_Vehicle {
    protected String brand  = "Ford";
    public void honk(){
        System.out.println("Tuut,tuut!");
    }
}
class Car extends java_inheritance_Vehicle{
    private String modelName = "Mustang";
    public static void main(String[] args){
        Car myCar = new Car();
        myCar.honk();
        System.out.println(myCar.brand+ " "+myCar.modelName );
    }
}
