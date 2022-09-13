import CarConstructorBits.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership arnoldCodeClark;
    Body body;
    Engine engine;
    Interior interior;
    Tyres tyres;
    Car car;

    Customer customer;

    @Before
    public void before() {
        arnoldCodeClark = new Dealership(100000.00);
        body = new Body(BodyStyle.SEDAN);
        engine = new Engine(110, 2000);
        interior = new Interior(5, 4, "Grey");
        tyres = new Tyres(13, 4);
        car = new Car("Ford", "Focus", body, engine, tyres, interior,  CarType.HYBRID, "Blue", 8000);
        customer = new Customer(10000.00);
    }

    @Test
    public void hasNoCars() {
        assertEquals(0, arnoldCodeClark.getStock());
    }

    @Test
    public void hasCash() {
        assertEquals(100000.00, arnoldCodeClark.getTill(), 0.0);
    }

    @Test
    public void canAddCar() {
        arnoldCodeClark.addCar(car);
        assertEquals(1, arnoldCodeClark.getStock());
    }

    @Test
    public void getCar() {
        arnoldCodeClark.addCar(car);
        assertEquals(car, arnoldCodeClark.getCarToSell(car));
    }

    @Test
    public void carRemovedAfterGet() {
        arnoldCodeClark.addCar(car);
        arnoldCodeClark.removeCar(car);
        assertEquals(0, arnoldCodeClark.getStock());
    }

    @Test
    public void canSellCar(){
        arnoldCodeClark.addCar(car);
        arnoldCodeClark.sellCar(car, customer);
        assertEquals(0, arnoldCodeClark.getStock());
        assertEquals(1, customer.getOwnedCarsNumber());
        assertEquals(2000, customer.getWallet(), 0.0);
        assertEquals(108000, arnoldCodeClark.getTill(),0.0);

    }
}
