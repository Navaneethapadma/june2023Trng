import java.util.*;
class PalindromeNumbers{
public static void main(String[] args){
int num;
for(int i = 1; i <= 100; i++){
num = i;
int reversed = 0;
while (num != 0) {
int digit = num % 10;
reversed = reversed * 10 + digit;
num /= 10;
}
if(i == reversed){
System.out.print(i + " ");
}
}
}
}