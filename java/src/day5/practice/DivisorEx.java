package day5.practice;

import java.util.Scanner;

public class DivisorEx {

	public static void main(String[] args) {
		//정수 num의 약수를 구하는 코드를 작성하세요
		//약수 a를b로 나누었을때 나머지가 0이면 b는 a의 약수이다
		// 반복 횟수 i는 1부터num까지 1씩증가
		//규칙성 num가 i의 약수이면 i를 출력
		int num2 = 1;
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		
		while(num2 <= num1) {
				if(num1 % num2 == 0 ) {
				System.out.println(num2);
				}
				num2++;
				
		}
				
		sc.close();
	}

}
