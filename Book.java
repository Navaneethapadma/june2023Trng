class Author
{
String authorName;
int age;
String place;
Author(String name,int age,String place)
{
this.authorName=name;
this.age=age;
this.place=place;
}
}
class Book
{
String name;
int price;
Author author;
Book(String n,int p,Author author)
{
this.name=n;
this.price=p;
this.author=author;
}
public static void main(String args[])
{
Author author=new Author("gayi",20,"USA");
Book b=new Book("java for begginner",800,author);
System.out.println("Book Name:"+b.name);
System.out.println("Book Price:"+b.price);
System.out.println("-----Author details-----");
System.out.println("Author age:"+b.author.age);
System.out.println("Author place:"+b.author.place);
}
}
