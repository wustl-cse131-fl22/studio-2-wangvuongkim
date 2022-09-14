package studio2;

import java.util.Scanner;

public class Pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Total amount of trials: ");
		int totalTrials = in.nextInt();
		int trial = 0;
		int hit = 0;
		
		while (trial <= totalTrials) {
			double x = Math.random();
			double y = Math.random();
			if (Math.sqrt(x*x + y*y) <= 1) {
				hit++;
			}
			trial++;
		}
		
		double Pi = (double) hit/totalTrials*4;
		System.out.println(Pi);
		

	}

}
