//*******************************************************************

//  assignment4
//
// Method repl takes a string and integer and repeats the string integer number of times
//By: Azriel Policarpio
//2/1/2020

public class assignment4 {

	public static void main(String[] args) {
		System.out.println(repl("hello", 3));
		System.out.println(repl("hello", 0));
	}
	
	public static String repl(String text, int num) {
		String repet = "";
		if(num > 0) {
			for(int i = 0; i<num; i++) {
				repet += text;
			}
		}
		
		return repet;
	}
}
