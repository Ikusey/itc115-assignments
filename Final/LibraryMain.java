
public class LibraryMain {

	public static void main(String[] args) {
		Book feed = new Book(1, "Feed", false, true, 0, 0.0, "Sci-Fi", 250, "M.T. Anderson");
		System.out.println(feed.print());
		
		System.out.println();
		
		Magazine time = new Magazine(2, "Time", true, true, 0, 0.0, "News", 80, "Time-Warner", 
				"October 18, 2015");
		System.out.println(time.print());
		
		System.out.println();
		
		CD pad = new CD(3, "A Fever You Can't Sweat Out", 
				false, false, 5, 2.5, 39.42, "Pop-Punk", "Panic! at the Disco");
		System.out.println(pad.print());
		
		System.out.println();
		
		DVD lotr = new DVD(4, "Lord of the Rings", 
				false, false, 10, 5.0, 208.24, "Fantasy", "Peter Jackson");
		System.out.println(lotr.print());
	}

}
