import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a, b, sum;

    System.out.println("Enter two integers: ");
    a = input.nextInt();
    b = input.nextInt();
    sum = a + b;

    System.out.println("The sum of " + a + " and " + b + " is " + sum + ".");
  }
}
