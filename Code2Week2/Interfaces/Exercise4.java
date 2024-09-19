abstract class AbstractBase {
    // Không có phương thức nào
}

class DerivedClass extends AbstractBase {
    void derivedMethod() {
        System.out.println("DerivedClass method called");
    }
}

public class Exercise4 {
    public static void callDerivedMethod(AbstractBase base) {
        if (base instanceof DerivedClass) {
            DerivedClass derived = (DerivedClass) base; // Ép kiểu xuống lớp dẫn xuất
            derived.derivedMethod();
        }
    }

    public static void main(String[] args) {
        AbstractBase base = new DerivedClass();
        callDerivedMethod(base); // Gọi phương thức với ép kiểu
    }
}
