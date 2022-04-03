package main.java.JavaGuru_2020_Java1.lesson_10.level_2.task_4_5;

import java.util.Scanner;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public class DayOfTheWeekDetectorDemo{

    DayOfTheWeekDetector dayOfTheWeekDetector;

    DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayOfTheWeekDetector) {
        this.dayOfTheWeekDetector = dayOfTheWeekDetector;
    }

    void run() {
        Scanner in = new Scanner(System.in);
        System.out.print("Number of the day: ");
        int number = in.nextInt();
        System.out.println("It is " + dayOfTheWeekDetector.detectDayName(number));

    }

    public static void main(String[] args) {

        DayOfTheWeekDetector ifVersion = new DayOfTheWeekDetectorIfVersion();
        DayOfTheWeekDetectorDemo ifDetector = new DayOfTheWeekDetectorDemo(ifVersion);
        ifDetector.run();

        DayOfTheWeekDetector switchVersion = new DayOfTheWeekDetectorSwitchVersion();
        DayOfTheWeekDetectorDemo switchDetector = new DayOfTheWeekDetectorDemo(switchVersion);
        switchDetector.run();


    }

}
