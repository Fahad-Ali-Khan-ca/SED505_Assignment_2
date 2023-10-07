public class CarAdapter implements Vehicle {
    private Car car;

    public CarAdapter(Car car) {
        this.car = car;
    }

    @Override
    public void addFuel(double amount) {
        car.carAddFuel(amount);
    }

    @Override
    public double getTravelDistance() {
        return car.getCarDistance();
    }

    @Override
    public double getTravelTime() {
        return car.getCarTime();
    }

    @Override
    public double getFuelLevel() {
        return car.getCarFuelLevel();
    }

    @Override
    public double getFuelCost() {
        return car.getCarFuelCost();
    }

    @Override
    public void travel(double distance) {
        car.carTravel(distance);
    }
}
