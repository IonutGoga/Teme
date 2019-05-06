package Teme.Teme11_May;
import java.util.*;

public class GetNumberOfDigit {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");

        String n = scan.nextLine();
        int g = Integer.parseInt(n);

        GetNumberOfDigit_Method y = new GetNumberOfDigit_Method(g);
    }
}
