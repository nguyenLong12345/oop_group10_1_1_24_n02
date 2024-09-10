package Code2Week2.AcessControl;

public class Ex5 {
    public int a;
    private int b;
    protected int c;
    int d;

    public void run1(){
        System.out.println("public method");
    }
    private void run2(){
        System.out.println("private method");
    }
    protected void run3(){
        System.out.println("protected method");
    }
    void run4(){
        System.out.println("default method");
    }
}