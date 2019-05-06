package Teme.Teme11_May;
import java.util.*;

public class CheckerPattern {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value: ");
        int size = scan.nextInt();

        System.out.println();

        for(int i = 1; i<=size; i++){
            if(i % 2 ==0) {
                System.out.print("  ");
            }
            for(int j=1; j<=size; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
