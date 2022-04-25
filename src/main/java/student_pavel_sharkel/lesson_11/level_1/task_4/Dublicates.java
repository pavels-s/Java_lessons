package main.java.student_pavel_sharkel.lesson_11.level_1.task_4;

import java.util.ArrayList;
import java.util.List;

import main.java.teacher.codereview.CodeReview;

@CodeReview(approved = true)
class Dublicates {

    public static void main(String[] args) {

        ArrayList<String> nameList = new ArrayList<>();

        nameList.add("Ted");
        nameList.add("John");
        nameList.add("Ted");

        if (nameList.get(0).equals(nameList.get(2))) {
            System.out.println("List contains dublicate");
        }


    }
}
