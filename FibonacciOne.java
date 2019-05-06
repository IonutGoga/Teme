package Teme.Teme11_May;
import java.util.*;

public class FibonacciOne {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value:");
        int n = scan.nextInt();

        System.out.println();

        int x = 0;
        int y = 1;

        for (int i = 1; i <= n; ++i) {
            System.out.print(x + " , ");
            int sum = x + y;
            x = y;
            y = sum;
        }
    }
}
