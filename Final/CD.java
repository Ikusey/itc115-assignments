
public class CD extends LibraryItem {

	private double runTime;
	private String genre;
	private String creator;
	
	public CD(int itemNumber, String title, boolean reserved, boolean checkedIn, int daysLate, 
			double finesAccrued, double runTime, String genre, String creator) {
		super(itemNumber, title, reserved, checkedIn, daysLate, finesAccrued);
		this.runTime = runTime;
		this.genre = genre;
		this.creator = creator;
	}
	
	
	
	public double getRunTime() {
		return runTime;
	}



	public String getGenre() {
		return genre;
	}



	public String getCreator() {
		return creator;
	}



	@Override
	public String print() {
		return super.print() + ", CD Title: " + getTitle() +
				", \n CD Genre: " + genre + ", Artist: " + creator + ", CD Runtime: " + runTime;
	}
}
