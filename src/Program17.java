
//write a Java program to convert a decimal number to binary number.

import java.util.Scanner;

public class Program17 {

    //Main Method
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int[] arr;
        {
            int num;
            int index = 0;
            arr = new int[10];

            System.out.println(" Enter a Decimal Number:  ");

            num = user.nextInt();

            while (num > 0) ;
            {
                arr[index] = num % 2;
                index++;
                num = num / 2;


            }
            System.out.println("Binary number :   ");
            int i;
            for (i = index - 1; i >= 0; i--) ;

            System.out.println(arr[i]);
        }




    }


    }

