package main.java.student_pavel_sharkel.lesson_9.level_2.task_10;

class ConstructorChaining {

    private String constructorName;
    private int parameterCount;

    private ConstructorChaining(String constructorName) {
        this.constructorName = constructorName;
    }

    public ConstructorChaining(String constructorName, int parameterCount) {
        ConstructorChaining constructorChaining = new ConstructorChaining("hello");
        this.constructorName = constructorName;
        this.parameterCount = parameterCount;
    }

}
