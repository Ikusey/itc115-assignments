package workspace;

import java.util.Random;

public class AntCrawl {

	public static void main(String[] args) {
		int antHeight = 0;
		int height = 6;
		Random rand = new Random();
		int chance = 0;
		int falls = 0;
		
		while(antHeight != height) {
			chance = rand.nextInt(2);
			
			if(chance == 1) {
				antHeight++;
			}else {
				antHeight = 0;
				falls++;
			}
		}
		System.out.println("Number of falls: " + falls);
	}

}
