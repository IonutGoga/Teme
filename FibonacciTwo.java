package Teme.Teme11_May;
import java.util.*;

public class FibonacciTwo {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value: ");
        int n = scan.nextInt();

        int i = 1;
        int x = 0;
        int y = 1;

        System.out.println();

        while (i <= n) {
            System.out.print(x + " , ");
            int sum = x + y;
            x = y;
            y = sum;

            i++;
        }
    }
}
