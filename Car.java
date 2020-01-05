public class Car {
    public double expenditure;
    public double volumefuel;
    public double mileage;
    public String color;
    public String brand;
    public double distance;
    public double km;

    public Car(String color, String brand, double expenditure, double volumefuel, double mileage){
        this.color = color;
        this.brand = brand;
        this.expenditure = expenditure;
        this.volumefuel = volumefuel;
        this.mileage = mileage;
    }
    public void drive(double km) {
        distance = 300.0 / this.expenditure * this.volumefuel;
        System.out.println("Скільки проїхав автомобіль : " + distance + ", " + "Разом: " + (mileage + distance)+"км");
    }

    public void distance1 () {
        System.out.println(this.color + " " + this.brand + ", кілометраж: " + (mileage+distance)+"км");
    }
    public void Fuel(double volumefuel) {
        if (distance >= km){
            System.out.println("Бензин закінчися");
        }
    }
}
