
public class AdvanceTicket extends Ticket {

	public AdvanceTicket(int number, int days) {
		super(number);
		if(days >= 10) {
			price = 30.0;
		} else {
			price = 40.0;
		}
	}

}
