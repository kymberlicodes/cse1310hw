import java.util.Scanner;
/**
 *
 * Kimberly Duffy
 * Homework 02
 */
public class hw02 {

    public static void add() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first value:");
        int x = input.nextInt();
        System.out.println("Enter the second value:");
        int y = input.nextInt();
        int c = x + y;
        System.out.printf("%d + %d = %d", x, y, c);
        System.out.println("");
    }
    
    public static void subtract() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first value:");
        int x = input.nextInt();
        System.out.println("Enter the second value:");
        int y = input.nextInt();
        int c = x - y;
        System.out.printf("%d - %d = %d", x, y, c);
        System.out.println("");
    }
    
    public static void multiply() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first value:");
        int x = input.nextInt();
        System.out.println("Enter the second value:");
        int y = input.nextInt();
        int c = x * y;
        System.out.printf("%d x %d = %d", x, y, c);
        System.out.println("");
    }
    
    public static void divide() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first value:");
        double x = input.nextDouble();
        System.out.println("Enter the second value:");
        double y = input.nextDouble();
        double c = x / y;
        System.out.printf("%.0f / %.0f = %.2f", x, y, c);
        System.out.println("");
    }
    
    public static void power() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base value:");
        double x = input.nextDouble();
        System.out.println("Enter the exponent value:");
        double y = input.nextDouble();
        double c = Math.pow(x, y);
        System.out.printf("%.0f ^ %.0f = %.0f", x, y, c);
        System.out.println("");
    }
    
    public static void nthroot() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base value:");
        double x = input.nextDouble();
        System.out.println("Enter the root value:");
        double y = input.nextDouble();
        double root = 1/y;
        double c = Math.pow(x, root);
        System.out.printf("%.0f ^ (1 / %.0f) = %.2f", x, y, c);
        System.out.println("");
    }

    public static void modulus() {
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter the first value:");
      double x = input.nextDouble();
      System.out.println("Please enter the second value:");
      double y = input.nextDouble();
      double c = x % y;
      System.out.println(x + " % " + y + " = " + c);
      System.out.println("");
    }    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        boolean calcAgain = false;
        
        do {      
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Power");
        System.out.println("6. Root");
        System.out.println("7. Modulus");
        
        System.out.println("Please enter the number of the menu option that corresponds to the operation you'd like to perform:");
        int userInput = input.nextInt();    
            
        switch(userInput) {
            case 1:
                add();
                break;
            case 2:
                subtract();
                break;
            case 3:
                multiply();
                break;
            case 4:
                divide();
                break;
            case 5:
                power();
                break;
            case 6:
                nthroot();
                break;
            case 7:
                modulus();
                break;
            default:
                System.out.println("Invalid entry, number should be between 1 - 7.");
                
            }

        System.out.println("Would you like to perform another calculation?");
        String userInput2 = input.next();
        System.out.println("");
        if (userInput2.equalsIgnoreCase("y")) {
            calcAgain = true;
        } else {
            System.out.println("THANK YOU! GOODBYE!");
            System.exit(0);
        }

        } while(calcAgain); {

        
    }
        
    }
    
}
