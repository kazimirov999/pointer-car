package company;

public class Car {

    public String color;
    public String brand;
    public double distance;
    public int km;
    public double fuelconsumption;
    public double volumeoffuel;
    public double allkm;

    public Car(String color, String brand, int fuelconsumption, int volumeoffuel, int allkm) {
        this.color = color;
        this.brand = brand;
        this.fuelconsumption = fuelconsumption;
        this.volumeoffuel = volumeoffuel;
        this.allkm = allkm;
    }

    public void drive(int km) {
        distance = 100 / this.fuelconsumption * this.volumeoffuel;
        System.out.println("Відстань, яку проїхав автомобіль: " + distance);
        System.out.println("Загальний пробіг: " + (allkm + distance));
    }

    public void reFuel(int volumeoffuel) {
        if (distance >= km) {
            System.out.println("Бензин зікінчився - потрібно заправити авто.");
        }
    }

    public void distance1() {
        System.out.println(this.color + " " + this.brand + ", пробіг: " + (allkm + distance));
    }

}
