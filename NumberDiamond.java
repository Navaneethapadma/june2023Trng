import java.util.Scanner;
class NumberDiamond{
public static void printLine(int start,int stop){
for(int i=start;i<=stop;i++){System.out.print(i);
if(i<stop)System.out.print(",");
}
}
public static void printPattern(int n){
}

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
printPattern(n);
}
}
