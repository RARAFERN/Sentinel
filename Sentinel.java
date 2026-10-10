import java.util.Scanner;

public class Sentinel {
    public static void main(String []args) {

        Scanner input = new Scanner(System.in);

        int score;
        int total = 0;
        int count = 0;
        double average = 0;

        System.out.print("Enter a score (-1 to stop): ");
        score = input.nextInt();// first input
        while (score != -1) {

            total += score;
            count++;

            System.out.print("Enter a score (-1 to stop): ");
            score = input.nextInt();// next input

            }
            average = (double) total / count;

                System.out.println("Total Score = " + total);
                System.out.println("Number of Quizzes = " + count);
                System.out.println("Average Score = " +average);

                input.close();

    }
}
