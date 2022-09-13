package CarBitsTest;

import CarConstructorBits.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyersTest {

    Tyres tyres;

    @Before
    public void setUp() {
        tyres = new Tyres(13, 4);
    }

    @Test
    public void tyresHasSize() {
        assertEquals(13, tyres.getSize());
    }

    @Test
    public void tyresHasWidth() {
        assertEquals(4, tyres.getWidth());
    }
}
