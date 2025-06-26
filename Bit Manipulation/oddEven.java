import java.util.Arrays;

public class oddEven {

    public static void even_odd(int n) {
        int bitmask = 1;
        if ((n & bitmask) == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }

    public static void main(String args[]) {
        even_odd(3);
        even_odd(4);
        even_odd(23424249);
    }
}