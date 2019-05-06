package Teme.Teme11_May;
import java.util.Scanner;

public class SquarePattern {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value: ");
        int size = scan.nextInt();

        System.out.println();

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                System.out.print("# ");
            }

        System.out.println();
        }
    }
}
