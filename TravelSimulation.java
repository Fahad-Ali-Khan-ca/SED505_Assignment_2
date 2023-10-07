//Created M.Watler
//TravelSimulation class that runs the entire program
//Modified: Fahad Ali Khan, Inderpreet Parmar

class TravelSimulation {
    public static void main(String[] args) {

        // Create instances of the legacy vehicle classes
        Boat boat = new Boat();
        Car car = new Car();
        Airplane airplane = new Airplane();

        // Create adapters for each vehicle
        Vehicle boatAdapter = new BoatAdapter(boat);
        Vehicle carAdapter = new CarAdapter(car);
        Vehicle airplaneAdapter = new AirplaneAdapter(airplane);

        // the boat travels 100km and information about the boat is printed
        boatAdapter.travel(100.0);
        VehicleUtility.printVehicleInformation(boatAdapter, "Boat");

        // the car travels 1000km and information about the car is printed
        carAdapter.travel(1000.0);
        VehicleUtility.printVehicleInformation(carAdapter, "Car");

        // the airplane travels 10000km and information about the airplane is printed
        airplaneAdapter.travel(10000.0);
        VehicleUtility.printVehicleInformation(airplaneAdapter, "Airplane");

        // Add fuel to each
        System.out.println();
        System.out.println("Adding fuel...");
        System.out.println();

        boatAdapter.addFuel(120);
        carAdapter.addFuel(40);
        airplaneAdapter.addFuel(50000);

        // Travel again
        // Boat
        boatAdapter.travel(100.0);
        VehicleUtility.printVehicleInformation(boatAdapter, "Boat");

        // Car
        carAdapter.travel(1000.0);
        VehicleUtility.printVehicleInformation(carAdapter, "Car");

        // Airplane
        airplaneAdapter.travel(10000.0);
        VehicleUtility.printVehicleInformation(airplaneAdapter, "Airplane");

        new java.util.Scanner(System.in).nextLine();
    }
}
