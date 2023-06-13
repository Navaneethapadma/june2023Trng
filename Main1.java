class Main extends Thread {
public static int amount=0;
public static void main(String args[]){
Main Thread=new Main();
Thread.start();
while(Thread.isAlive()){
System.out.println("waiting");
}
System.out.println("Main:"+amount);
amount++;
System.out.println("Main:"+amount);
}
public void run(){
amount++;
}
}  