package workspace;

public class IsPowersOfTwo {

	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(0));
		System.out.println(isPowerOfTwo(1));
		System.out.println(isPowerOfTwo(5));
		System.out.println(isPowerOfTwo(100));

	}
	
	public static boolean isPowerOfTwo(int x){
		if(x == 0) return false;
		double y = 0;
		double count = 0.0;
		while(y != x && y < x) {
			y = Math.pow(2.0, count);
			count++;
		}
		
		if(y == x) return true;
		else return false;
	}
}
