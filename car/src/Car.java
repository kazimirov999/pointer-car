public class Car {

    private String brand = "ЗАЗ", color = "білий";
    private int mileage = 1000;
    private double expense = 10, fuelVolume = 25;

    public Car() {
    }

    public Car(String brand, String color, double expense, double fuelVolume, int mileage) {
        this.brand = brand;
        this.color = color;
        this.expense = expense;
        this.fuelVolume = fuelVolume;
        this.mileage = mileage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public double getExpense() {
        return expense;
    }

    public void setExpense(double expense) {
        this.expense = expense;
    }

    public double getFuelVolume() {
        return fuelVolume;
    }

    public void setFuelVolume(double fuelVolume) {
        this.fuelVolume = fuelVolume;
    }

    void drive(int km) {

        double fuelSpent = expense / 100 * km;              //Витрата пального на подолання заданої в методі дистанції
        if (fuelVolume == 0) System.out.println("Вибачте, але у вас порожній бак, заправте будь-ласка ваше авто :)");
        else if (fuelVolume > fuelSpent) {
            fuelVolume = fuelVolume - fuelSpent;        //Зменшуємо запаси палива відповідно до пройденої дистанції
            mileage = mileage + km;                     //Збільшуємо загальний пробіг
            System.out.println("Ваш " + brand + " проїхав " + km + " кілометрів, в баку залишилось " + fuelVolume +
                    "літрів пального, загальний пробіг складає " + mileage + " кілометрів");

        } else if (fuelVolume < fuelSpent) {
            double maxDistance = 100 / expense * fuelVolume;    //Максимальна дистанція яку може проїхати авто на своєму запасі пального
            fuelVolume = 0;                                 //Зменшуємо запаси палива відповідно до пройденої дистанції
            mileage = mileage + (int) maxDistance;
            System.out.println("Ваш " + brand + " проїхав " + (int) maxDistance + " до повного закінчення пального," +
                    " загальний пробіг складає " + mileage + " кілометрів");
        }
    }

    void reFuel(int volumeFuel) {
        fuelVolume = fuelVolume + volumeFuel;
    }

    void distance() {
        System.out.println("Ваше авто.........." + brand);
        System.out.println("Його колір........." + color);
        System.out.println("Витрата пального..." + expense);
        System.out.println("Пального в баку...." + fuelVolume);
        System.out.println("Загальний пробіг..." + mileage);
    }
}
/*
Написати клас Машина, додати наступні поля: колір, марка, розхід, обʼєм пального в баці, пробіг.
Написати метод: void drive(int km) — потрібно розрахувати чи вистачить пального на поїздку по заданим даним,
якщо вистачить вивести скільки машина проїхала і загальний пробіг, якщо не вистачить — вивести порахувати
і вивести скільки машина змогла проїхати і загальний пробіг, якщо пального не має вивести повідомлення про необхідність
заправити машину. В перших 2-х випадках зменшити обʼєм пального на величину яка залежить від заданої довжини поїздки
і розходу пального. Написати метод: void reFuel(int fuelVolume). Написати метод: void distance() який виводить данні про машину і пробіг.
Можна дописати машині любі необхідні поля, а також будь-яку кількість конструкторів.
*/