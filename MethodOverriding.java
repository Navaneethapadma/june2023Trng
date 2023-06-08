class MethodOverriding{
final void run()
{
System.out.println("running");
}
}
class Honda extends MethodOverriding{
void run()
{
System.out.println("Running safely with 100km");
}

public static void main(String[] args)
{
Honda obh=new Honda();
obh.run();
}
}
