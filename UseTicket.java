
public class UseTicket {

	public static void main(String[] args) {
		WalkupTicket opera = new WalkupTicket(10);

		System.out.println(opera.toString());
		
		
		AdvanceTicket play = new AdvanceTicket(11, 8);

		System.out.println(play.toString());
		
		AdvanceTicket musical = new AdvanceTicket(11, 15);

		System.out.println(musical.toString());
	}

}
