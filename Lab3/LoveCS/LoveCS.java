import java.util.Scanner;

public class LoveCS {
    public static void main(String[] args) {
        final int LIMIT = 10;

        int count = 1;
        int numberoftimes;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of times the message should be printed: ");
        numberoftimes = input.nextInt();

        while (count <= numberoftimes) {
            System.out.println("I love Computer Science!!");

            count++;
        }
		System.out.println("Message was printed " + numberoftimes + "times");
    }
}
