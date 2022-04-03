package main.java.JavaGuru_2020_Java1.teacher.lesson_8.lessoncode.cars;

class CarMain {

    public static void main(String[] args) {
//        Car car1 = new Car();
        ElectricCar electricCar = new ElectricCar("Tesla", 20);
        electricCar.start();

        PetrolCar petrolCar = new PetrolCar("BMW");
        petrolCar.start();

        electricCar.setBatteryCapacity(0);

        electricCar.start();
        electricCar.stop();
    }
}
