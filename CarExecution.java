/*
Написати клас Машина, додати наступні поля: колір, марка, розхід, обʼєм пального в баці, пробіг. Написати метод: void drive(int km) — потрібно розрахувати чи вистачить пального на поїздку
по заданим даним, якщо вистачить вивести скільки машина проїхала і загальний пробіг, якщо не вистачить — вивести порахувати і вивести скільки машина змогла проїхати і загальний пробіг,
якщо пального не має вивести повідомлення про необхідність заправити машину. В перших 2-х випадках зменшити обʼєм пального на величину яка залежить від заданої довжини поїздки і розходу
пального. Написати метод: void reFuel(int fuelVolume). Написати метод: void distance() який виводить данні про машину і пробіг. Можна дописати машині любі необхідні поля, а також будь-яку
кількість конструкторів.
*/
public class CarExecution {
    public static void main(String[] args) {
        int tmp = 0;
        Car car1 = new Car ("Черний", "Volvo", 5000);

        car1.distance();

        tmp = car1.Range(); // Команда виклику сканера для введення даних з терміналу

        car1.drive(tmp);

    }

}
