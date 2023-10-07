/**
 * An adapter class that adapts the airplane to the Vehicle interface.
 * Created: Abhi Patel
 * Modified: Fahad Ali Khan, Inderpreet Parmar
 */
public class AirplaneAdapter implements Vehicle {
    private Airplane airplane;
    /**
     * Constructs an AirplaneAdapter with a specified Airplane instance.
     *
     * @param airplane The Airplane instance to adapt.
     */
    public AirplaneAdapter(Airplane airplane) {
        this.airplane = airplane;
    }

    /**
     * Adds a specified amount of fuel to the airplane's fuel tank.
     *
     * @param amount The amount of fuel to add, in liters.
     */
    @Override
    public void addFuel(double amount) {
        airplane.airplaneAddFuel(amount);
    }

    /**
     * Gets the total distance traveled by the airplane.
     *
     * @return The total distance traveled in kilometers.
     */
    @Override
    public double getTravelDistance() {
        return airplane.getAirplaneDistance();
    }

    /**
     * Gets the total time spent traveling by the airplane.
     *
     * @return The total travel time in hours.
     */
    @Override
    public double getTravelTime() {
        return airplane.getAirplaneTime();
    }

    /**
     * Gets the current fuel level in the airplane's fuel tank.
     *
     * @return The current fuel level in liters.
     */
    @Override
    public double getFuelLevel() {
        return airplane.getAirplaneFuelLevel();
    }

    /**
     * Calculates and gets the fuel cost for the airplane's travel based on fuel consumption and fuel price.
     *
     * @return The fuel cost in dollars.
     */
    @Override
    public double getFuelCost() {
        return airplane.getAirplaneFuelCost();
    }

    /**
     * Simulates the travel of the airplane for a specified distance.
     *
     * @param distance The distance to travel, in kilometers.
     */
    @Override
    public void travel(double distance) {
        airplane.airplaneTravel(distance);
    }
}