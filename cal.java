class cal extends Thread{
public static void main(String args[]){
cal obj=new cal();
Thread threadobj=new Thread();
threadobj.start();
System.out.println("Thread inside main are very much helpful in java");
}
public void run(){
System.out.println("Thraed from overhidden run method are very");
}
}