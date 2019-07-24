package Components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WheelTest {

    Wheel wheel;

    @Before
    public void setUp(){
        wheel = new Wheel("Bridgestone", "26-47", "Sport");
    }

    @Test
    public void hasMake() {
        assertEquals("Bridgestone", wheel.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("26-47", wheel.getModel());
    }

    @Test
    public void hasType() {
        assertEquals("Sport", wheel.getType());
    }
}
