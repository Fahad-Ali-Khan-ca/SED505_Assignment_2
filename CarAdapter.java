/**
 * An adapter class that adapts a Car to the Vehicle interface.
 * Created: Abhi Patel
 * Modified: Fahad Ali Khan, Inderpreet Parmar
 */
public class CarAdapter implements Vehicle {
    private Car car;

    /**
     * Constructs a CarAdapter with a specified Car instance.
     *
     * @param car The Car instance to adapt.
     */
    public CarAdapter(Car car) {
        this.car = car;
    }

    /**
     * Adds a specified amount of fuel to the car's fuel tank.
     *
     * @param amount The amount of fuel to add, in liters.
     */
    @Override
    public void addFuel(double amount) {
        car.carAddFuel(amount);
    }

    /**
     * Gets the total distance traveled by the car.
     *
     * @return The total distance traveled in kilometers.
     */
    @Override
    public double getTravelDistance() {
        return car.getCarDistance();
    }

    /**
     * Gets the total time spent traveling by the car.
     *
     * @return The total travel time in hours.
     */
    @Override
    public double getTravelTime() {
        return car.getCarTime();
    }

    /**
     * Gets the current fuel level in the car's fuel tank.
     *
     * @return The current fuel level in liters.
     */
    @Override
    public double getFuelLevel() {
        return car.getCarFuelLevel();
    }

    /**
     * Calculates and gets the fuel cost for the car's travel based on fuel consumption and fuel price.
     *
     * @return The fuel cost in dollars.
     */
    @Override
    public double getFuelCost() {
        return car.getCarFuelCost();
    }

    /**
     * Simulates the travel of the car for a specified distance.
     *
     * @param distance The distance to travel, in kilometers.
     */
    @Override
    public void travel(double distance) {
        car.carTravel(distance);
    }
}
