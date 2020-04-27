package Application;

import Car.Car;
import Parking.Parking;

public class Application {
    public static void main(String[] args) {
        Parking p1 = new Parking();
        Car c1 = new Car("BMW", "[AB-123]");
        Car c2 = new Car("Fiat", "[XY-567]");

        p1.parkCar(c1, "1A");
        p1.parkCar(c2, "2C");
        p1.printMap();
        p1.getFreePlaces();
    }
}
