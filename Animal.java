class Animal
{
String color="white";
}
class Dog Extends animal
{
String color="black';
void printColor()
{
System.out.println(color);
System.out.println(super.color);
}
}
class TestSuper1
{
public static void main(String args[])
{
Dog d=new Dog();
d.