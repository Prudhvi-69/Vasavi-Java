// interface paymentGateway
// {
//     public void pay(double money);
// }
// class UPI implements paymentGateway
// {
//     public void pay(double money)
//     {
//         System.out.println("Paid Rs."+money+" using UPI");
//     }
// }
// class CreditCard implements paymentGateway
// {
//     public void pay(double money)
//     {
//         System.out.println("Paid Rs."+money+" using Credit Card");
//     }
// }
import java.util.Scanner;
public class Day3 {
    public static void main(String[] sdjf) {
        Scanner obj = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Enter 1st value : ");
        a=obj.nextInt();
        System.out.println("Enter 2nd value : ");
        b=obj.nextInt();
        try{  // code with errros will be inside try block
            System.out.println("Result : "+(a/b)); //Possible error
        }
        catch(Exception e){ // when there is error, ACTIVATES
            System.out.println("We got Exception and continuessss...");
        }
        finally{  // ACTIVATED everytime...............
            System.out.println("This is inside Finally");
        }
        System.out.println("Thanks for using Javaaaaa");
        
        //beryyyy berryyyy simpulll
        
        
        // goooooood goooooooooooduuu codinguuuuuu

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // CreditCard cc=new CreditCard();
        // cc.pay(14069.44);
        // UPI u = new UPI();
        // u.pay(69201.42);

    }
}
