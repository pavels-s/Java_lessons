package main.java.student_pavel_sharkel.lesson_10.level_4.task_12;

class KelvinConverter implements TemperatureConverter {
    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}
