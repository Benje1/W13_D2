import CarConstructorBits.CarType;

import java.util.HashMap;

public class Dealership {

    private double till;
    private HashMap<CarType, Car> stock;

    public Dealership(double till) {
        this.till = till;
        this.stock = new HashMap<>();
    }

    public double getTill() {
        return till;
    }

    public int getStock() {
        return stock.size();
    }

    public void addCar(Car car){
        stock.put(car.getCarType(), car);
    }

    public void getPayment(Car car){
        this.till += car.getPrice();
    }

    public void payForCar(Car car){
        this.till -= car.getPrice();
    }

    public void sellCar(Car car, Customer customer) {
        customer.buyCar(car);
        getPayment(car);
        removeCar(car);
    }

    public void buyCar(Car car){
        payForCar(car);
        addCar(car);
    }

//    needs work
    public void buyCar(Customer customer){
        payForCar(customer.);
        addCar(customer.sellCar());
    }

    public Car getCarToSell(Car car){
        return this.stock.get(car.getCarType());
    }

    public void removeCar(Car car){
        this.stock.remove(car.getCarType());
    }

}
