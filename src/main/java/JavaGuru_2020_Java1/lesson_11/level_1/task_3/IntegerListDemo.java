package main.java.JavaGuru_2020_Java1.lesson_11.level_1.task_3;

import java.util.ArrayList;
import java.util.List;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class IntegerListDemo {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();

        // add 3 elements
        integerList.add(11);
        integerList.add(12);
        integerList.add(13);

        //add element in the beggining
        integerList.add(0, 10);

        //get length of list
        System.out.println("List length is: " + integerList.size());

        //remove element
        integerList.remove(0);

        //remove 3rd element
        integerList.remove(2);

        //checking if list is empty
        System.out.println("List is empty - " + integerList.isEmpty());

        //printing all elements
        for (int value : integerList) {
        System.out.println(value);
        }

    }
}
