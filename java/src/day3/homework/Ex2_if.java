package day3.homework;

import java.util.Scanner;

public class Ex2_if {

	public static void main(String[] args) {
		char gender;
		System.out.println("input gender : ");
		Scanner sc = new Scanner(System.in);
		gender = sc.next().charAt(0);
		String result = "";
		if(gender == 'M' ) {
			//System.out.println("Are you are women? " + "Man");
			result = "man";
		}
		if(gender == 'W') {
			//System.out.println("Are you are women? " + "Women");
			result = "Women";
		}
		System.out.println("Are you are women? " + result);
		
			sc.close();
		}
	}

