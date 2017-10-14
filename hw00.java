import java.util.Scanner;
/**
 *
 * Kimberly Duffy
 * Homework 00
 */
public class hw00 {
  public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("What is your first name?");
    String name = input.next();
    System.out.println("What is your last name?");
    String lname = input.next();
    System.out.println("What is your birthday? (Month Day, Year)");
    String birth_month = input.next();
    String birth_day = input.next();
    String dayOfBirth = birth_day.substring(0, birth_day.length()-1);
    int birth_year = Integer.parseInt(input.next());
    System.out.println("How old are you?");
    double age = input.nextInt();
    double martian_age = 0.530120481927711;
    System.out.println("What is your favorite color?");
    String fav_color = input.next();
    System.out.printf("Hi, %-15s %20s! I am so glad you used my application today. I see that your birthday is %30s. You will be turning %-8d. That would make you %-12.2f on Mars! Looking good! I will make sure that your birthday cake is %17s! I hope you have a wonderful day Mr./Mrs./Ms. %s!", name, lname, (birth_month + " " + dayOfBirth), (2017 - birth_year), (double) age * martian_age, fav_color, lname);
  }
}
