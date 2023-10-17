public class Program4 {

    //4. Write a Java programme using the following steps.

    //Instace variable and static instance variable
    int a = 20;
    int b = 40;
    static int c = 60;
    static int d = 80;

    // Instance Method
    public void alpha() {
        Program4 a1 = new Program4();
        System.out.println(a1.a);
        System.out.println(a1.b);
        System.out.println(a1.c);
        System.out.println(a1.d);
    }

    // Static Instance Method
    public static void alpha1() {
        Program4 a2 = new Program4();
        System.out.println(a2.a);
        System.out.println(a2.b);
        System.out.println(a2.c);
        System.out.println(a2.d);

    }

    // Main Method
    public static void main(String[] args) {
        Program4 AB = new Program4();
        alpha1();
        AB.alpha();

    }
}
