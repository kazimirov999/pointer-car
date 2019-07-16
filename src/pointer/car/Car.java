package pointer.car;

public class Car {
    private String color;
    private String brand;
    private int tank;
    private int fuel;
    private float gasUsage;
    private float totalDistance;

    public Car(String brand, String color, int tank, float gasUsage) {
        this.brand = brand;
        this.color = color;
        this.tank = tank;
        this.gasUsage = gasUsage;
    }

    public Car(String brand, String color) {
        this(brand, color, 50, 8);
    }

    public void drive(int km) {
        if (km <= 0) {
            System.out.println("You have set negative or zero distance.");
            return;
        }

        if (fuel == 0) {
            System.out.println("The gas is run out. Please re-fuel the car.");
            return;
        }

        float distance = fuel / gasUsage * 100;

        if (km <= distance) {
            totalDistance +=km;
            fuel -= gasUsage * km / 100;
            System.out.println("Car is driven during " + km + ". Total distance is: " + totalDistance + " km.");
        } else {
            totalDistance += distance;
            fuel = 0; // all fuel are used.
            System.out.println("You cannot drive full distance. Car is driven during " + distance + ". Total distance is: " + totalDistance + " km.");
        }
    }

    public void reFuel(int fuelVolume) {
        System.out.println("You're re-fuel with : " + fuelVolume + " litters.");
        fuel += fuelVolume;

        if (tank < fuel) {
            System.out.println("The tank is full. Not all fuel are needed. Fuel left: " + (fuel - tank));
            fuel = tank;
        } else {
            System.out.println("The tank has " + fuel + " litters.");
        }
    }

    public void distance() {
        System.out.println("Car brand: ".concat(brand));
        System.out.println("Car color: ".concat(color));
        System.out.println("Tank is ".concat(tank);
        System.out.println("Total distance: ".concat(totalDistance));
    }
}
