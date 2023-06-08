import java.util.Scanner;
class Palindrome1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String strobj=sc.nextLine();
//s=s.toLowerCase();
String r="";
for(int i=s.length()-1;i>=0;i--)
{
r=r+s.charAt(i);
}
//System.out.print(s+" "+r);
if(s.equalsIgnoreCase(r))
{
System.out.println("YES");
}
else
{
System.out.println("NO");
}
}
}
