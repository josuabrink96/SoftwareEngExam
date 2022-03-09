package gmit.ie;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {
    @Test
    void testTitle()
    {
        String expectedTitle = "Mr";
        Employee e = new Employee("Mr", "Wilfred");
        assertEquals(expectedTitle, e.getTitle());
    }

    @Test
    void testInvalidTitle()
    {
        String expectedMessage = "Invalid title entered";
        Exception e = assertThrows(
                IllegalArgumentException.class,
                ()-> new Employee("Invalid", "Wilfred")
        );
        assertEquals(expectedMessage, e.getMessage());
    }

    @Test
    void testName()
    {
        String expectedName = "Wilfred";
        Employee e = new Employee("Mr", "Wilfred");
        assertEquals(expectedName, e.getName());
    }

    @Test
    void testInvalidName()
    {
        String expectedMessage = "Invalid name entered";
        Exception e = assertThrows(
                IllegalArgumentException.class,
                ()-> new Employee("Mr", "N/A")
        );
        assertEquals(expectedMessage, e.getMessage());
    }
    
}
