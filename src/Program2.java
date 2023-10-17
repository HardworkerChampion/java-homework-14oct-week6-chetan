public class Program2 {
  //2. Write a Java programme using the following steps

    // Static Instance Variable
  static int a = 15;
  static int b = 35;

  // Static Instance Method
  public static void charlie(){
    Program2 ch = new Program2();
    System.out.println(ch.a);
    System.out.println(ch.b);
  }

// Static Instance Method
  public static void main(String[] args) {
    Program2 P = new Program2();
    P.charlie();

  }
}
