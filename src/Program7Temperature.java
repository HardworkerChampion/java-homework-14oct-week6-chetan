import java.util.Scanner;

//Write a program to insert any temperature value in degree Fahrenheit and convert to degree Celsius
// ((F − 32) × 5/9 = 0°C).
public class Program7Temperature {

    //Main Method

    public static void main(String[] args) {


        Scanner Temp = new Scanner(System.in);
        System.out.println("Enter the Celcius Value=");
        float A = Temp.nextFloat();
        float fahrenheit = (A * 5 / 9) / +32;
        System.out.println("The Fahrenheit value is = " + fahrenheit);

    }
}
