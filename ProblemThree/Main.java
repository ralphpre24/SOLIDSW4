package ProblemThree;

public class Main {
  public static void main(String[] args) {
    BasicPhone basicPhone = new BasicPhone("Techno", "Only Call and SMS");
    Samsung samsung = new Samsung("Samsung 37", "Many Functionalites");
    Iphone iPhone = new Iphone("Iphone 300", "Many Premium Functionalites");

    basicPhone.makeCall();
    basicPhone.sendMSG();

    samsung.makeCall();
    samsung.sendMSG();
    samsung.browseWeb();
    samsung.takePicture();
    
    iPhone.makeCall();
    iPhone.sendMSG();
    iPhone.browseWeb();
    iPhone.takePicture();
  }  
}
