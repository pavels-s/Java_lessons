package main.java.teacher.lesson_8.lessoncode.developers;

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
