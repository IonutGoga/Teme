package Teme.Teme11_May;
import java.util.*;

public class TriangularPattern {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value: ");

        int size = scan.nextInt();



        for (int row = 1; row <= size; row++) {

            for (int col = 1; col <= size; col++) {
                if (row >= col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int row = 1; row <= size; row++) {

            for (int col = 1; col <= size; col++) {
                if (row + col <= size + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int row = 1; row <= size; row++) {

            for (int col = 1; col <= size; col++) {
                if (row <= col) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        for (int row = 1; row <= size; row++) {

            for (int col = 1; col <= size; col++) {
                if (row + col >= size + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
