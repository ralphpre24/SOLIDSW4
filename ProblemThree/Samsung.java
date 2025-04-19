package ProblemThree;

public class Samsung extends Phone implements Sms, Callable, BrowserSupport, Camera {

    Samsung(String brand, String specs) {
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
    @Override
    public void takePicture() {
        System.out.println(this.getBrand() + " take picture");
    }

    @Override
    public void browseWeb() {
        System.out.println(this.getBrand() + " Browse web");
    }
    
}
