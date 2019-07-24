package Car;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetrolTest {

    Petrol petrol;

    @Before
    public void setUp(){
        petrol = new Petrol("Ford", "Mondeo", "Sport", 35000, "blue");
    }

    @Test
    public void hasMake() {
        assertEquals("Ford", petrol.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("Mondeo", petrol.getModel());
    }

    @Test
    public void hasType() {
        assertEquals("Sport", petrol.getType());
    }

    @Test
    public void hasPrice() {
        assertEquals(35000, petrol.getPrice());
    }

    @Test
    public void hasColour() {
        assertEquals("blue", petrol.getColour());
    }
}
