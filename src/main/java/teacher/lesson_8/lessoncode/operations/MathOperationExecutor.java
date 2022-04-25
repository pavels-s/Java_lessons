package main.java.teacher.lesson_8.lessoncode.operations;

class MathOperationExecutor {

    void execute(MathOperation[] operations, int a, int b) {
        for (MathOperation operation : operations) {
            int result = operation.calculate(a, b);
            System.out.println("Result: " + result);
        }
    }
}
