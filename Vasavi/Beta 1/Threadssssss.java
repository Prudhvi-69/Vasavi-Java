

class Process extends Thread{   
    String name;
    Process(String name){    this.name=name;  }
    public void run(){ // existing method gets overriden
        for(int i=1;i<=5;i++){    
            System.out.println(name + " : "+i); 
            try{
                Thread.sleep(10); 
            }
            catch(Exception e){
                    System.out.println("Thread is interrupted");
}}}}
public class Threadssssss {
    public static void main(String sdvhjk[])
    {
        Process obj = new Process("ECE");
        Process obj2 = new Process("Vasavi");
        obj.start();
        obj2.start();
    }
}
