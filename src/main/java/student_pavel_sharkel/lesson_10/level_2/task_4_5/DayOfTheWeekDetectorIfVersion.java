package main.java.student_pavel_sharkel.lesson_10.level_2.task_4_5;

import main.java.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class DayOfTheWeekDetectorIfVersion implements DayOfTheWeekDetector{


    public String detectDayName(int number) {
        if (number == 1) {
            return "Monday";
        } else if (number == 2) {
            return "Tuesday";
        } else if (number == 3) {
            return "Wednesday";
        } else if (number == 4) {
            return "Thursday";
        } else if (number == 5) {
            return "Friday";
        } else if (number == 6) {
            return "Saturday";
        } else if (number == 7) {
            return "Sunday";
        } else {
            return "Please input a valid number between 1 and 7";
        }
    }
}
