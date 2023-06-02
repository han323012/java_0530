package day4.ifex;

import java.util.Scanner;

public class EvenNumberEx {

	public static void main(String[] args) {
		//if else 이용한 홀짝 판별 예제
		System.out.println("Input number. : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num % 2 == 0) {
			System.out.println("Even number.");
		}else {
			System.out.println("Odd number");
		}
			sc.close();
	}

}
