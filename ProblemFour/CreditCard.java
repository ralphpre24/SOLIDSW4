package ProblemFour;

public class CreditCard implements Payment {

    @Override
    public void pay() {
        System.out.println(" You are paying using credit card");
    }
    
}
