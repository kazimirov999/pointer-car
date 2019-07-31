/*Написати клас Машина, додати наступні поля: колір, марка, розхід, обʼєм пального в баці, пробіг.
 Написати метод: void drive(int km) — потрібно розрахувати чи вистачить пального на поїздку по заданим даним,
 якщо вистачить вивести скільки машина проїхала і загальний пробіг, якщо не вистачить — вивести порахувати і
 вивести скільки машина змогла проїхати і загальний пробіг, якщо пального не має вивести повідомлення про
 необхідність заправити машину. В перших 2-х випадках зменшити обʼєм пального на величину яка залежить від
 заданої довжини поїздки і розходу пального. Написати метод: void reFuel(int fuelVolume).
 Написати метод: void distance() який виводить данні про машину і пробіг.
 Можна дописати машині любі необхідні поля, а також будь-яку кількість конструкторів.
 */

public class Car1 {

    private String color = "Красный";
    private String brand = "Toyota" ;
    private float tank = 60;
    private float fuelConsumption = 7;
    private float fuelVolume = 50;
    private float totalDistance = 200;



    void drive(int km) {

        float powerReserve = fuelVolume / fuelConsumption*100;


        System.out.println("Запас хода автомобиля " + powerReserve + " км");

        if (powerReserve > km) {
            System.out.println("Автомобиль проехал " + km + " км");


        }else{
            System.out.println("Недостаточно топлива,запрвьте автомобиль " );

        }

    }
    public void reFuel(int fuelVolume) {


        if (tank <= fuelVolume) {
            System.out.println("Бак полный " );

        }else{
            System.out.println("Бак не полный,дозаправьте " + (tank - fuelVolume)+  " литров");

        }
    }

    public void distance() {
        System.out.println("Марка автомобиля: " + brand);
        System.out.println("Цвет автомобиля: " + color);
        System.out.println("Обьем бака: " + tank + " литров");
        System.out.println("Общий пробег: " + totalDistance + " км");
    }
}



