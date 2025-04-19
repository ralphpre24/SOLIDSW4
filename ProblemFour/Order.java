package ProblemFour;

public class Order {
    private Payment payment;
    private String orderDetail;

    Order(Payment payment, String orderDetail){
        setPayment(payment);
        setOrderDetail(orderDetail);
    }
    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

     public String getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(String orderDetail) {
        this.orderDetail = orderDetail;
    }


}
