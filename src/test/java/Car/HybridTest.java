package Car;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridTest {

    Hybrid hybrid;

    @Before
    public void setUp(){
        hybrid = new Hybrid("Toyota", "Prius", "Eco", 40000, "white");
    }

    @Test
    public void hasMake() {
        assertEquals("Toyota", hybrid.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("Prius", hybrid.getModel());
    }

    @Test
    public void hasType() {
        assertEquals("Eco", hybrid.getType());
    }

    @Test
    public void hasPrice() {
        assertEquals(40000, hybrid.getPrice());
    }

    @Test
    public void hasColour() {
        assertEquals("white", hybrid.getColour());
    }

}
