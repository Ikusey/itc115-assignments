
public class Ticket {
	protected int number;
	protected double price;
	
	public Ticket(int number) {
		this.number = number;
	}
	
	
	@Override
	public String toString() {
		return "Ticket Number: " + number + ", Price: " + price ;
	}
	
	public double getPrice() {
		return price;
	}
	
	
}
