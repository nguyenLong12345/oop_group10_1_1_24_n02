package Code2Week2.ReusingClassess;

class FirstClass {
    private String s;

    FirstClass(String s) {
        this.s = s;
    }

    public String toString() {
        return s;
    }
}

class SecondClass {
    private String data;
    private FirstClass firstClassInstance;

    SecondClass() {
        firstClassInstance = new FirstClass("Lazy ");
    }

    public String toString() {
        if (data == null) {
            data = "Initialization";
        }
        return firstClassInstance + data;
    }
}

public class Exercise1 {
    public static void main(String[] args) {
        SecondClass firstClass = new SecondClass();
        System.out.println(firstClass);
    }
}
