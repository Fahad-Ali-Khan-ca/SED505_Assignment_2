public class Vehicle {
    private double fuelEfficiency; // in km/L
    private double fuelCapacity; // in L
    private double currentFuelLevel; // in L
    private double distanceTraveled; // in km
    private double travelTime; // in hours

    public Vehicle(double fuelEfficiency, double fuelCapacity) {
        this.fuelEfficiency = fuelEfficiency;
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = fuelCapacity;
        this.distanceTraveled = 0;
        this.travelTime = 0;
    }

    public double getFuelEfficiency() {
        return fuelEfficiency;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public double getDistanceTraveled() {
        return distanceTraveled;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void drive(double distance) {
        double fuelNeeded = distance / fuelEfficiency;
        if (fuelNeeded > currentFuelLevel) {
            distanceTraveled += currentFuelLevel * fuelEfficiency;
            travelTime += currentFuelLevel * fuelEfficiency / distance;
            currentFuelLevel = 0;
        } else {
            distanceTraveled += distance;
            travelTime += distance / fuelEfficiency;
            currentFuelLevel -= fuelNeeded;
        }
    }

    public void refuel(double fuelAmount) {
        if (currentFuelLevel + fuelAmount > fuelCapacity) {
            currentFuelLevel = fuelCapacity;
        } else {
            currentFuelLevel += fuelAmount;
        }
    }
}

public class VehicleUtility {
    public static void printVehicleInformation(Vehicle vehicle, String vehicleType) {
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Travel Distance: " + /*...*/ + "km");
        System.out.println("Travel Time: " + /*...*/ + " hours");
        System.out.println("Current Fuel Level: " + /*...*/ + "L");
        System.out.println("Fuel Cost: $" + /*...*/);
        System.out.println();
    }
}