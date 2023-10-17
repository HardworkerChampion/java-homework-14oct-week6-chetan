public class Program5 {

    //5. Write a program for a calculator with addition, subtraction, multiplication and division methods all with
    // parameters and use string concatenation methods.(Note: Two static and Two instance methods.)

    //Instance Method
    public void Addition() {
        int a = 2;
        int b = 4;
        int ans = a+b;
        System.out.println("Addition of two numbers " +a+ " and " +b+ "  is: " +ans+ "  ");

    }
// Instance Method
    public void Substraction() {
     int a = 2;
     int b = 4;
     int ans = a - b;
        System.out.println("Substraction of two number " +a+ " and " +b+ " is: " +ans+ " " );

    }
// Instance Static Method
    public static void Multiplication() {
        int a = 2;
        int b = 4;
        int ans = a * b;
        System.out.println("Multiplication of two number " +a+ " and "+b+"  is : " +ans+" ");
    }
// Instance Static Method
    public static void Division() {
        int a = 2;
        int b = 4;
        int ans = a / b;
        System.out.println("Division of two numbers " +a+ " and " +b+ "  is : " +ans+ " " );
    }
  // Main Method
    public static void main(String[] args) {
        Division();
        Multiplication();
        Program5 ABCD = new Program5();
       ABCD.Addition();
       ABCD.Substraction();

    }
}
