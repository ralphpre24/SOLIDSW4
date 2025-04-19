package ProblemOne;

public class PetInfo {
    private String petName;    
    private String owner;
    PetInfo(String petName, String owner){
        setPetName(petName);
        setOwner(owner);
    }
    public String getPetName() {
        return petName;
    }
    public void setPetName(String petName) {
        this.petName = petName;
    }
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
}
