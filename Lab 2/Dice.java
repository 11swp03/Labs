import java.util.Random;

public class Dice {
    public static void main(String[] args) {
    int die1;
    int die2;
    int Tdice;

    Random Genorator1 = new Random();
    Random Genorator2 = new Random();
    die1 = Genorator1.nextInt(5) + 1;
    die2 = Genorator2.nextInt(5) + 1;
    Tdice = (die1 + die2);

    System.out.println("First Die: " + die1);
    System.out.println("Second Die: " + die2);
    System.out.println("Total Value: " + Tdice);

    }
}
