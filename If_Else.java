import java.util.*;
class If_Else
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int i=sc.nextInt();
int j=sc.nextInt();
System.out.println("value of i : "+i);
System.out.println("value of j : "+j);
if(j==0)
{
System.out.println("Division by error");
}
else
{
System.out.println(i+" Divided by "+j+" is "+(i/j));
}
}
}
