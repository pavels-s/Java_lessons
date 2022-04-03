package main.java.JavaGuru_2020_Java1.lesson_10.level_1.task_3;

import java.util.ArrayList;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
public interface MyList {

    String addName(String name); //добавляем имя в список

    void currentNameQty(ArrayList<String> names);  //узнаём сколько сейчас позиций в списке

    void removeName(int position);  //удаляем из списка определённую позицию

    String findName(String name);  //ищем определённую запись в списке
}
