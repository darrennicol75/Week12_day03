package Components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BodyTest {

    Body body;

    @Before
    public void setUp(){
        body = new Body("Ford", "Mondeo", "Sport");
    }

    @Test
    public void hasMake() {
        assertEquals("Ford", body.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("Mondeo", body.getModel());
    }

    @Test
    public void hasType() {
        assertEquals("Sport", body.getType());
    }

}
