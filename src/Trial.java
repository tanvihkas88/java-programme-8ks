import java.util.Scanner;

public class Trial {
    public void armstrong(int number) {
        int n = 0, temp, i = 0, sum = 0;  //Local variable

        //Logic for armstrong number
        temp = number;

        while (temp > 0) {
            temp = temp / 10;
            n = n + 1;

        }

        temp = number;
        int digit[] = new int[n]; //array declaration

        while (temp > 0) {

            digit[i] = temp % 10;

            sum = sum + (digit[i] * digit[i] * digit[i]);
            temp = temp / 10;

            i++;
        }

        if (number == sum) {

            System.out.println("Given number " + number + " is armstromg number");

        } else {

            System.out.println("Given number " + number + " is not armstromg number");
        }

    }

    //Main method
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = num.nextInt();

        Trial arm = new Trial();  //create object
        arm.armstrong(number); //call armstrong method in main method via object

    }

}
