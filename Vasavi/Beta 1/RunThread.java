
class RunsImps implements Runnable{   
    String name;
    RunsImps(String name){    this.name=name;  }
    public void run(){ // existing method gets overriden
        for(int i=1;i<=5;i++){    
            System.out.println(name + " : "+i); 
            try{
                Thread.sleep(10); 
            }
            catch(Exception e){
                    System.out.println("Thread is interrupted");
            }
        }
    }
}
public class RunThread {
    public static void main(String sdvhjk[])
    {
        Thread obj = new Thread( new RunsImps("ECE"));
        Thread obj2 = new Thread ( new RunsImps("Vasavi"));
        obj.start();
        obj2.start();
    }
}
