package gmit.ie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeListTest {
    Employee e;
    EmployeeList l;

    @BeforeEach
    void initEmployee()
    {
        e = new Employee("Mr", "Wilfred", "123456", "1234567", "Full-time", 20);
        l = new EmployeeList();
    }

    @Test
    void testAddEmployee()
    {
        l.addEmployee(e);
        assertTrue(l.getListSize() > 0);
    }

    @Test
    void testAddDuplicateEmployee()
    {
        String expectedMessage = "Employee already exists in list";
        l.addEmployee(e);

        Exception ex = assertThrows(
                IllegalArgumentException.class,
                ()-> l.addEmployee(e)
        );
        assertEquals(expectedMessage, ex.getMessage());
    }

    @Test
    void testInvalidEmployee()
    {
        String expectedMessage = "Unable to add null to list";

       Exception ex = assertThrows(
               IllegalArgumentException.class,
               ()-> l.addEmployee(null)
       );
       assertEquals(ex.getMessage(), expectedMessage);
    }
}
