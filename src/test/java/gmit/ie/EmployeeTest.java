package gmit.ie;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {
    @Test
    void testTitle()
    {
        String expectedTitle = "Mr";
        Employee e = new Employee("Mr", "Wilfred", "123456", "1234567", "Full-time", 20);
        assertEquals(expectedTitle, e.getTitle());
    }

    @Test
    void testInvalidTitle()
    {
        String expectedMessage = "Title must be Mr, Mrs or Miss";
        Exception e = assertThrows(
                IllegalArgumentException.class,
                ()-> new Employee("Invalid", "Wilfred", "123456", "1234567", "Full-time", 20)
        );
        assertEquals(expectedMessage, e.getMessage());
    }

    @Test
    void testName()
    {
        String expectedName = "Wilfred";
        Employee e = new Employee("Mr", "Wilfred", "123456", "1234567", "Full-time", 20);
        assertEquals(expectedName, e.getName());
    }

    @Test
    void testInvalidName()
    {
        String expectedMessage = "Name must be a minimum of 5 characters";
        Exception e = assertThrows(
                IllegalArgumentException.class,
                ()-> new Employee("Mr", "N/A", "123456", "1234567", "Full-time", 20)
        );
        assertEquals(expectedMessage, e.getMessage());
    }

    @Test
    void testPPSNum()
    {
        String expectedPPS = "123456";
        Employee e = new Employee("Mr", "Wilfred", "123456", "1234567", "Full-time", 20);
        assertEquals(expectedPPS, e.getPPS());
    }

    @Test
    void testInvalidPPS()
    {
        String expectedMessage = "PPS must be at least 6 characters long";
        Exception e = assertThrows(
                IllegalArgumentException.class,
                ()-> new Employee("Mr", "Wilfred", "0", "1234567", "Full-time", 20)
        );
        assertEquals(expectedMessage, e.getMessage());
    }

    @Test
    void testPhoneNum()
    {
        String expectedPhone = "1234567";
        Employee e = new Employee("Mr", "Wilfred", "123456", "1234567", "Full-time", 20);
        assertEquals(expectedPhone, e.getPhone());
    }

    @Test
    void testInvalidPhone()
    {
        String expectedMessage = "Phone Number must be at least 7 characters long";
        Exception e = assertThrows(
                IllegalArgumentException.class,
                ()-> new Employee("Mr", "Wilfred", "123456", "0", "Full-time", 20)
        );
        assertEquals(expectedMessage, e.getMessage());
    }

    @Test
    void testEmploymentType()
    {
        String expectedType = "Full-time";
        Employee e = new Employee("Mr", "Wilfred", "123456", "1234567", "Full-time", 20);
        assertEquals(expectedType, e.getEmploymentType());
    }

    @Test
    void testInvalidEmploymentType()
    {
        String expectedMessage = "Employment Type must be Full-time or Part-time";
        Exception e = assertThrows(
                IllegalArgumentException.class,
                ()-> new Employee("Mr", "Wilfred", "123456", "1234567", "N/A", 20)
        );
        assertEquals(expectedMessage, e.getMessage());
    }

    @Test
    void testAge()
    {
        int expectedAge = 20;
        Employee e = new Employee("Mr", "Wilfred", "123456", "1234567", "Full-time", 20);
        assertEquals(expectedAge, e.getAge());
    }

    @Test
    void testInvalidAge()
    {
        String expectedMessage = "Age must be over 18";
        Exception e = assertThrows(
                IllegalArgumentException.class,
                ()-> new Employee("Mr", "Wilfred", "123456", "1234567", "Full-time", 0)
        );
        assertEquals(expectedMessage, e.getMessage());
    }


}
