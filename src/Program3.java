public class Program3 {
// 3. Write a Java programme using the following steps.
//3.1 Declare one instance and one static variable.
//3.2 Declare one instance method.
//3.3 Declare one static method.
//3.4 Call both instance and static variables into both instance and static methods inside the print statement.
//3.5 Declare the Main method.
//3.6 Call both instance and static methods into the Main method and run the programme


    //Instance variable and static instance variable
    int a = 25;
    static int b = 35;

    //Static Instance Method
    public static void charlie() {
        Program3 ch = new Program3();
        System.out.println(ch.a);
        System.out.println(ch.b);
    }

    // Intance Method
    public void charlie1() {
        Program3 ch = new Program3();
        System.out.println(ch.a);
        System.out.println(ch.b);
    }
// Main Method
    public static void main(String[] args) {

        Program3 P3 = new Program3();
        P3.charlie1();
        charlie();
    }
}
