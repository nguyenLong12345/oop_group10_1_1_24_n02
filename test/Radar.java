package test;

public class Radar {
    // Phương thức tính toán tín hiệu rời rạc X(n) theo công thức đã cho
    public double calculateSignal(int n) {
        if (n >= 0 && n <= 15) {
            return 1 -( (double)n / 15);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Radar radar = new Radar();//Tạo Obj

        // Tính và in kết quả tín hiệu với n = 4
        int n = 4;
        double result = radar.calculateSignal(n);
        System.out.println("Giá trị tín hiệu X(" + n + ") = " + result);
    }
}

