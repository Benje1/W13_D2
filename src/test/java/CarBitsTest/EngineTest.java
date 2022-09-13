package CarBitsTest;

import CarConstructorBits.Engine;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before(){
        engine = new Engine(120, 2000);
    }

    @Test
    public void canGetHorsePower(){
        assertEquals(120, engine.getHorsePower());
    }

    @Test
    public void canGertCapacity(){
        assertEquals(2000, engine.getCapacity());
    }

}
