package workspace;

import java.io.*;
import java.util.Scanner;

public class Assignment6 {
	//*******************************************************************

//  Assignment6
//
//Method boygirl takes a scanner that reads from a file and adds up the
//sum of boys' sums and adds up girls' sums and prints the number of
//boys and girls and the difference in their sums
//By: Azriel Policarpio	
//Date 2/13/20
//*******************************************************************

	public static void main(String[] args) throws FileNotFoundException {
		Scanner file = new Scanner(new File("boysgirls.txt"));
		boygirl(file);
	}

	public static void boygirl(Scanner file) {
		int alternator = 1;
		int boys = 0;
		int boysCount = 0;
		int girls = 0;
		int girlsCount = 0;

		while(file.hasNext()) {
			if(alternator % 2 != 0 && file.hasNextInt()) {
				boys += file.nextInt();
				boysCount++;
				alternator++;
			} else if(alternator % 2 == 0 && file.hasNextInt()) {
				girls += file.nextInt();
				girlsCount++;
				alternator++;
			} else {
				file.next();
			}
		}
		System.out.println(boysCount +" boys, " + girlsCount + " girls");
		System.out.println("Difference between boys' and girls' sum: " +
				Math.abs(boys-girls));
	}
}
