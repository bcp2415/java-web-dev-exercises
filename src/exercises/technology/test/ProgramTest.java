package exercises.technology.test;

import exercises.technology.Computer;
import exercises.technology.Laptop;
import exercises.technology.SmartPhone;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import java.time.LocalDate;

public class ProgramTest {

    Computer bozo = new Computer(1200, 5, "2019-09-01");
    Laptop tralala = new Laptop(5500, 1, "2022-01-01", "Windows Kablooey");
    SmartPhone iSpy = new SmartPhone(1000, 2, "2021-10-15", false);


    @Test
    public void getLifeRemainingAccurate() {
        System.out.println("Bozo's id is: " + bozo.getOwnId());
        System.out.println("Tralala's id is: " + tralala.getOwnId());
        System.out.println("iSpy's id is: " + iSpy.getOwnId());
        assertEquals(3, bozo.getLifeRemaining(), .001);
    }

    @Test
    public void testGetPrice() {
        assertEquals(1200, bozo.getPrice(), 0.001);
    }

    @Test
    public void testGetDatePurchased() {
        assertEquals(LocalDate.parse("2019-09-01"), bozo.getDatePurchased());
    }

    @Test
    public void testLaptopInheritsPrice() {
        assertEquals(5500, tralala.getPrice(), .001);
    }

    @Test
    public void testLaptopGetOperatingSystem() {
        assertEquals("Windows Kablooey", tralala.getOperatingSystem());
    }

    @Test
    public void testLaptopSetOperatingSystem() {
        tralala.setOperatingSystem("Linux Zazzle");
        assertEquals("Linux Zazzle", tralala.getOperatingSystem());
    }

    @Test
    public void testSmartPhoneGetLifeRemaining() {
        assertEquals(2, iSpy.getLifeExpectancy());
    }

    @Test
    public void testSmartPhoneIsDeGoogled() {
        assertFalse(iSpy.isDeGoogled());
    }

    @Test
    public void testSmartPhoneDeGoogle() {
        assertTrue(iSpy.setDeGoogled(true));
    }
}
