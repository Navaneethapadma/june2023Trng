import java.util.Scanner;
public class CountVowelsCs{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
int count=0;
for(int i=0;i<=str.length()-1;i++){
if((str.charAt(i)=='A')||(str.charAt(i)=='a')
||(str.charAt(i)=='E')||(str.charAt(i)=='e')
||(str.charAt(i)=='I')||(str.charAt(i)=='i')
||(str.charAt(i)=='O')||(str.charAt(i)=='o')
||(str.charAt(i)=='U')||(str.charAt(i)=='u'))
{
count++;
}
}
System.out.println(count);
}
}