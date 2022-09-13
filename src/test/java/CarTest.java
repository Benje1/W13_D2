import CarConstructorBits.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Body body;
    Engine engine;
    Interior interior;
    Tyres tyres;
    Car car;

    @Before
    public void before() {
        body = new Body(BodyStyle.SEDAN);
        engine = new Engine(110, 2000);
        interior = new Interior(5, 4, "Grey");
        tyres = new Tyres(13, 4);
        car = new Car("Ford", "Focus", body, engine, tyres, interior,  CarType.HYBRID, "Blue", 120000);
    }

    @Test
    public void carHasMake() {
        assertEquals("Ford", car.getMake());
    }

    @Test
    public void carHasModel(){
        assertEquals("Focus", car.getModel());
    }

    @Test
    public void carHasBody() {
        assertEquals(body, car.getBody());
    }

    @Test
    public void carHasEngine() {
        assertEquals(engine, car.getEngine());
    }

    @Test
    public void carHasTyers() {
        assertEquals(tyres, car.getTyres());
    }

    @Test
    public void carHasInterior() {
        assertEquals(interior, car.getInterior());
    }

    @Test
    public void carHasType() {
        assertEquals(CarType.HYBRID, car.getCarType());
    }

    @Test
    public void carHasColour() {
        assertEquals("Blue", car.getColour());
    }

    @Test
    public void carHasPrice() {
        assertEquals(120000, car.getPrice(), 0.0);
    }
}
