public class PremiumRide extends Ride {
    private double comfortFee;
    private double surgeMultiplier;

    public PremiumRide(String rideId, double baseFare,
                       double comfortFee, double surgeMultiplier) {
        super(rideId, baseFare);

        this.comfortFee = comfortFee;

        if (surgeMultiplier < 1.0 || surgeMultiplier > 3.0) {
            System.out.println("Warning: Invalid surge multiplier. Set to 1.0.");
            this.surgeMultiplier = 1.0;
        } else {
            this.surgeMultiplier = surgeMultiplier;
        }
    }

    @Override
    public double calculateFare() {
        return (super.calculateFare() + comfortFee)
                * surgeMultiplier;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Type: Premium"
                + ", Comfort Fee: " + comfortFee + " TL"
                + ", Surge Multiplier: " + surgeMultiplier
                + ", Total Fare: " + calculateFare() + " TL";
    }
}