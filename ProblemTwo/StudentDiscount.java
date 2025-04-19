package ProblemTwo;

public class StudentDiscount implements Discount{

    @Override
    public double applyDiscount(double amount) {
        return amount * 0.05;
    }
    
    
}