import java.util.Scanner;

public class Program6CircleArea {
// Write a program to enter any radius value of the circle and find out the area.
// (Formula of Area A=PI*r*r).


    // Main Method
    public static void main(String[] args) {
        double radius, area;
        Scanner charlie = new Scanner(System.in);

        System.out.println("Enter the radius of the circle");
        radius = charlie.nextDouble();
        charlie.close();

        area = Math.PI * radius * radius;
        System.out.println("Area of the circle is " + area);

    }
}
