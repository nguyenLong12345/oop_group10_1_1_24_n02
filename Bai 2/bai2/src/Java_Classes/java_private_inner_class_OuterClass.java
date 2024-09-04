package Java_Classes;


public class java_private_inner_class_OuterClass {
    int x = 10;

  private class InnerClass2 {
    int  y = 5;
  }
}

public class Main {
  public static void main(String[] args) {
    java_private_inner_class_OuterClass myOuter13 = new java_private_inner_class_OuterClass();
    java_private_inner_class_OuterClass.InnerClass2 myInner = myOuter13.new InnerClass2();
    System.out.println(myInner2.y + myOuter13.x);
  }
}
