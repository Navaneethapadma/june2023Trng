import java.util.*;
class Findmax 
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
int j=sc.nextInt();
System.out.println("value of i : "+i);
System.out.println("value of j : "+j);
if(i<j)
{
System.out.println(j+" is maximum value");
System.out.println(i+" is minimum value");
}
else
{
System.out.println(i+" is maximum value");
System.out.println(j+" is minimum value");
}
}
}
