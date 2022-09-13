package CarConstructorBits;

public class Interior {

    private int seats;
    private int airBags;
    private String colour;

    public Interior(int seats, int airBags, String colour) {
        this.seats = seats;
        this.airBags = airBags;
        this.colour = colour;
    }

    public int getSeats() {
        return seats;
    }

    public int getAirBags() {
        return airBags;
    }

    public String getColour() {
        return colour;
    }
}
