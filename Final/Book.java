
public class Book extends LibraryItem {

	private String genre;
	private int pageAmount;
	private String author;
	
	public Book(int itemNumber, String title, boolean reserved, boolean checkedIn, 
			int daysLate, double finesAccrued, String genre, int pageAmount, String author) {
		super(itemNumber, title, reserved, checkedIn, daysLate, finesAccrued);
		this.genre = genre;
		this.pageAmount = pageAmount;
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}
	
	public int getPageAmount() {
		return pageAmount;
	}
	
	public String getAuthor() {
		return author;
	}

	@Override
	public String print() {
		return super.print() + ", Book Title: " + getTitle() + ", \n Book Genre: " + 
	genre + ", Book Author: " + author + ", Page Amount: " + pageAmount;
	}
}
