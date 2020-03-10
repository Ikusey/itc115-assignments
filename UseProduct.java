
public class UseProduct {

	public static void main(String[] args) {
		Product orange = new Product("001", 10, 1.00, "Orange");
		Product banana = new Product("002", 15, 1.25, "Banana");
		System.out.println(orange.toString());
		System.out.println(banana.toString());
	}

}
