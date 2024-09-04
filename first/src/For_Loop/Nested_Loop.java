package For_Loop;

public class Nested_Loop {
    public static void main(String[] args) {
        for(int i =1; i< 3; i++){
            System.out.println("Outer: "+i);
            for(int j = 1; j<5; j++){
                System.out.println("Inner: "+i);
            }
        }
    }
}
