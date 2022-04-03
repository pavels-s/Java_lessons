package main.java.JavaGuru_2020_Java1.lesson_6.homeworks.level_1.task_3;

public class FizzBuzz {


    public String detect(int number) {
        if ((number % 3 == 0) && (number % 5 == 0)) return "FizzBuzz";
        else if (number % 3 == 0) return "Fizz";
        else if (number % 5 == 0) return "Buzz";
        else return Integer.toString(number);
    }

}
