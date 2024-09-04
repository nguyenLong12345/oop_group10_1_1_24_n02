package Java_Classes;

public class Main {
    int x = 5;
    public static void main(String[] args) {
        Main myObj = new Main();
        Main myObj2= new Main();

        System.out.println(myObj.x);
        System.out.println(myObj2.x);
    }
}
class second {
    public static void main(String[] args) {
        Main myObj3 = new Main();
        System.out.println(myObj3.x);
    }
}
