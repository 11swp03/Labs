import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        int n;
        int i;
        int factor = 1;

		do {
			Scanner input = new Scanner (System.in);

			System.out.println("Factorial Calculator");
			System.out.println();
			System.out.print("Enter a positive integer: ");
			i = input.nextInt();

			if (i>0) {
					for(n = 1;n <= i ;n++){
					factor *= n;
					}
				System.out.println("The Factorial of " + i + " is " + factor);
			} else if (i<0){
				System.out.println("Please enter a positive integer");
			} else { 
				factor = 1;
				System.out.println("The Factorial of " + i + " is " + factor);
			}
		} while (i<0);
    
    }
}
