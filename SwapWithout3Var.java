import java.util.Scanner;
class SwapWithout3Var{
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
int A,B;
A=scob.nextInt();
B=scob.nextInt();
A=A+B;
B=A-B;
A=A-B;
System.out.println(A + " "+ B);
}
}