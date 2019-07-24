package People;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;

    @Before
    public void setUp(){
        customer = new Customer("John Smith", 50000);
    }

    @Test
    public void hasName() {
        assertEquals("John Smith", customer.getName());
    }

    @Test
    public void hasBudget() {
        assertEquals(50000, customer.getBudget());
    }

}
