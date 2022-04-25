package main.java.teacher.lesson_8.lessoncode.cars;

class ElectricCar extends Car {

    private int batteryCapacity;

    public ElectricCar(String model, int batteryCapacity) {
        super(model);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    void start() {
        if (batteryCapacity > 0) {
            System.out.println("Electric car started");
        } else {
            System.out.println("Not enough capacity");
        }
    }

    @Override
    void stop() {
        System.out.println("Electric car stopped.");
    }
}
