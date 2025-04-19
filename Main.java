package ProblemOne;
public class Main{
    public static void main(String[] args) {
    PetInfo caval = new PetInfo("Caval","Wonka");
    PetBehavior cavalBehavior = new PetBehavior(caval);

    System.out.println( cavalBehavior.makeSound());
    System.out.println( cavalBehavior.eat());
    }
}
