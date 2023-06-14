package day3.homework;

import java.util.Scanner;

public class Ex1_conditional {

	public static void main(String[] args) {	
		char gender;
		Scanner sc = new Scanner (System.in);
		System.out.println("input gender : ");
		
		gender = sc.next().charAt(0);
		boolean result = gender == 'W' ? true: false;
		System.out.println("Are you a women? " + result);
		
		
		sc.close();
		
	}
}
