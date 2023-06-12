import java.util.Scanner;
public class Remove
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print(str);
String str=sc.nextLine();
Scanner sc1=new Scanner(System.in);
System.out.print(ch);
String ch=sc1.nextLine();
System.out.print(charRemove(str,ch));
}
public static String charToRemove(String str,String ch)
{
return str.replace(ch," ");
}
}