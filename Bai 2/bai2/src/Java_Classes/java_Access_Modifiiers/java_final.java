package Java_Classes.java_Access_Modifiiers;

public class java_final {
    final int x = 20;
    final double Pi = 3.14;

    public static void main(String[] args) {
        java_final myObj7 = new java_final();
        myObj7.x = 50;
        myObj7.Pi = 32.23;
        System.out.println(myObj7.x);
    }
}
