package day4.practice;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		System.out.println("What are age? : ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num >= 20) {
			System.out.println("You are adult.");
			
		}
		else {
			System.out.println("You are minor.");
			
		}
		
			sc.close();
	}

}
