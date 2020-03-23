
public class DVD extends CD {

	public DVD(int itemNumber, String title, boolean reserved, boolean checkedIn, int daysLate, 
			double finesAccrued, double runTime, String genre, String creator) {
		super(itemNumber, title, reserved, checkedIn, daysLate, finesAccrued
				, runTime, genre, creator);
	}
	
	@Override
	public String print() {
		return "Item Number: " + getItemNumber() +", DVD Title: " + getTitle() + ", Reservation status: " + isReserved()
		+ ", Checked in: " + isCheckedIn() + ", Late days: " + getDaysLate() + ", Accrued Fines: " + getFinesAccrued() + 
		", \n DVD Genre: " + getGenre() + ", Director: " + getCreator() + ", DVD Runtime: " + getRunTime();
	}

}
