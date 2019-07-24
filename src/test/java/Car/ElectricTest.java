package Car;

import Components.Body;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricTest {

    Electric electric;

    @Before
    public void setUp(){
        electric = new Electric("Tesla", "S3", "Ludecrus", 120000, "red");
    }

    @Test
    public void hasMake() {
        assertEquals("Tesla", electric.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("S3", electric.getModel());
    }

    @Test
    public void hasType() {
        assertEquals("Ludecrus", electric.getType());
    }

    @Test
    public void hasPrice() {
        assertEquals(120000, electric.getPrice());
    }

    @Test
    public void hasColour() {
        assertEquals("red", electric.getColour());
    }

}
