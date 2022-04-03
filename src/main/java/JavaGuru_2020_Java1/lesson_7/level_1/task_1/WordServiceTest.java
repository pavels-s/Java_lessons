package main.java.JavaGuru_2020_Java1.lesson_7.level_1.task_1;

class WordServiceTest {

    public static void main(String[] args) {

        WordService wordService = new WordService();
        System.out.print("The most repeated word is: ");
        System.out.println(wordService.findMostFrequentWord("many words to find some words repeated between some words"));

    }

}
