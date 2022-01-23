package exercises.technology;

import java.time.LocalDate;

public class Laptop extends Computer {
    private String operatingSystem;

    public Laptop(double price, int lifeExpectancy, String datePurchased, String operatingSystem) {
        super(price, lifeExpectancy, datePurchased);
        this.operatingSystem = operatingSystem;
    }

    public void setOperatingSystem(String os) {
        this.operatingSystem = os;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }
}
