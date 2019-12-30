package com.pointer.car;

public class Car {
    private String color;
    private String mark;
    private double consumption;
    private double fuelVolumeInTheTank;
    private double mileage;
    private double driveKm;

    public Car(String color, String mark, double consumption, double fuelVolumeInTheTank, double mileage, double driveKm) {
        this.color = color;
        this.mark = mark;
        this.consumption = consumption;
        this.fuelVolumeInTheTank = fuelVolumeInTheTank;
        this.mileage = mileage;
        this.driveKm = driveKm;
    }

    public Car() {
    }

    public String getColor() {
        return color;
    }

    public String getMark() {
        return mark;
    }

    public double getConsumption() {
        return consumption;
    }

    public double getFuelVolumeInTheTank() {
        return fuelVolumeInTheTank;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getDriveKm() {
        return driveKm;
    }

    public void setDriveKm(double driveKm) {
        this.driveKm = driveKm;
    }

    public void drive() {
        double drive = (fuelVolumeInTheTank / consumption) * 100;
        if (drive <= driveKm) {
            System.out.println(drive);
            mileage += drive;
            System.out.println(mileage);
        } else if (drive > driveKm) {
            System.out.println(drive);
        } else {
            System.out.println("Мало топлива, необходимо заправить автомобиль");
        }

    }

    public void distance() {
        System.out.println(mark);
        System.out.println(color);
        System.out.println(driveKm);
        System.out.println(mileage);

    }
}
