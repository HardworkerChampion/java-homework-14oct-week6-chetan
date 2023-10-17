// Write a program to convert the upper case to lower case.

import java.util.Scanner;

public class Program9UpperCaseLowerCase {

    public static void main(String[] args) {

        char ch, ch2;
        System.out.println("Enter Any Charactor");
        Scanner UL = new Scanner(System.in);
        ch = UL.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            ch2 = Character.toLowerCase(ch);
            System.out.println("Lowercase " + ch2);
        } else {
            ch2 = Character.toUpperCase(ch);
            System.out.println("Uppercase " + ch2);
        }

    }

}
