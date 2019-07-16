/*
Написати клас Машина, додати наступні поля: колір, марка, розхід, обʼєм пального в баці, пробіг. Написати метод: void drive(int km) — потрібно розрахувати чи вистачить пального на поїздку
по заданим даним, якщо вистачить вивести скільки машина проїхала і загальний пробіг, якщо не вистачить — вивести порахувати і вивести скільки машина змогла проїхати і загальний пробіг,
якщо пального не має вивести повідомлення про необхідність заправити машину. В перших 2-х випадках зменшити обʼєм пального на величину яка залежить від заданої довжини поїздки і розходу
пального. Написати метод: void reFuel(int fuelVolume). Написати метод: void distance() який виводить данні про машину і пробіг. Можна дописати машині любі необхідні поля, а також будь-яку
кількість конструкторів.
*/
import java.util.Objects;
import java.util.Scanner;

public class Car implements Interface.Car_Int{
    private String color;
    private String mark;
    private int fuel;
    //private int consumption = 0;
    private int mileage; // = (int) Math.random() * 10000;
    private boolean entered;
    private int dist;

    public Car(){
        System.out.println("Параметри не задані! Будь ласка введіть корректні дані.");
        return;
    }

    Car(String color, String mark,/* int fuel, int consumption,*/ int mileage) {
        this.color = color;
        this.mark = mark;
        //this.fuel = fuel;
        //this.consumption = consumption;
        this.mileage = mileage;
        System.out.println("Параметри: колір -> " + this.color + ", марка -> " + this.mark /*+ ", обʼєм пального в баці -> " + this.fuel +
                ", розхід -> " + consumption*/ + ", пробіг -> " + mileage);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    //public int getConsumption() {        return consumption;    }

    //public void setConsumption(int consumption) { this.consumption = consumption;    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return //getFuel() == car.getFuel() &&
                //getConsumption() == car.getConsumption() &&
                //getMileage() == car.getMileage() &&
                getColor().equals(car.getColor()) &&
                getMark().equals(car.getMark());
    };

    @Override
    public int hashCode() {
        return Objects.hash(getColor(), getMark()/*, getFuel(), getConsumption(), getMileage()*/);
    };

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", mark='" + mark + '\'' +
                //", fuel=" + fuel +
                //", consumption=" + consumption +
                //", mileage=" + mileage +
                '}';
    };

    //double var = CONSUMPTION * fuel;

    public void drive(int km){
        fuel  = (int) (Math.random() * 100)/2;
        double var = CONSUMPTION * fuel;
        //double var = CONSUMPTION * fuel;
        if (var >= km) {
            System.out.println("Палива у баку вистачає для поїздку без дозаправки.");
            System.out.println("Машина мусила проїхати " + km + " км., але може проїхати " + var + " км. Пробіг " + (mileage + var) + " км.");
        } else {
            int fuelVolume = (int)((km - var)/CONSUMPTION);
            System.out.println("Палива у баку НЕ вистачає для поїздку без дозаправки. Проїхала лише -> " + var + ". Пробіг " + (mileage + var) + " км.");
            reFuel(fuelVolume);
        }
    };

    public void reFuel(int fuelVolume) {
        System.out.println("Для подолання повної дистанції треба -> " + fuelVolume + " л.");
    };

    public void distance() {
        System.out.println();
        System.out.print("Дані параметри на машину:  \n");
        System.out.print("Колір: " + color + "\n");
        System.out.print("Марка: " + mark + "\n");
        System.out.print("Витрата палива на 1 км: " + CONSUMPTION + "\n");
        System.out.print("Пробіг: " + mileage + "\n");
        System.out.println();
    };

    public int Range() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Введіть яку дистанцію має подолати машина: ");
            if (scanner.hasNextInt()) {
                dist = scanner.nextInt();
                entered = false;
                return dist;
            } else
                scanner.next();
            return 0;
        } while (entered);
    };

}
