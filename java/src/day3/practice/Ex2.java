package day3.practice;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input");
		int score = sc.nextInt();
		String rsult = score >= 60 ? "pass" : "fail";
		System.out.println("Do you pass " + score + " points? " + rsult);
		
		
		sc.close();
	}

}
