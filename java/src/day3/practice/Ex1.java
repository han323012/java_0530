package day3.practice;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		boolean rsult = score >= 60;
		System.out.println("Do you pass " + score + " points? " + rsult);
		boolean disRsult = score <= 60;
		System.out.println("Do you pass " + score + " points? " + disRsult);
		
		
		sc.close();
		
	}

}
