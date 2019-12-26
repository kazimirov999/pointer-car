package Car.com.company;

public class Car {

     public String color = "Red"; //колір автомобіля
        public String mark = "AUDI";  // марка автомобіля
        public int consumption = 10; // розхыд втомобіля
        public int volume = 50; // обєм пального в баці
        public int milrage = 20000; // пробіг


    void distanse() {
        System.out.println("Koлір автомобіля: " + color + "\n" + "Марка автомобіля: " + mark + "\n" +
                "Росход автомобиля: " + consumption + " л/100км" + "\n" +
                "Oбєм пального в баку: " + volume + "л." + "\n" + "Пробіг: " + milrage + " км");
        System.out.println("-----------------------------------------");
    }



    void grive(int km) {
        int out = km;

        if(out <= 500){
            System.out.println("Пального в баку достатньо");
            milrage +=out;
            System.out.println("Автомобыль проъхав "+ out +"\nЗагальний пробіг автомобіля "+ milrage +" км.");
        }else {
            System.out.println("Потрібна буде дозаправка");
            out -=40;
            System.out.println("Автомобіль проїхав " +out + " км.");
        }

        System.out.println("--------------------------------------------");
        }

        void reFuel(int fuelVolume){
         int fv = fuelVolume;
         int f = fv / consumption;
         float d = f;
            System.out.println(d);
        }
    }

