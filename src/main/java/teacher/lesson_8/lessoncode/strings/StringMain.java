package main.java.teacher.lesson_8.lessoncode.strings;

class StringMain {

    public static void main(String[] args) {
        String text = "a,b d c, d, d.";
        String editedText = text.replace(",", " ");
        System.out.println(text);
        System.out.println(editedText);
    }
}
