import java.util.Scanner;

public class Sentinelch {
    public static void main(String []args) {

        Scanner input = new Scanner(System.in);

        int amount;
        int total = 0;
        int count = 0;

        System.out.print("Enter an amount (0 to stop): ");
        amount = input.nextInt();// first input
        while (amount != 0) {

            total += amount;
            count++;

            System.out.print("Enter an amount (0 to stop): ");
            amount = input.nextInt();// next input

        }

        System.out.println("Total Amount = " + total);
        System.out.println("Number of Items Purchased = " + count);

        input.close();

    }
}

