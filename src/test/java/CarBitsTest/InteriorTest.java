package CarBitsTest;

import CarConstructorBits.Interior;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InteriorTest {

    Interior interior;

    @Before
    public void before() {
        interior = new Interior(5, 4, "Brown");
    }

    @Test
    public void interiorHasSeats() {
        assertEquals(5, interior.getSeats());
    }

    @Test
    public void hasAirBags() {
        assertEquals(4, interior.getAirBags());
    }

    @Test
    public void hasColor() {
        assertEquals("Brown", interior.getColour());
    }
}
