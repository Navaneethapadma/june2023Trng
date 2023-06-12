import java.util.Scanner;

public class Pattern2_Snap{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
   char c = input.next().charAt(0);
int n=input.nextInt();
   for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print(c);
      }
      System.out.println();
    }
  }
}

