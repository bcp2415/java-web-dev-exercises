package exercises.technology;

public class SmartPhone extends Computer {
    boolean deGoogled;

    public SmartPhone(double price, int lifeExpectancy, String datePurchased, boolean deGoogled) {
        super(price, lifeExpectancy, datePurchased);
        this.deGoogled = deGoogled;
    }

    public boolean isDeGoogled() {
        return deGoogled;
    }

    public boolean setDeGoogled(boolean deGoogled) {
        this.deGoogled = deGoogled;
        return this.deGoogled;
    }

    public void setDeGoogled() {
        deGoogled = true;
    }
}
