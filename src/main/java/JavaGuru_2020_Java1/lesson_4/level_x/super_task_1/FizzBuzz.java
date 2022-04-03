package main.java.JavaGuru_2020_Java1.lesson_4.level_x.super_task_1;

public class FizzBuzz {

    int number;  // зачем хранить число?? это свойство нигде не используется!

    public String detect(int number) {
        this.number = number;
        String result;

        if ((number % 3 == 0) && (number % 5 == 0)) {
            result = "FizzBuzz";
        } else if (number % 3 == 0) {
            result = "Fizz";
        } else if (number % 5 == 0) {
            result = "Buzz";
        } else {
            result = "" + number;
        }
        return result;
    }
}
