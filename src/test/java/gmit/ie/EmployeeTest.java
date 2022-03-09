package gmit.ie;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {
    @Test
    void testTitle()
    {
        String expectedTitle = "Mr";
        Employee e = new Employee("Mr");
        assertEquals(expectedTitle, e.getTitle());
    }

    @Test
    void testInvalidTitle()
    {
        String expectedMessage = "Invalid title entered";
        Exception e = assertThrows(
                IllegalArgumentException.class,
                ()-> new Employee("Invalid")
        );
        assertEquals(expectedMessage, e.getMessage());
    }

}
