package weekFive;

public class Apartment {
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter){
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment other){
        if(this.squareMeters > other.squareMeters){
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment otherApartment){
        return Math.abs((this.squareMeters*this.pricePerSquareMeter)-(otherApartment.squareMeters*otherApartment.pricePerSquareMeter));
    }

    public boolean moreExpensiveThan(Apartment otherApartment){
        return (this.squareMeters * this.pricePerSquareMeter) > (otherApartment.squareMeters * otherApartment.pricePerSquareMeter);
    }
}
