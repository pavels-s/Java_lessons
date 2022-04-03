package main.java.JavaGuru_2020_Java1.lesson_6.homeworks.level_4;

public class Task17 {

    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) {
            if (i == 1) {
                continue;
            }
            System.out.println("For from 2 to 4: " + i);
        }

        int i = 1;
        while (i < 5) {
            if (i == 1) {
                i++;
                continue;
            } else {
                System.out.println("While from 2 to 4: " + i);
                i++;
            }
        }
    }
}
