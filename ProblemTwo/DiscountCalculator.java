package ProblemTwo;

public class DiscountCalculator {
   public double calculateDiscount(double amount, Discount discount){
        return amount - discount.applyDiscount(amount);
   } 
}
