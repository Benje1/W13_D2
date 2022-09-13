import CarConstructorBits.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class CustomerTest {

    Customer customer;
    Body body;
    Engine engine;
    Interior interior;
    Tyres tyres;
    Car car;


    @Before
    public void before(){
        customer = new Customer(10000.00);
        body = new Body(BodyStyle.SEDAN);
        engine = new Engine(110, 2000);
        interior = new Interior(5, 4, "Grey");
        tyres = new Tyres(13, 4);
        car = new Car("Ford", "Focus", body, engine, tyres, interior,  CarType.HYBRID, "Blue", 120000);
    }





    @Test
    public void testGetOwnedCars() {
        assertEquals(0, customer.getOwnedCarsNumber());
    }

    @Test
    public void testGetWallet() {
        assertEquals(10000.00, customer.getWallet(), 0.0);
    }

    @Test
    public void canAddCar() {
        customer.addCar(car);
        assertEquals(1, customer.getOwnedCarsNumber());
    }

    @Test
    public void canGetCarListback(){
        customer.addCar(car);
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car);
        assertEquals(cars, customer.getOwnedCars());
    }
}