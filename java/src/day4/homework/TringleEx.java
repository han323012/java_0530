package day4.homework;

import java.util.Scanner;

public class TringleEx {

	public static void main(String[] args) {
		/* 정수가 짝수이면 정수에 2를 나누고,
		 * 정수가 홀수이면 정수에 1을 더한 후 정수를 출력하는 코드를 작성하세요.
		 *  */
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if(num % 2 == 0) {
			num = num / 2;
		}
		else {
			num = ++num;
		}
		System.out.println(num);
		sc.close();	
	}

}
