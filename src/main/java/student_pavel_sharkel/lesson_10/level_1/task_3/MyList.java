package main.java.student_pavel_sharkel.lesson_10.level_1.task_3;

import java.util.ArrayList;

import main.java.teacher.codereview.CodeReview;

@CodeReview(approved = true)
public interface MyList {

    String addName(String name); //добавляем имя в список

    void currentNameQty(ArrayList<String> names);  //узнаём сколько сейчас позиций в списке

    void removeName(int position);  //удаляем из списка определённую позицию

    String findName(String name);  //ищем определённую запись в списке
}
