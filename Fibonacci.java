import java.util.Scanner;
class Fibonacci{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int sum=0,n;
int a=0;
int b=1;
n=sc.nextInt();
while(sum<=n)
{
System.out.print(sum +" ");
a=b;
b=sum;
sum=a+b;
}
}
}

