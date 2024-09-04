package Code2Week2.ReusingClassess;

public class Exercise3 {
    public static void main(String[] args) {
        Exercise2 obj = new Exercise2();
        obj.sterilize();
        obj.scrub();
        System.out.println(obj);
    }
}
