package main.java.JavaGuru_2020_Java1.lesson_11.level_1.task_1;

import java.util.ArrayList;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ListExample {

    public static void main(String[] args) {

        ArrayList<String> nameList = new ArrayList<>();

        nameList.add("First list element");
        nameList.add("Second list element");

        ListExample listExample = new ListExample();
        listExample.printListToConsole(nameList);

        if (nameList.get(1).equals("Second list element")) {
            System.out.println("Second list element checking is done");
        } else {
            System.out.println("Second list element checking is incorrect");
        }
    }

    void printListToConsole(ArrayList<String> arrayList) {
        for (String arrayElement : arrayList) {
            System.out.println(arrayElement);
        }
    }

}
