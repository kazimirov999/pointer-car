package pointer.com;

public class Car {

    public String[] spotsmer = new String[3];
    public String carBrend;
    public String color;
    public int yearOfIssue;
    public int overCloking;
    public static String cityManyfacturer = "Germany";


    void specification(String carB) {
        this.carBrend = carB;
        String audi = "Audi a7";
        if (carBrend == audi) {
            color = "Чорний";
            yearOfIssue = 2016;
            overCloking = 380;
            System.out.println("Марка автомобіля - " + carBrend + ";\n"
                    + "Колір - " + color + ";\n" + "Рік випуску - " + yearOfIssue + ";\n"
                    + "Максимальна скорість - " + overCloking + " км.год;");
        }
    }


    void owner(String sportsmen) {
        String f1 = sportsmen;
        String f2 = sportsmen;
        String f3 = sportsmen;

        if (f1 == "Anton") {
            System.out.println("Ігрок по імені " + sportsmen + " виграв автомобіль... \n");
            System.out.println("------------------");
        }
        f1 = spotsmer[0] = "Anton";
        f2 = spotsmer[1] = "Іван";
        f2 = spotsmer[2] = "Vasya";

        if (spotsmer[0] == sportsmen) {
            specification("Audi a7");
        } else if (spotsmer[1] == sportsmen) {
            System.out.println("Цей ігрок вийшов з ігри в першому раунді");
        } else if (spotsmer[2] == sportsmen) {
            System.out.println("Цей ігрок не зявився на ігру");
        }
    }


    void color(String col) {
        String color = col;
        if (color == "green") {
            System.out.println("Такий колір автомобіля подобаєть " + spotsmer[0] + "y");
        } else {
            System.out.println("Такий колір автомобіля не подобаєть " + spotsmer[0] + "y");
        }

    }
}


