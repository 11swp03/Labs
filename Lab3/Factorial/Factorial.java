import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        int i;
        int factor = 1;

        Scanner input = new Scanner (System.in);

        System.out.println("Factorial Calculator");
        System.out.println();
        System.out.print("Enter a positive integer: ");
        i = input.nextInt();

        for(int n = 1;n <= i ;n++){
            factor *= n;
        }
        System.out.println("The Factorial of " + i + "is " + factor);
    }
}
