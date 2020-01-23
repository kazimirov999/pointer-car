package company;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Red", "Mazda RX-8", 10, 50, 10000);
        myCar.distance();
        myCar.drive(10);
        myCar.reFuel(5);
    }
}
