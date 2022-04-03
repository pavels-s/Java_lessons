package main.java.JavaGuru_2020_Java1.teacher.lesson_14.lessoncode;

@FunctionalInterface
public interface FruitSearchCriteria {

    boolean test(Fruit fruit);

}

class ApplesSearchCriteria implements FruitSearchCriteria {
    @Override
    public boolean test(Fruit fruit) {
        return "apple".equals(fruit.getTitle());
    }
}

class PearsSearchCriteria implements FruitSearchCriteria {
    @Override
    public boolean test(Fruit fruit) {
        return "pear".equals(fruit.getTitle());
    }
}

class TomatosSearchCriteria implements FruitSearchCriteria {
	@Override
	public boolean test(Fruit fruit) {
		return "tomato".equals(fruit.getTitle());
	}
}


class RedTomatosSearchCriteria implements FruitSearchCriteria {
    @Override
    public boolean test(Fruit fruit) {
        return "tomato".equals(fruit.getTitle())
                && "red".equals(fruit.getColor());
    }
}

class RedTomatosBiggerThen100SearchCriteria implements FruitSearchCriteria {
    @Override
    public boolean test(Fruit fruit) {
        return "tomato".equals(fruit.getTitle())
                && "red".equals(fruit.getColor())
                && fruit.getWeight() > 100;
    }
}