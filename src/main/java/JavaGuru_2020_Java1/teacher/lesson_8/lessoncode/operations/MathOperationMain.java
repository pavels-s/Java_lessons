package main.java.JavaGuru_2020_Java1.teacher.lesson_8.lessoncode.operations;

class MathOperationMain {

    public static void main(String[] args) {
        MathOperationExecutor executor = new MathOperationExecutor();

        MathOperation[] operations = new MathOperation[4];
        operations[0] = new SubtractOperation();
        operations[1] = new SumOperation();
        operations[2] = new DivisionOperation();
        operations[3] = new MultiplicationOperation();

        executor.execute(operations, 10, 5);
    }
}
