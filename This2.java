class A
{
A()
{System.out.println("hello a");}
A(int X)
{
this();
System.out.println(X);
}
}
class This2
{
public static void main(String args[])
{
A a=new A(10);
}
} 