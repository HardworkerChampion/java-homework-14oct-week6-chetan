//13. Write a Java program that takes
// three numbers as input to calculate and print the average of the numbers.

import java.util.Scanner;

public class Program13Average {
    // Main Method
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = Input.nextInt();
        System.out.println("Enter second number");
        int num2 = Input.nextInt();
        System.out.println("Enter third number");
        int num3 = Input.nextInt();

        System.out.println("Average of given 3 number is : " + "\t" + (num1 + num2 + num3) / 3);
    }
}
