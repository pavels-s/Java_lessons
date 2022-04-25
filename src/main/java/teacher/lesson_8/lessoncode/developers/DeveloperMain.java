package main.java.teacher.lesson_8.lessoncode.developers;

class DeveloperMain {

    public static void main(String[] args) {
        System.out.println("STUDENT");
        Student student = new Student("Vasya");
        student.study();

        System.out.println("JUNIOR");

        JuniorDeveloper juniorDeveloper = new JuniorDeveloper("Misha");
        juniorDeveloper.askQuestion();
        juniorDeveloper.writeCode();
        juniorDeveloper.study();

        System.out.println("MIDDLE");

        MiddleDeveloper middleDeveloper = new MiddleDeveloper("Roma");
        middleDeveloper.study();
        middleDeveloper.askQuestion();
        middleDeveloper.writeCode();

        System.out.println("SENIOR");

        SeniorDeveloper seniorDeveloper = new SeniorDeveloper("Inokentij");
        seniorDeveloper.askQuestion();
        seniorDeveloper.writeCode();
        seniorDeveloper.study();

        System.out.println("======");

        Student student1 = new SeniorDeveloper("Gowa");
        Student student2 = new JuniorDeveloper("Zora");

        Student[] students = new Student[3];
        students[0] = student1;
        students[1] = student2;

        for (Student st : students) {
            st.study();
        }
    }
}
