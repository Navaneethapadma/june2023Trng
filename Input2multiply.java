import java.util.Scanner;
class Input2multiply{
public static int multiply(int a,int b)
{
int c=a*b;
return c;
}
public static void main(String args[])
{
Scanner scob=new Scanner(System.in);
System.out.println("Enter a number:");
int num1;
num1=scob.nextInt();
System.out.println("Enter a number:");
int num2;
num2=scob.nextInt();
//5*7=35
System.out.println(num1 +"*"+num2+ "="+multiply(num1,num2));
}//main()
}//Input2