import java.util.ArrayList;

public class Customer {

    private ArrayList<Car> ownedCars;
    private double wallet;

    public Customer(double wallet) {
        this.ownedCars = new ArrayList<Car>();
        this.wallet = wallet;
    }

    public void addCar(Car car){
        this.ownedCars.add(car);
    }

    public ArrayList<Car> getOwnedCars() {
        return ownedCars;
    }

    public int getOwnedCarsNumber() {
        return this.ownedCars.size();
    }

    public double getWallet() {
        return wallet;
    }

    public void pay(double payment){
        this.wallet -= payment;
    }

    public void getPayed(Car car){
        this.wallet += car.getPrice();
    }

    public void buyCar(Car car){
        pay(car.getPrice());
        addCar(car);
    }

    public Car sellCar() {
        return this.ownedCars.remove(0);
    }
}
