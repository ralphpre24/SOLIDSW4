package ProblemTwo;

public class SeniorCitizenDiscount implements Discount{
    
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.10;
    }

    
}