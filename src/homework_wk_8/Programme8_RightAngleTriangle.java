package homework_wk_8;

/*
Display right angle triangle of @ using nested for loops
@
@@
@@@
@@@@
@@@@@
 */
public class Programme8_RightAngleTriangle {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the triangle

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for columns
            for (int j = 1; j <= i; j++) {
                System.out.print("@"); // Print "@" for each column
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }

}
