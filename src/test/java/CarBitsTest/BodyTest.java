package CarBitsTest;

import CarConstructorBits.Body;
import CarConstructorBits.BodyStyle;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BodyTest {

    Body body;

    @Before
    public void before(){
        body = new Body(BodyStyle.COUPE);
    }

    @Test
    public void canGetFormat(){
        assertEquals(BodyStyle.COUPE, body.getFormat());
    }

}
