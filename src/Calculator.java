import java.util.Scanner;

public class Calculator {
    static Scanner sc = new Scanner(System.in);
    static double c;

    public static void add (int a, int b){
        c = a + b;
        System.out.println(a + "+" + b + " = " + c + "\n" );
    }

    public  static void subtract (int a, int b){

        c = a - b;
        System.out.println(a + "-" + b + " = " + c + "\n");
    }

    public static void multiply (int a, int b){
        c = a * b;
        System.out.println(a + "*" + b + " = " + c + "\n" );
    }

    public static void divide (int a, int b){
        c = a / b;
        System.out.println(a + "/" + b + " = " + c + "\n" );
    }

    public static void sin (int a, int b){

        System.out.print("Which number? (a)" + a + " or (b)" + b + ": ");
        String sinChoice = sc.next();

        if (sinChoice.equals("a")) {
            double da = Math.toRadians(a);
            c = Math.sin(da);
            System.out.println("sin("+ a + ")" + " = " + c + "\n");
        }

        if (sinChoice.equals("b")) {
            double  db = Math.toRadians(b);
            c = Math.sin(db);
            System.out.println("sin(" + b + ")" + " = " + c + "\n");
        }
    }

    public static void cos (int a, int b){
        System.out.print("Which number? (a)" + a + " or (b)" + b + ": ");
        String cosChoice = sc.next();

        if (cosChoice.equals("a")) {
            double da = Math.toRadians(a);
            c = Math.cos(da);
            System.out.println("cos(" + a + ")" + " = " + c + "\n");
        }

        if (cosChoice.equals("b")) {
            double db = Math.toRadians(b);
            c = Math.cos(db);
            System.out.println("cos(" + b + ")" + " = " + c + "\n");
        }
    }

    public static void tan (int a, int b){
        System.out.print("Which number? (a)" + a + " or (b)" + b + ": ");
        String tanChoice = sc.next();

        if (tanChoice.equals("a")) {
            double da = Math.toRadians(a);
            c = Math.tan(da);
            System.out.println("tan("+ a + ")" + " = " + c + "\n");
        }

        if (tanChoice.equals("b")) {
            double db = Math.toRadians(b);
            c = Math.tan(db);
            System.out.println("tan("+ b + ")" + " = " + c + "\n");
        }
    }

    public static void sqrt (int a, int b){
        System.out.print("Which number? (a)" + a + " or (b)" + b + ": ");
        String sqrtChoice = sc.next();

        if (sqrtChoice.equals("a")) {
            c = Math.sqrt(a);
            System.out.println("sqrt(" + a + ")" + " = " + c + "\n");
        }
        if (sqrtChoice.equals("b")) {
            c = Math.sqrt(b);
            System.out.println("sqrt("+ b + ")" + " = " + c + "\n" );
        }
    }

    public static void exponentiation (int a, int b){
        System.out.print("(a) " + a + "^" + b + ", or (b) " + b + "^" + a + "? ");
        String powerChoice = sc.next();
        if (powerChoice.equals("a")) {
            c = Math.pow(a, b);
            System.out.println();
            System.out.println(a + "^" + b + " = " + c + "\n");
        }
        if (powerChoice.equals("b")) {
            c = Math.pow(b, a);
            System.out.println(b + "^" + a + " = " + c + "\n");


        }
    }
    public static void percent (int a, int b){
        System.out.print("(a) " + a + "%" + b + ", or (b) " + b + "%" + a + "? ");
        String modSymbolChoice = sc.next();
        if (modSymbolChoice.equals("a")) {
            c = a % b;
            System.out.println(a + "," + b + " = " + c + "\n");
        }
        if (modSymbolChoice.equals("b")) {
            c = b % a;
            System.out.println(b + "," + a + " = " + c + "\n");
        }
    }
    public static void mod (int a, int b){
        System.out.print("(a) " + a + " mod " + b + ", or (b) " + b + " mod " + a + "? ");
        String modChoice = sc.next();
        if (modChoice.equals("a")) {
            c = a % b;
            System.out.println(a + "," + b + " = " + c + "\n");
        }
        if (modChoice.equals("b")) {
            c = b % a;
            System.out.println(b + "," + a + " = " + c + "\n");
        }
    }
}

