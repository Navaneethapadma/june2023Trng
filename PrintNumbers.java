import java.util.*;
class PrintNumbers
{
public static void main(String args[]){
int i;
i=1;
while(i<=10)
{
System.out.print(i);
if(i<10)
{
System.out.print(",");
}
i=i+1;
}
}
}