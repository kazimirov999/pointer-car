package company;

public class Car {

    public String color;
    public String brand;
    public int distance;
    public int km;
    public double fuelconsumption;
    public double volumeoffuel;
    public int allkm;
    public int exitfuel;
    public double mydistance;

    public Car() {

    }

    public Car(String color, String brand, int fuelconsumption, int volumeoffuel, int allkm) {
        this.color = color;
        this.brand = brand;
        this.fuelconsumption = fuelconsumption;
        this.volumeoffuel = volumeoffuel;
        this.allkm = allkm;
    }


    public void distance() {
        System.out.println(this.color + " " + this.brand + ", пробіг: " + (allkm + distance) + " " + "Пального в баці  " + volumeoffuel);
    }

    public double getVolumeoffuel() {
        double volumeoffuel = this.volumeoffuel;
        return volumeoffuel;
    }

    public void setVolumeoffuel(int volumeoffuel) {
        this.volumeoffuel = volumeoffuel;
    }

    public void drive(int km) {
        exitfuel = (int) ((fuelconsumption / 100) * km);
        if (volumeoffuel == 0) {
            System.out.println("NO FUEL");
        } else if (volumeoffuel > exitfuel) {
            volumeoffuel = volumeoffuel - exitfuel;
            distance = allkm + km;
            System.out.println(color + " " + brand + "проїхав " + km + "кілометрів");
            System.out.println("В баку є " + volumeoffuel + " палива  " + distance + "  Загальний пробіг");

        } else if (volumeoffuel < exitfuel) {
            mydistance = 100 / fuelconsumption * volumeoffuel;
            volumeoffuel = 0;
            allkm = (int) (allkm + mydistance);
            System.out.println(color + " " + brand + "проїхав     " + mydistance + "   на цьому паливі  " + "Загальний пробіг  " + allkm + "  кілометрів");

        }


    }

    public void reFuel(int refuel) {
        volumeoffuel = volumeoffuel + refuel;
    }
}




