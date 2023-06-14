package day3.homework;

import java.util.Scanner;

public class Ex1_conditional2 {

	public static void main(String[] args) {	
		String gender;
		Scanner sc = new Scanner (System.in);
		System.out.println("input gender : ");
		
		gender = sc.next();
		boolean result = gender.equals("W") ? true: false; // equals String 일때
		System.out.println("Are you a women? " + result);
		
		
		sc.close();
		
	}
}
