package main.java.JavaGuru_2020_Java1.teacher.lesson_8.lessoncode.developers;

class SeniorDeveloper extends MiddleDeveloper {

    public SeniorDeveloper(String name) {
        super(name);
    }

    @Override
    void askQuestion() {
        System.out.println("Why?");
    }

    @Override
    void writeCode() {
        System.out.println("Write code like a senior");
    }
}
