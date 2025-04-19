package ProblemTwo;

public class Customer {
    private String name;
    private Discount discount;
    Customer(String name, Discount discount){
        setName(name);
        setDiscount(discount);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Discount getDiscount() {
        return discount;
    }
    public void setDiscount(Discount discount) {
        this.discount = discount;
    }


}
