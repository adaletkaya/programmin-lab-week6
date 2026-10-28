public class EconomyRide extends Ride {
    private int durationMin;
    private double pricePerMinute;

    public EconomyRide(String rideId, double baseFare,
                       int durationMin, double pricePerMinute) {
        super(rideId, baseFare);
        this.durationMin = durationMin;
        this.pricePerMinute = pricePerMinute;
    }

    @Override
    public double calculateFare() {
        double fare = super.calculateFare()
                + durationMin * pricePerMinute;

        return Math.max(fare, 50.0);
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Type: Economy"
                + ", Duration: " + durationMin + " min"
                + ", Total Fare: " + calculateFare() + " TL";
    }
}