import java.util.Scanner;

public class PowersOf2 {
    public static void main(String[] args) {
        int numPowersOf2;        // How many powers of 2 to compute
        int nextPowerOf2 = 1;    // Current power of  2
        int exponent;            // Exponent for current power of 2 -- this
                                 // also serves as a counter for the loop

        Scanner scan = new Scanner (System.in);

        System.out.println("How many powers of 2 would you like printed?");
        numPowersOf2 = scan.nextInt();

        // print a message saying how many powers of 2 will be printed
        // initialize exponent -- the first thing printed is 2 to the what?
        

        for(exponent = 0; exponent <= numPowersOf2 ; exponent++){
            numPowersOf2 = numPowersOf2 * 2;
            }
        System.out.println("Test " + nextPowerOf2);
    }
}
