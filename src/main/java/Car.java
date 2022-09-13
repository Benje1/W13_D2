import CarConstructorBits.*;

public class Car {

    private String make;
    private String model;
    private Body body;
    private Engine engine;
    private Tyres tyres;
    private Interior interior;
    private CarType carType;
    private String colour;
    private double price;

    public Car(String make, String model, Body body, Engine engine, Tyres tyres, Interior interior, CarType carType, String colour, double price) {
        this.make = make;
        this.model = model;
        this.body = body;
        this.engine = engine;
        this.tyres = tyres;
        this.interior = interior;
        this.carType = carType;
        this.colour = colour;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Body getBody() {
        return body;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public Interior getInterior() {
        return interior;
    }

    public CarType getCarType() {
        return carType;
    }

    public String getColour() {
        return colour;
    }

    public double getPrice() {
        return price;
    }
}
