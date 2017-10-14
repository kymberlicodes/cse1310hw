import java.util.Scanner;
/**
 *
 * Kimberly Duffy
 * Homework 01
 */
public class hw01 {
  public static void main(String [] args) {
  Scanner input = new Scanner(System.in);

  boolean Y = false;


  do {
  System.out.println("Please enter the number of the menu option that corresponds to the operation you'd like to perform:");
  System.out.println("1. Add");
  System.out.println("2. Subtract");
  System.out.println("3. Multiply");
  System.out.println("4. Divide");
  System.out.println("5. Power");
  System.out.println("6. Root");
  System.out.println("7. Modulus");
  int calculate = input.nextInt();

  switch (calculate) {
      case 1:
      System.out.println("Please enter the first value:");
      Double firstValueSum = input.nextDouble();
      System.out.println("Please enter the second value:");
      Double secondValueSum = input.nextDouble();
      Double sum = firstValueSum + secondValueSum;
      System.out.println(firstValueSum + " + " + secondValueSum + " = " + sum);
      break;
      case 2:
      System.out.println("Please enter the first value:");
      Double firstValueDiff = input.nextDouble();
      System.out.println("Please enter the second value:");
      Double secondValueDiff = input.nextDouble();
      Double difference = firstValueDiff - secondValueDiff;
      System.out.println(firstValueDiff + " - " + secondValueDiff + " = " + difference);
      break;
      case 3:
      System.out.println("Please enter the first value:");
      Double firstValueProduct = input.nextDouble();
      System.out.println("Please enter the second value:");
      Double secondValueProduct = input.nextDouble();
      Double product = firstValueProduct * secondValueProduct;
      System.out.println(firstValueProduct + " * " + secondValueProduct + " = " + product);
      break;
      case 4:
      System.out.println("Please enter the first value:");
      Double firstValueQuotient = input.nextDouble();
      System.out.println("Please enter the second value:");
      Double secondValueQuotient = input.nextDouble();
      Double quotient = firstValueQuotient / secondValueQuotient;
      System.out.println(firstValueQuotient + " / " + secondValueQuotient + " = " + quotient);
      break;
      case 5:
      System.out.println("Please enter the first value:");
      Double firstValueBase = input.nextDouble();
      System.out.println("Please enter the second value:");
      Double secondValueExponent = input.nextDouble();
      Double power = Math.pow(firstValueBase, secondValueExponent);
      System.out.println(firstValueBase + "^" + secondValueExponent + " = " + power);
      break;
      case 6:
      System.out.println("Please enter the a value:");
      Double firstValueRoot = input.nextDouble();
      Double root = Math.pow(firstValueRoot, .5);
      System.out.println(firstValueRoot + "^(1/2)" + " = " + root);
      break;
      case 7:
      System.out.println("Please enter the first value:");
      Double firstValueModulus = input.nextDouble();
      System.out.println("Please enter the second value:");
      Double secondValueModulus = input.nextDouble();
      Double modulus = firstValueModulus%secondValueModulus;
      System.out.println(firstValueModulus + "%" + secondValueModulus + " = " + modulus);
      break;
      default: System.out.println("Invalid input. Number should be between 1 and 7.");
      }

      System.out.println("Would you like to run another calculation?");
      String loopProgram = input.next();
      if (loopProgram.equalsIgnoreCase("y")) {
        Y = true;
      } else {
          System.out.println("Thanks!");
          System.exit(0);
      }

  } while(Y);

  }
}
