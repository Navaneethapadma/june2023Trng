class Oneobjtoanother
{
int id;
String name;
Oneobjtoanother(int i,String n)
{
id=i;
name=n;
}
Oneobjtoanother(Oneobjtoanother s)
{
id=s.id;
name=s.name;
}
void display()
{
System.out.println(id+" "+name);
}
public static void main(String args[])
{
Oneobjtoanother s1=new Oneobjtoanother(111,"Karan");
Oneobjtoanother s2=new Oneobjtoanother(s1);
s1.dispaly();
s2.display();
}
}
