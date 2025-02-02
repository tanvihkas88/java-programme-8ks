package homework_wk_8;

import java.util.Scanner;/*
Write a program in Java to display the pattern like a triangle with a number.   For eg.
 Input number of rows: 10
 Expected Output:
 1
 12
 123
 1234
 12345
 123456
 1234567
 12345678
 123456789
 12345678910

 */

public class Programme6_TrianglePattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of rows
        System.out.print("Input number of rows: ");
        int rows = scanner.nextInt();

        // Iterate through each row
        for (int i = 1; i <= rows; i++) {
            // Iterate through each column in the current row
            for (int j = 1; j <= i; j++) {
                System.out.print(j); // Print the number
            }
            System.out.println(); // Move to the next line after printing each row
        }

        scanner.close();
    }
}
