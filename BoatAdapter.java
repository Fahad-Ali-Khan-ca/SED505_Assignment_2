/**
 * An adapter class that adapts the Boat to the Vehicle interface.
 * Created: Abhi Patel
 * Modified: Fahad Ali Khan, Inderpreet Parmar
 */
public class BoatAdapter implements Vehicle {
    private Boat boat;

    /**
     * Constructs a BoatAdapter with a specified Boat instance.
     *
     * @param boat The Boat instance to adapt.
     */
    public BoatAdapter(Boat boat) {
        this.boat = boat;
    }

    /**
     * Adds a specified amount of fuel to the boat's fuel tank.
     *
     * @param amount The amount of fuel to add, in liters.
     */
    @Override
    public void addFuel(double amount) {
        boat.boatAddFuel(amount);
    }

    /**
     * Simulates the travel of the boat for a specified distance.
     *
     * @param distance The distance to travel, in kilometers.
     */
    @Override
    public void travel(double distance) {
        boat.boatTravel(distance);
    }

    /**
     * Gets the total distance traveled by the boat.
     *
     * @return The total distance traveled in kilometers.
     */
    @Override
    public double getTravelDistance() {
        return boat.getBoatDistance();
    }

    /**
     * Gets the total time spent traveling by the boat.
     *
     * @return The total travel time in hours.
     */
    @Override
    public double getTravelTime() {
        return boat.getBoatTime();
    }

    /**
     * Gets the current fuel level in the boat's fuel tank.
     *
     * @return The current fuel level in liters.
     */
    @Override
    public double getFuelLevel() {
        return boat.getBoatFuelLevel();
    }

    /**
     * Calculates and gets the fuel cost for the boat's travel based on fuel consumption and fuel price.
     *
     * @return The fuel cost in dollars.
     */
    @Override
    public double getFuelCost() {
        return boat.getBoatFuelCost();
    }
}
