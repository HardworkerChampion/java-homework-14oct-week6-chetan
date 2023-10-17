import java.util.Scanner;

//Write a Java program to print the area and perimeter of a rectangle.
public class Program14 {
// Main Method
    public static void main(String[] args) {

        // Area = Height * Width
        // Perimeter = 2 * (Height + Width)

        Scanner scanner = new Scanner(System.in);

        double Height = 0.0;
        double Width = 0.0;
        double Area = 0.0;
        double Perimiter = 0.0;
        System.out.println("Enter the Height of the Rectangle :  ");
        Height = scanner.nextInt();
        System.out.println("Enter the Wi of the Rectangle :  ");
        Width = scanner.nextInt();

        Area = Height * Width;
        Perimiter = 2 * (Height + Width);

        System.out.println(" The Area of Rectangle is : " + Area);
        System.out.println("The Perimeter of Rectance is : " + Perimiter);

    }
}
