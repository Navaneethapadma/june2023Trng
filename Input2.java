import java.util.Scanner;
class Input2add{
public static int add(int a,int b)
{
int c=a+b;
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
//5+7=12
System.out.println(num1 +"+"+num2+ "=" +add(num1,num2));
}//main()
}//Input2