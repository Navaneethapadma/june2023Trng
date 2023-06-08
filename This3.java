class A{
A(){
this(5);
System.out.println("hello a");
}
A(int X){
System.out.println(X);
}
}
class This3{
public static void main(String args[])
{
A a=new A();
}
}