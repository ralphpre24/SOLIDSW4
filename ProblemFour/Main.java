package ProblemFour;

public class Main {
   public static void main(String[] args) {
    Order order1 = new Order(new CreditCard(),"123");
    Order order2 = new Order(new Gcash(),"123");
    Order order3 = new Order(new Ewallet(),"123");

    PaymentProcessor process  = new PaymentProcessor();
    process.processPayment(order3);
    process.processPayment(order2);
    process.processPayment(order1);
   } 
}
