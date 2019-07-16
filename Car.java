public class Car {

    private String color;
    private String mark;
    private int consumption;
    private double volume;
    private double mileage;


    public Car(String color, String mark, int cons, double vol, double mil) {
        this.color = color;
        this.mark = mark;
        this.consumption = cons;
        this.volume = vol;
        this.mileage = mil;
    }


    public void drive(int km) {

        double volumeForTheTrip = consumption * km;
        double fuelLeft = volume - volumeForTheTrip;


        if (fuelLeft > 0) {
            System.out.println("Проехала: " + km + " км\n");
            System.out.println("Пробег: " + (km + mileage) + "км\n");
            mileage = mileage + km;
            volume = volume - volumeForTheTrip;
        } else if (fuelLeft <= 0) {
            double distance = volume / consumption;
            System.out.println("Проехала: " + distance + " км\n");
            System.out.println("Пробег: " + (distance + mileage) + "км\n");
            mileage = mileage + distance;
            volume = 0;
        } else if (consumption > volume || volume < volumeForTheTrip || volume == 0) {
            System.out.println("Не хватает топлива. Требуется дозаправка\n");
        }
    }

    public void reFuel(int fuelVolume) {
        volume = volume + fuelVolume;
        System.out.println("Заправлено на " + fuelVolume + " литров топлива\n");
        System.out.println("Топлива в баке: " + volume + " литров\n");
    }


    public void distace() {
        System.out.println("Цвет: " + color + "\n");
        System.out.println("Марка: " + mark + "\n");
        System.out.println("Пробег: " + mileage + "\n");
    }


    public String getColor() {
        return color;
    }

    public void setColor(String c) {
        this.color = c;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String m) {
        this.mark = m;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int c) {
        this.consumption = c;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double v) {
        this.volume = v;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mil) {
        this.mileage = mil;
    }
}
