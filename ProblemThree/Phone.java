package ProblemThree;

public class Phone {
    private String brand;
    private String specs;

    Phone(String brand, String specs){
        setBrand(brand);
        setSpecs(specs);
    }

    public String getBrand() {
        return brand;
    }

    public String getSpecs() {
        return specs;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }
}
