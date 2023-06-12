class Animal{
public void move(){
System.out.println("Call from animal class");}
}
class Wild extends Animal{
public void move(){
System.out.println("Call from Wild class");}
}
class Pet extends Animal{
public void move(){
System.out.println("Call from Pet class");}
}
class Hiarichial{
public static void main(String args[]){
Animal a=new Animal();
Animal w=new Wild();
Animal p=new Pet();
a.move();
w.move();
p.move();
}
}
