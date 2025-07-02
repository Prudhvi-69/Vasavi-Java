class Task implements Runnable { 
//using Thread by implementing Runnable interface
    private String Name;
    Task(String name) { this.Name = name; } // assigning name
    public void run() { //auto call by start
        for (int i = 1; i <= 5; i++) {
        System.out.println(Name + " - Processing: " + i);
            try { 
                Thread.sleep(5000); //time to wait 
            } 
            catch (InterruptedException e) { }  
        }// any problem will enter into catch 
    }
}
public class MultiThreadExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Task("ECE"));
        Thread t2 = new Thread(new Task("M.Tech"));
        t1.start(); 
        t2.start(); 
    }
}
// in this code we are going to work with the concept of multi
// threading, so consider the code and learn multi thrreading