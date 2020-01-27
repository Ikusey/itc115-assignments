
public class Assignment3 {

	public static void main(String[] args) {
		printPowersOfN(2,7);   
		printPowersOfN(5,3);

	}

	public static void printPowersOfN(int x, int y) {
		int num = 1;
		for(int i = 0; i < y+1; i++) {
			System.out.print(num + " ");
			num = num * x;
		}
	}
}
