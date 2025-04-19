package ProblemTwo;

public class Main {
    public static void main(String[] args) {
        Customer student  = new Customer("Renard", new StudentDiscount());        
        Customer sCitizen  = new Customer("Carlo", new SeniorCitizenDiscount());        
        Customer regular  = new Customer("Elon", new RegularDiscount());        
        DiscountCalculator discountCalculator = new DiscountCalculator(); 

        System.out.println("Customer " + student.getName() +" " + discountCalculator.calculateDiscount(1000, student.getDiscount()));
        System.out.println("Customer " + sCitizen.getName() +" " + discountCalculator.calculateDiscount(1000, sCitizen.getDiscount()));
        System.out.println("Customer " + regular.getName() +" " + discountCalculator.calculateDiscount(1000, regular.getDiscount()));

    }
}