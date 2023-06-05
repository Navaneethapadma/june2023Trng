class Scope
{
public static void main(String args[])
{
int i;
i=10;
System.out.println("value of i "+i);
{
int j;
j=20;
i=i*j;
System.out.println(i);
System.out.println(j);
}
System.out.println(i);
}
}