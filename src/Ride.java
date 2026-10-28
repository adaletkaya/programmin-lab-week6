import java.util.ArrayList;

public abstract class Ride {
    protected String rideId;
    protected double baseFare;

    public Ride(String rideId, double baseFare) {
        this.rideId = rideId;
        this.baseFare = baseFare;
    }

    public double calculateFare() {
        return baseFare;
    }

    @Override
    public String toString() {
        return "Ride ID: " + rideId +
                ", Base Fare: " + baseFare + " TL";
    }
    public static void main(String[] args) {

        ArrayList<Ride> rides = new ArrayList<>();

        rides.add(new EconomyRide("R101", 30, 20, 2));
        rides.add(new PremiumRide("R102", 100, 25, 1.5));
        rides.add(new SharedRide("R103", 120, 3));

        for (Ride ride : rides) {
            System.out.println(ride);
            System.out.println("-------------------------");
        }
    }

}