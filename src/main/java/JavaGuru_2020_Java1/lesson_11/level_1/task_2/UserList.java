package main.java.JavaGuru_2020_Java1.lesson_11.level_1.task_2;

import java.util.ArrayList;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class UserList {

    public static void main(String[] args) {

        User firstUser = new User("John", 27);
        ArrayList<User> userArrayList = new ArrayList<>();
        userArrayList.add(firstUser);

    }
}
