package main.java.student_pavel_sharkel.lesson_6.homeworks.level_1.task_2;

import java.util.Scanner;

public class DayOfTheWeekDetector {


        String detectDayName(int number) {
                Scanner in = new Scanner(System.in);

                String day = null;
                if ((number >=1) && (number <= 7)) {
                    switch (number) {
                        case 1 -> {
                            day = "Monday";
                        }
                        case 2 -> {
                            day = "Tuesday";
                        }
                        case 3 -> {
                            day = "Wednesday";
                        }
                        case 4 -> {
                            day = "Thursday";
                        }
                        case 5 -> {
                            day = "Friday";
                        }
                        case 6 -> {
                            day = "Saturday";
                        }
                        case 7 -> {
                            day = "Sunday";
                        }
                    }
                }
                else {
                    day = "Input error";
                }
                return day;
            }

        }

