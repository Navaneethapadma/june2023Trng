import java.util.Scanner;

public class Series_1{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.print(num1 + ", ");
        while(num1 > num2) {
            num1 -= 3;
        System.out.print(num1+ ",");
    }
System.out.print("0");
}
}