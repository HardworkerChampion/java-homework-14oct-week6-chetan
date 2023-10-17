import java.util.Scanner;

// 8. Write a program to calculate the area of a triangle.

public class Program8Triangle {
    //Main Method
    public static void main(String[] args) {

        int a, b, c, sp;
        double area;
        System.out.println("Enter Value for sides of Triangle");
        Scanner Tr = new Scanner(System.in);
        a = Tr.nextInt();
        b = Tr.nextInt();
        c = Tr.nextInt();
        sp = (a + b + c) / 2;
        area = Math.sqrt(sp * (sp - a) * (sp - b) * (sp - c));
        System.out.println("Area of Triange" + area);
    }

}
