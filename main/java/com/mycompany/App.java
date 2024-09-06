package main.java.com.mycompany;

public class App {
    public static void main(String[] args) {
        Book b = new Book("Phiêu lưu", "Long", 2000);
        System.out.println(b.title + b.author + b.numPages);

        Time t1 = new Time(20, 3, 45);
        System.out.println(t1);

        Recursion r = new Recursion();
        System.out.println(r.factorial(10));

        NameNumber n = new NameNumber("Long", "99999999");
        System.out.println(n.getLastName());

        NNCollection c = new NNCollection();
        c.insert(n);
        System.out.println(c.findNumber("Long"));
    }
}