package Java_Classes;

class java_inner_class_outerclass {
    int x = 10; 
    class InnerClass{
        int y = 10;
    }
}

public class Main{
    public static void main(String[] args) {
        java_inner_class_outerclass myObj12 = new java_inner_class_outerclass();
        java_inner_class_outerclass.InnerClass myInner = myObj12.new InnerClass();
        System.out.println(myInner.y + myObj12.x);
    }
}