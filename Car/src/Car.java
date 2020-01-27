public class Car {
    public String color;
    public String brand;
    public double expense;// розхід
    public double gas_tank; // обьем баку
    public double mileage; // пробіг
    public double total_mileage; // загальний пробіг
    public int km;


       public Car() {
        this.color = "Black";
        this.brand = "Nissan";
        this.expense = 10;
        this.gas_tank = 55;
        this.mileage = 300;
        this.total_mileage = total_mileage;
        this.km = 70;
    }
    public void drive(int km) {
        double Fuel_consumption = expense / 100 * mileage;     //Витрата пального на подолання заданої в методі дистанції
        if (gas_tank == 0) {

            System.out.println("В вас порожній бак");

        }
        if (gas_tank > Fuel_consumption) {
            gas_tank = gas_tank - Fuel_consumption;        //Віднімає паливо яке розходувалось
            total_mileage = mileage + km;                     //Дозапрвка збільшує пробіг
            System.out.println(brand + " проїхав " + km + " км, залишок в баку " + gas_tank +
                    "літрів пального, пробіг складає " + mileage + " км");

        }
    }
    public void reFuel(int l) {
        if (total_mileage >= mileage) {
            System.out.println("Бензин зікінчився - потрібно заправити авто.");
        }

    }
    public void total_mileage () {
        System.out.println(this.color + " " + this.brand + ", пробіг: " + (mileage+km));
    }
}