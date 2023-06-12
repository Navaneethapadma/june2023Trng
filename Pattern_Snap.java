import java.util.Scanner;

public class Pattern_Snap {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a character: ");
    char c = input.next().charAt(0);
    int n = 5;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(c + " ");
      }
      System.out.println();
    }
  }
}
