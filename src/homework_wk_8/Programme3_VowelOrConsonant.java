package homework_wk_8;
/*
Write a Java program that takes the user to provide a single character from the
alphabet. Print Vowel of Consonant, depending on the user input. If the user input
Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
error message.
For eg:
Input an alphabet: p
Expected Output:
Input letter is Consonant
 */
import java.util.Scanner;

public class Programme3_VowelOrConsonant {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input an alphabet: ");
        String input = scanner.next();

        // Check if input is a single character
        if (input.length() == 1) {
            char ch = input.charAt(0);
            // Check if the character is an alphabet
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                // Convert to lowercase for simplicity
                ch = Character.toLowerCase(ch);
                // Check if it's a vowel or consonant
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println("Input letter is Vowel");
                } else {
                    System.out.println("Input letter is Consonant");
                }
            } else {
                System.out.println("Error: Input is not an alphabet.");
            }
        } else {
            System.out.println("Error: Input is not a single character.");
        }

        scanner.close();
    }
}

