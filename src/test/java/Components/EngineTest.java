package Components;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void setUp(){
        engine = new Engine("Ford", "2.0 Turbo", "Sport");
    }

    @Test
    public void hasMake() {
        assertEquals("Ford", engine.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("2.0 Turbo", engine.getModel());
    }

    @Test
    public void hasType() {
        assertEquals("Sport", engine.getType());
    }
}
