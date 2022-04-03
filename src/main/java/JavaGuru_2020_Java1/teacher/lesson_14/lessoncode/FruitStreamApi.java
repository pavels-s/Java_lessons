package main.java.JavaGuru_2020_Java1.teacher.lesson_14.lessoncode;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FruitStreamApi {

	private List<Fruit> fruits = new ArrayList<>();

	public FruitStreamApi() {
		fruits.add(new Fruit("apple", "red", 100));
		fruits.add(new Fruit("apple", "green", 200));
		fruits.add(new Fruit("pear", "red", 100));
		fruits.add(new Fruit("pear", "yellow", 100));
		fruits.add(new Fruit("tomato", "red", 100));
	}

	public List<Fruit> getAllFruits() {
		return fruits;
	}

	public List<Fruit> findAllApples() {
		Predicate<Fruit> applePredicate =
				fruit -> "apple".equals(fruit.getTitle());

		Predicate<Fruit> applePredicate2 = new Predicate<Fruit>() {
			@Override
			public boolean test(Fruit fruit) {
				return "apple".equals(fruit.getTitle());
			}
		};


		return fruits.stream()
				.filter(fruit -> "apple".equals(fruit.getTitle()))
				.collect(Collectors.toList());
	}

	public List<Fruit> findAllApplesV2() {
		return fruits.stream()
				.filter(new Predicate<Fruit>() {
					@Override
					public boolean test(Fruit fruit) {
						return "apple".equals(fruit.getTitle());
					}
				})
				.collect(Collectors.toList());
	}

	public List<Fruit> findAllApplesV3() {
		Predicate<Fruit> searchCriteria = new Predicate<Fruit>() {
			@Override
			public boolean test(Fruit fruit) {
				return "apple".equals(fruit.getTitle());
			}
		};
		return fruits.stream()
				.filter(searchCriteria)
				.collect(Collectors.toList());
	}

	class AppleSearchPredicate implements Predicate<Fruit> {
		@Override
		public boolean test(Fruit fruit) {
			return "apple".equals(fruit.getTitle());
		}
	}

	public List<Fruit> findAllApplesV4() {
		return fruits.stream()
				.filter(new AppleSearchPredicate())
				.collect(Collectors.toList());
	}




	public List<Fruit> findRedApplesWithWeightBiggerThen100() {
		return fruits.stream()
				.filter(fruit -> "apple".equals(fruit.getTitle()))
				.filter(fruit -> "red".equals(fruit.getColor()))
				.filter(fruit -> fruit.getWeight() > 100)
				.collect(Collectors.toList());
	}

	public Set<String> findAllFruitUniqNames() {
		return fruits.stream()
					 .map(fruit -> fruit.getTitle())
					 .collect(Collectors.toSet());
	}

	public List<String> findAllFruitUniqueNames() {
		return fruits.stream()
				.map(Fruit::getTitle)
				//.map(fruit -> fruit.getTitle())
				.distinct()
				.collect(Collectors.toList());
	}

	public Optional<Fruit> findAnyApple() {
		return fruits.stream()
					 .filter(fruit -> "apple".equals(fruit.getTitle()))
					 .findAny();
	}

	public Optional<Fruit> findFirstApple() {
		return fruits.stream()
				.filter(fruit -> "apple".equals(fruit.getTitle()))
				.findFirst();
	}
}
