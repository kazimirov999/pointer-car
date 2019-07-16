public class Car {
    String color;
    String mark;
    int fuelWaste;
    int fuelVolume;
    int mileage;

    Car(String color, String mark, int fuelVolume, int fuelWaste, int mileage) {
        this.color = color;
        this.mark = mark;
        this.fuelVolume = fuelVolume;
        this.fuelWaste = fuelWaste;
        this.mileage = mileage;
    }

    void drive(int km) {
        int fuelRemain;
        mileage += km;
        fuelRemain = fuelVolume - (km + fuelWaste);
        if (fuelRemain > 0) {
            System.out.println("There will be enough fuel for full distance.\nYour travel distance will be " + km + " km\nMileage will be " + mileage + " km.");
        } else if (fuelRemain == 0) {
            int expectedTravelDistance;
            expectedTravelDistance = fuelWaste / fuelVolume;
            System.out.println("You are going to be our of fuel for this one.\nTravel distance will be " + expectedTravelDistance + " km\nMileage will be" + mileage + " km.");
        } else {
            System.out.println("You have to fill the car for going somewhere");
        }
    }

    void distance() {
        System.out.println("Your car color is " + color + "\nMark is " + mark + "\nMileage is " + mileage + " km.");
    }

    void reFuel(int fuelVolume) {
        this.fuelVolume += fuelVolume;
        System.out.println("Filling the car for " + fuelVolume + " litres of fuel");
        System.out.println("Total fuel volume is " + this.fuelVolume + " litres");
    }
}
