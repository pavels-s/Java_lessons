package main.java.JavaGuru_2020_Java1.teacher.lesson_10.lessoncode.library;

import java.util.Date;

public class ReaderCardItem {

	private ReaderCard readerCard;
	private Book book;
	private Date takeAwayDate;
	private Date mustReturnDate;
	private Date returnDate;

	public ReaderCardItem(ReaderCard readerCard,
						  Book book, Date takeAwayDate, Date mustReturnDate) {
		this.readerCard = readerCard;
		this.book = book;
		this.takeAwayDate = takeAwayDate;
		this.mustReturnDate = mustReturnDate;
	}
}
