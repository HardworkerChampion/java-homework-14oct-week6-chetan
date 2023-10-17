import java.util.Scanner;

// Write a Java program that takes a number as input and prints its multiplication table up to 10.
public class Program10 {

// Main Method
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        System.out.println("Input a number");
        int num = Sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }


}
