import java.util.Scanner;
public class Countdigits{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int count=0;
for(int i=0;i<=str.length()-1;i++){
if(digitAt(i)) 
count++;
}
}
System.out.println(+digit);
}
