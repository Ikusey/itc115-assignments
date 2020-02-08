package workspace;

import java.util.Scanner;

//*******************************************************************
//Assignment5.java
//
//season takes as parameters two integers 
//representing a month and day and returns a String 
//indicating the season for that month and day.
//
//printGPA accepts a Scanner for the 
//console as a parameter and calculates a 
//student's grade point average. 
//By: Azriel Policarpio
//Date 2/7/2020
//*******************************************************************

public class Assignment5 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println(season(2, 29));
		System.out.println(season(2, 40));
		System.out.println(season(2, 0));
		System.out.println(season(2, 10));
		System.out.println(season(4, 10));
		System.out.println(season(7, 10));
		System.out.println(season(10, 10));
		printGPA(console);
	}

	public static String season(int month, int day) {
		String currentSeason = "";
		if(day > 31 || day <= 0 || (month == 2 && day > 28)) return "Invalid day";
		if((month == 12 && day >= 15) || month < 3 || (month == 3 && day <= 15)) {
			currentSeason = "winter";
		} else if((month == 3 && day >= 16) || (month > 3 && month < 6) || (month == 6 && day <= 15)) {
			currentSeason = "spring";
		} else if((month == 6 && day >= 16) || (month > 6 && month < 9) || (month == 9 && day <= 15)) {
			currentSeason = "summer";
		} else if((month == 9 && day >= 16) || (month > 9 && month < 12) || (month == 12 && day <= 15)) {
			currentSeason = "fall";
		}
		return currentSeason;
	}
	
	public static void printGPA(Scanner console) {
		System.out.println("Enter a student record: ");
		String name = console.next();
		int numGrades = console.nextInt();
		double gradeAvg = console.nextDouble();
		for(int i = 1; i < numGrades; i++) {
			gradeAvg += console.nextDouble();
		}
		gradeAvg = gradeAvg/numGrades;
		System.out.println(name +"'s grade is " + Math.round(gradeAvg * 100.0)/100.0);
	}
}
