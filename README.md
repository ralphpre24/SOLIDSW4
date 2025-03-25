# SOLIDSW4

Ralph Nikko M. Predas
2BSCS-1

1.) The following object violates Single Responsibility Principle (SRP). Make the
adjustment in a form of java code to correct the violation. (25 points)
// Pet.java (Data-Focused)
public class Pet {
 private String petName;
 private String owner;
 public Pet(String petName, String owner) {
 this.petName = petName;
 this.owner = owner;
 }
 public String getPetName() {
 return petName;
 }
 public String getOwner() {
 return owner;
 }
 // No behavior methods here!
}
// PetBehavior.java (Behavior-Focused)
public class PetBehavior {
 public String makeSound(Pet pet) {
 // Implement the sound logic here based on the pet type
 if (pet.getPetName().equals("Buddy")) { // Example: Different sound for different
pets
 return "Woof!";
 } else {
 return "Meow!";
 }
 }
 public String eat(Pet pet) {
 // Implement the eating logic here
 return pet.getPetName() + " is eating.";
 }
}
// Example Usage
public class Main {
 public static void main(String[] args) {
 Pet myPet = new Pet("Buddy", "Alice");
 PetBehavior petBehavior = new PetBehavior();
 System.out.println(petBehavior.makeSound(myPet)); // Output: Woof!
 System.out.println(petBehavior.eat(myPet)); // Output: Buddy is eating.
 }
}

2.) The following code violates the Open/Close Principle. Refactor the program to
remove the violation (25 points).
// DiscountStrategy.java (Interface)
interface DiscountStrategy {
 double calculateDiscount(double amount);
}
// StudentDiscount.java (Concrete Implementation)
class StudentDiscount implements DiscountStrategy {
 @Override
 public double calculateDiscount(double amount) {
 return amount * 0.05;
 }
}
// SeniorCitizenDiscount.java (Concrete Implementation)
class SeniorCitizenDiscount implements DiscountStrategy {
 @Override
 public double calculateDiscount(double amount) {
 return amount * 0.10;
 }
}
// RegularDiscount.java (Concrete Implementation)
class RegularDiscount implements DiscountStrategy {
 @Override
 public double calculateDiscount(double amount) {
 return 0.0; // No discount for Regular
 }
}
// Customer.java (Refactored)
public class Customer {
 private String name;
 private DiscountStrategy discountStrategy;
 public Customer(String name, DiscountStrategy discountStrategy) {
 this.name = name;
 this.discountStrategy = discountStrategy;
 }
 public double calculateDiscount(double amount) {
 return discountStrategy.calculateDiscount(amount);
 }
 public double applyDiscount(double amount) {
 return amount - calculateDiscount(amount);
 }
}
// Example Usage
public class Main {
 public static void main(String[] args) {
 Customer student = new Customer("Alice", new StudentDiscount());
 Customer senior = new Customer("Bob", new SeniorCitizenDiscount());
 Customer regular = new Customer("Charlie", new RegularDiscount());
 double amount = 100.0;
 System.out.println("Student Discount: " + student.calculateDiscount(amount));
 System.out.println("Senior Citizen Discount: " + senior.calculateDiscount(amount));
 System.out.println("Regular Discount: " + regular.calculateDiscount(amount));
 }
}

3.) The following design has the following problem:
● The SmartPhone interface defines methods for making calls, sending SMS,
browsing the web, and taking pictures.
● While smartphones (Iphone and Samsung) can utilize all functionalities, a
basic phone (BasicPhone) only needs calling and SMS capabilities.
● Forcing the BasicPhone class to implement unused methods (browseWeb
and takePicture) violates ISP.
Show your solution in codes how to remove the Interface Segregation problem.
 // BasicCommunication.java (Interface for basic communication)
