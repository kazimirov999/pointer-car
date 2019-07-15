package pointer.car;

public class Main {

    public static void main(String[] args) {
        Car bmw = new Car("BMW","black",60,8.1f);
        bmw.reFuel(60);
        bmw.drive(120);
        bmw.distance();
    }
}
