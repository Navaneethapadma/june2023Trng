import java.util.Scanner;
class PatternDiamond{
public static void printLine(char ch1,int nhash,char ch2,int nstar)
{
for(int i=0;i<nhash1;i++)System.out.print(ch1);
for(int i=0;i<nstar;i++)System.out.print(ch2);
for(int i=0;i<nhash;i++)System.out.print(ch1);
}
public static void printUpperPattern(int n,char ch){
for(i=n/2,j=1;i>=0 && j<=n;i--,j+=2)
{
printLine('#',i,ch,j);System.out.print("\n");}
}
public static void printLowerPattern(int n,char ch){
int i,j;
for(i=0,j=n;i<=n/2&&j>=1;i++,j-=2)
{