interface BasicCommunication {
 void makeCall(String number);
 void sendSMS(String number, String message);
}
// WebBrowsing.java (Interface for web browsing)
interface WebBrowsing {
 void browseWeb(String url);
}
// Camera.java (Interface for taking pictures)
interface Camera {
 void takePicture();
}
// BasicPhone.java (Implementation of BasicCommunication only)
class BasicPhone implements BasicCommunication {
 @Override
 public void makeCall(String number) {
 System.out.println("BasicPhone calling " + number);
 }
 @Override
 public void sendSMS(String number, String message) {
 System.out.println("BasicPhone sending SMS to " + number + ": " + message);
 }
}
// Samsung.java (Implementation of all interfaces)
class Samsung implements BasicCommunication, WebBrowsing, Camera {
 @Override
 public void makeCall(String number) {
 System.out.println("Samsung calling " + number);
 }
 @Override
 public void sendSMS(String number, String message) {
 System.out.println("Samsung sending SMS to " + number + ": " + message);
 }
 @Override
 public void browseWeb(String url) {
 System.out.println("Samsung browsing " + url);
 }
 @Override
 public void takePicture() {
 System.out.println("Samsung taking a picture");
 }
}
// IPhone.java (Implementation of all interfaces)
class IPhone implements BasicCommunication, WebBrowsing, Camera {
 @Override
 public void makeCall(String number) {
 System.out.println("IPhone calling " + number);
 }
 @Override
 public void sendSMS(String number, String message) {
 System.out.println("IPhone sending SMS to " + number + ": " + message);
 }
 @Override
 public void browseWeb(String url) {
 System.out.println("IPhone browsing " + url);
 }
 @Override
 public void takePicture() {
 System.out.println("IPhone taking a picture");
 }
}
// Example Usage
public class Main {
 public static void main(String[] args) {
 BasicPhone basicPhone = new BasicPhone();
 Samsung samsung = new Samsung();
 IPhone iPhone = new IPhone();
 basicPhone.makeCall("123-456-7890");
 basicPhone.sendSMS("123-456-7890", "Hello!");
 samsung.browseWeb("www.example.com");
 samsung.takePicture();
 iPhone.browseWeb("www.example.com");
 iPhone.takePicture();
 }
}

4.) Refactor the following codes applying the Dependency Inversion Principle (25
points): Naming Conventions:
1. Class name must be a NOUN (singular)
2. Class names must start with capital letters.
3. Attribute name and method name should start with a small letter.
4. Method name should be a verb.

// PaymentMethod.java (Interface for payment methods)
interface PaymentMethod {
 void processPayment(double amount);
 String getPaymentType(); // Added to get the payment type for logging
}
// EWallet.java (Concrete implementation for e-wallet)
class EWallet implements PaymentMethod {
 @Override
 public void processPayment(double amount) {
 // Implement e-wallet payment logic here
 System.out.println("Processing e-wallet payment of " + amount);
 }
 @Override
 public String getPaymentType() {
 return "ewallet";
 }
}
// CreditCard.java (Concrete implementation for credit card)
class CreditCard implements PaymentMethod {
 @Override
 public void processPayment(double amount) {
 // Implement credit card payment logic here
 System.out.println("Processing credit card payment of " + amount);
 }
 @Override
 public String getPaymentType() {
 return "creditcard";
 }
}
// CashPayment.java (Concrete implementation for cash)
class CashPayment implements PaymentMethod {
 @Override
 public void processPayment(double amount) {
 // Implement cash payment logic here
 System.out.println("Processing cash payment of " + amount);
 }
 @Override
 public String getPaymentType() {
 return "cash";
 }
}
// Order.java (Assuming Order class exists)
class Order {
 private double amount;
 private String paymentMethod;
 public Order(double amount, String paymentMethod) {
 this.amount = amount;
 this.paymentMethod = paymentMethod;
 }
 public double getAmount() {
 return amount;
 }
 public String getPaymentMethod() {
 return paymentMethod;
 }
}
// PaymentProcessor.java (Refactored)
public class PaymentProcessor {
 public void processPayment(Order order, PaymentMethod paymentMethod) {
 paymentMethod.processPayment(order.getAmount());
 System.out.println("You are paying using " + paymentMethod.getPaymentType());
 }
}
// Example Usage
public class Main {
 public static void main(String[] args) {
 Order ewalletOrder = new Order(100.0, "ewallet");
 Order creditCardOrder = new Order(50.0, "creditcard");
 Order cashOrder = new Order(20.0, "cash");
 PaymentProcessor processor = new PaymentProcessor();
 processor.processPayment(ewalletOrder, new EWallet());
 processor.processPayment(creditCardOrder, new CreditCard());
 processor.processPayment(cashOrder, new CashPayment());
 }
}
