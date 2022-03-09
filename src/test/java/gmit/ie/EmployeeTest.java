package gmit.ie;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {
    @Test
    void testTitle()
    {
        String expectedTitle = "Mr";
        Employee e = new Employee("Mr", "Wilfred", "123456", "1234567");
        assertEquals(expectedTitle, e.getTitle());
    }

    @Test
    void testInvalidTitle()
    {
        String expectedMessage = "Invalid title entered";
        Exception e = assertThrows(
                IllegalArgumentException.class,
                ()-> new Employee("Invalid", "Wilfred", "123456", "1234567")
        );
        assertEquals(expectedMessage, e.getMessage());
    }

    @Test
    void testName()
    {
        String expectedName = "Wilfred";
        Employee e = new Employee("Mr", "Wilfred", "123456", "1234567");
        assertEquals(expectedName, e.getName());
    }

    @Test
    void testInvalidName()
    {
        String expectedMessage = "Invalid name entered";
        Exception e = assertThrows(
                IllegalArgumentException.class,
                ()-> new Employee("Mr", "N/A", "123456", "1234567")
        );
        assertEquals(expectedMessage, e.getMessage());
    }

    @Test
    void testPPSNum()
    {
        String expectedPPS = "123456";
        Employee e = new Employee("Mr", "Wilfred", "123456", "1234567");
        assertEquals(expectedPPS, e.getPPS());
    }

    @Test
    void testInvalidPPS()
    {
        String expectedMessage = "Invalid PPS entered";
        Exception e = assertThrows(
                IllegalArgumentException.class,
                ()-> new Employee("Mr", "Wilfred", "0", "1234567")
        );
        assertEquals(expectedMessage, e.getMessage());
    }

    @Test
    void testPhoneNum()
    {
        String expectedPhone = "1234567";
        Employee e = new Employee("Mr", "Wilfred", "123456", "1234567");
        assertEquals(expectedPhone, e.getPhone());
    }

    @Test
    void testInvalidPhone()
    {
        String expectedMessage = "Invalid Phone Number entered";
        Exception e = assertThrows(
                IllegalArgumentException.class,
                ()-> new Employee("Mr", "Wilfred", "123456", "0")
        );
        assertEquals(expectedMessage, e.getMessage());
    }


}
