//Write a Java program to add two binary numbers.

import java.util.Scanner;

public class Program16 {

    public static void main(String[] args) {

        Scanner Binary = new Scanner(System.in);
        System.out.println("Enter the 1st Binary Number :  ");
        String x = Binary.next();
        System.out.println("Enter the 2nd Binary Number :  ");
        String y = Binary.next();

        int n1 = Integer.parseInt(x, 2);
        int n2 = Integer.parseInt(x, 2);
        int n3 = n1+n2;
        System.out.println("n1 :  "+Integer.toBinaryString(n1));
        System.out.println("n2 :  "+Integer.toBinaryString(n2));
        System.out.println("n3=n1+n2 :  "+Integer.toBinaryString(n3));
    }
}
