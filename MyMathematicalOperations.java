package Teme.Teme11_May;
import java.util.*;

public class MyMathematicalOperations {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value with spaces: ");
        String n = scan.nextLine();

        int[] ar = {1, 2, 3};

        String[] c = n.split(" ");
        int a = Integer.parseInt(c[0]);
        int b = Integer.parseInt(c[2]);

        System.out.println();

        if(c.length <= ar.length) {
            if(c[1].equals("+")){
                System.out.println(MyMathematicalOperations_Methods.adunare(a, b));
            } else if(c[1].equals("*")) {
                System.out.println(MyMathematicalOperations_Methods.inmultire(a, b));
            } else if(c[1].equals("/")){
                System.out.println(MyMathematicalOperations_Methods.impartire(a, b));
            } else if(c[1].equals("%")){
                System.out.println(MyMathematicalOperations_Methods.restulImpartirii(a, b));
            } else if(c[1].equals("-")){
                System.out.println(MyMathematicalOperations_Methods.scadere(a, b));
            } else {
                System.out.println("Enter a valid format !!!");
            }
        } else {
            System.out.println("Enter a valid format !!!");
        }
    }

}

