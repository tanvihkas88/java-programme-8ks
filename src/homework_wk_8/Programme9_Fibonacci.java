package homework_wk_8;

/*
Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Programme9_Fibonacci {

    public static void main(String[] args) {
        int n = 8; // Number of terms to print in the Fibonacci sequence

        // Print Fibonacci sequence
        fibonacci(n);
    }

    // Method to print the Fibonacci sequence
    public static void fibonacci(int n) {
        int first = 1, second = 1;
        System.out.print(first + " " + second + " "); // Print the first two terms

        // Generate the subsequent terms
        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }

}
