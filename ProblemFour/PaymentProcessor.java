package ProblemFour;

public class PaymentProcessor{

    public void processPayment(Order order){
        order.getPayment().pay();
    }
    
}
