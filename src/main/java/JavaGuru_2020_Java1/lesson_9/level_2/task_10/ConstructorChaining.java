package main.java.JavaGuru_2020_Java1.lesson_9.level_2.task_10;

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
