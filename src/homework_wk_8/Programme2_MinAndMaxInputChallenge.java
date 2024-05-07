package homework_wk_8;
/* Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered.
-Before the user enters the number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum
number.
Hint:
-Use an endless while loop.
-Create a class with the name MinAndMaxInputChallenge.
 */
import java.util.Scanner;

public class Programme2_MinAndMaxInputChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean firstIteration = true;

        while (true) {
            System.out.print("Enter number: ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (firstIteration) {
                    min = number;
                    max = number;
                    firstIteration = false;
                } else {
                    min = Math.min(min, number);
                    max = Math.max(max, number);
                }
            } else {
                System.out.println("Invalid input. Exiting...");
                break;
            }
        }

        if (!firstIteration) {
            System.out.println("Minimum number: " + min);
            System.out.println("Maximum number: " + max);
        }

        scanner.close();
    }
}

