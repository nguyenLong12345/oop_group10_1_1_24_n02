package test;
/*
 * Tên sinh viên   : Nguyễn Chi Tai
 * Mã sinh viên    : 23010548
 * Lớp             : N02
 * Bài tập         : Xây dựng lớp tín hiệu rời rạc (DiscreteSignal)
 * Mô tả           : Chương trình xây dựng lớp tín hiệu rời rạc dựa trên định nghĩa tín hiệu rời rạc 
 *                   theo công thức đã cho. Lớp bao gồm các phương thức nhập, xuất và tính toán.
 * 
 * Ngày thực hiện  : 06/09/2024
 */
public class Main {
    public static void main(String[] args) {
        DiscreteSignal ds = new DiscreteSignal(5.0, 2.0, 10, 50);
        ds.SignalInfo();

        System.out.println("Tín hiệu rời rạc tại n = 0: " + ds.tinhDiscreteSignal(0));

        ContinuousSignal cs = new ContinuousSignal(7.0, 3.0, 20.0);
        cs.SignalInfo();
    }
}
