class Student{
int rollno;
String name;
static String college="MTIEAT";
static void change(){
college="A.M.REDDY";
}
Student(int r,String n){
rollno=r;
name=n;
}
void display()
{
System.out.println(rollno+" "+name+" "+college);
}
}
public class TestStaticMethod{
public static void main(String args[]){
Student.change();
Student s1=new Student(1,"THARUN");
Student s2=new Student(2,"SWETHA");
Student s3=new Student(3,"KAVYA");
s1.display();
s2.display();
s3.display();
}
}










