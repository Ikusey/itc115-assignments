
public abstract class LibraryItem implements Printable{

	private int itemNumber;
	private String title;
	private boolean reserved;
	private boolean checkedIn;
	private int daysLate;
	private double finesAccrued;
	
	
	public LibraryItem(int itemNumber, String title, boolean reserved, boolean checkedIn, int daysLate,
			double finesAccrued) {
		super();
		this.itemNumber = itemNumber;
		this.title = title;
		this.reserved = reserved;
		this.checkedIn = checkedIn;
		this.daysLate = daysLate;
		this.finesAccrued = finesAccrued;
	}

	public int getItemNumber() {
		return itemNumber;
	}

	public String getTitle() {
		return title;
	}

	public String isReserved() {
		if(reserved) return "Reserved";
		else return "Not reserved";
	}


	public void setReserved(boolean reserved) {
		this.reserved = reserved;
	}


	public String isCheckedIn() {
		if(checkedIn) return "Item is checked in.";
		else return "Item is checked out";
	}


	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}


	public int getDaysLate() {
		return daysLate;
	}


	public void setDaysLate(int daysLate) {
		this.daysLate = daysLate;
	}


	public double getFinesAccrued() {
		return finesAccrued;
	}


	public void setFinesAccrued(double finesAccrued) {
		this.finesAccrued = finesAccrued;
	}

	@Override
	public String print() {
		return "Item Number: " + getItemNumber() + ", Reservation status: " + isReserved() + ", "
	+ "Checked in: " + isCheckedIn() + ", Late days: " + getDaysLate() + 
	", Accrued Fines: " + getFinesAccrued();
	}

}
