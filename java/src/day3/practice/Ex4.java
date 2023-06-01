package day3.practice;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		System.out.println("Input number. : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num % 2 != 0) {
			System.out.println("Odd number");
		}
		
		if(num % 2 == 0 && num != 0) {
			System.out.println("Even number.");
		}
		if(num == 0) {
			System.out.println("This number is not a odd or even");
		}
		sc.close();
	}

}
