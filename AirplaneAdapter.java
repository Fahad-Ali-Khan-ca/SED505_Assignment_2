public class AirplaneAdapter implements Vehicle {
    private Airplane airplane;

    public AirplaneAdapter(Airplane airplane) {
        this.airplane = airplane;
    }

    @Override
    public void addFuel(double amount) {
        airplane.airplaneAddFuel(amount);
    }

    @Override
    public double getTravelDistance() {
        return airplane.getAirplaneDistance();
    }

    @Override
    public double getTravelTime() {
        return airplane.getAirplaneTime();
    }

    @Override
    public double getFuelLevel() {
        return airplane.getAirplaneFuelLevel();
    }

    @Override
    public double getFuelCost() {
        return airplane.getAirplaneFuelCost();
    }

    @Override
    public void travel(double distance) {
        airplane.airplaneTravel(distance);
    }
}
