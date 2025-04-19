package ProblemThree;

public class BasicPhone extends Phone implements Sms, Callable{

    BasicPhone(String brand, String specs) {
        super(brand, specs);
    }

    @Override
    public void makeCall() {
        System.out.println(this.getBrand() + " makeCall");
    }

    @Override
    public void sendMSG() {
        System.out.println(this.getBrand() + " send Msg");
    }
    
}
