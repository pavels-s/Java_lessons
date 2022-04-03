package main.java.JavaGuru_2020_Java1.teacher.lesson_15.homework.level_6_middle.videostore;

class Rental {

	private Movie movie;
	private int daysRented;

	public Rental (Movie movie, int daysRented) {
		this.movie 		= movie;
		this.daysRented = daysRented;
	}

	public Movie getMovie() {
		return movie;
	}

	public int getDaysRented() {
		return daysRented;
	}
}