interface Payment {
    void pay(double amount); // Abstract method
}

class UpiPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via UPI.");
    }
}
class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via Credit Card.");
    }
}
public class PaymentSystem {
    public static void main(String[] args) {
        Payment upi = new UpiPayment();
        upi.pay(1000.50);
        Payment creditCard = new CreditCardPayment();
        creditCard.pay(5000.75);
    }
}
