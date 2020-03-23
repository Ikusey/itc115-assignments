
public class Magazine extends Book {
	
	private String issueDate;

	public Magazine(int itemNumber, String title, boolean reserved, boolean checkedIn, int daysLate,
			double finesAccrued, String genre, int pageAmount, String author, String issueDate) {
		super(itemNumber, title, reserved, checkedIn, daysLate, finesAccrued, genre, pageAmount, author);
		this.issueDate = issueDate;
	}

	@Override
	public String print() {
		return "Item Number: " + getItemNumber() +", Magazine Title: " + getTitle() + ", Reservation status: " + isReserved()
		+ ", Checked in: " + isCheckedIn() + ", Late days: " + getDaysLate() + ", Accrued Fines" + getFinesAccrued() + 
		", \n Magazine Genre: " + getGenre() + ", Publisher: " + getAuthor() + ", Page Amount: " + getPageAmount()
		+ ", Issue Date: " + issueDate;
	}
	
}
