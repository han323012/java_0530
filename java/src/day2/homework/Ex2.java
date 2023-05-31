package day2.homework;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("두 정수를 입력하세요");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a + "+" + b + "=" + (a + b) );
		System.out.println(a + "-" + b + "=" + (a - b) );
		System.out.println(a + "*" + b + "=" + (a * b) );
		System.out.println(a + "/" + b + "=" + ((double)a / b) );
		System.out.println(a + "%" + b + "=" + (a % b) );
		
		
		sc.close();
		
	}

}
