package exercises.technology;

import java.time.LocalDate;
import java.time.Period;

public class Computer extends AbstractEntity {
    double price;
    int lifeExpectancy;
    LocalDate datePurchased;

    public Computer(double price, int lifeExpectancy, String datePurchased) {
        this.price = price;
        this.lifeExpectancy = lifeExpectancy;
        this.datePurchased = LocalDate.parse(datePurchased);
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getDatePurchased() {
        return datePurchased;
    }

    public double getLifeRemaining() {
        LocalDate now = LocalDate.now();
        int years = Period.between(datePurchased, now).getYears();
        int yearsLeft = lifeExpectancy - years;
        return yearsLeft;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(int lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    public void setDatePurchased(LocalDate datePurchased) {
        this.datePurchased = datePurchased;
    }
}
