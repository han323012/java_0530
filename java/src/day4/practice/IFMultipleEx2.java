package day4.practice;

import java.util.Scanner;

public class IFMultipleEx2 {

	public static void main(String[] args) {
		// else if 문은 위에서 부터 들어가기 때문에 잘 생각하면서 해야할것
		// 높은숫자 우선
		/*정수 num를 입력받아 num이 2의 배수이면 2의 배수라고 출력하고, 3의 배수이면 3의 배수라고 출력하고, 
		 * 6의 배수이면 6의 배수라고 출력하고 2,3,6의 배수가 아니면 2,3,6의 배수가 아니라고 출력하는 코드를 작성하세요
		*/
		/* 주의사항 
		 * 1번째 괄호(괄호 개수 체크)
		 * 괄호 생략 가능 실행문이 1줄인 경우
		 * if문에 조건식에 세미클론 쓰지 말것
		*/
		System.out.println("숫자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		if (num % 6 == 0) {
			System.out.println("6의 배수입니다.");
		
		}
		else if (num % 5 == 0) { 
			System.out.println("5의 배수입니다");
		}
		
		else if (num % 3 == 0) {
			System.out.println("3의 배수입니다.");
		}
		
		else if(num % 2 == 0) {
			System.out.println("2의 배수입니다.");
		}
		else {
			System.out.println("2,3,6의 배수가 아닙니다.");
		}
		
		
		
	}


}
