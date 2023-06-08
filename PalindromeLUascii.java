import java.util.Scanner;
class PalindromeLUascii
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
//s=s.toUpperCase();
String temp="";
int ascii;
for(int i=s.length()-1;i>=0;i--)
{
if(s.charAt(i)>='A' && s.charAt(i)<='Z')
{
ascii=s.charAt(i);
ascii-=32;
temp=temp+(char)ascii;
}
else
{
temp=temp+s.charAt(i);
}
}
System.out.println("temp:"+temp);
s=temp;
String rev="";
for(int i=s.length()-1;i>=0;i--){
rev=rev+s.charAt(i);}
if(s.equals(rev))
{
System.out.println("YES");
}
else
{
 System.out.println("NO");
}
}
}
