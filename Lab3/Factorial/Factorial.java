import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        int n;
        int i;
        int factor = 1;

        Scanner input = new Scanner (System.in);

        System.out.println("Factorial Calculator");
        System.out.println();
        System.out.print("Enter a positive integer: ");
        i = input.nextInt();

        if (i>0) {
            for(n = 1;n <= i ;n++){
            factor *= n;
            }
        } else { factor = 1; }
        System.out.println("The Factorial of " + i + " is " + factor);
    
    }
}
