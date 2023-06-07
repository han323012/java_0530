package day5.homework;

import java.util.Scanner;

public class TeamLeaderEx {

	public static void main(String[] args) {
		/* 30명의 학생이 있는 반에서 1번부터 연속된 번호를 가진 3명의 학생이 1조가 되도록 나누었다. 이 때 가장 큰 번호인 학생이 조장이 된다.
		 * 학생 번호가 주었을 때 조장인지 조원인지 판별하는 코드를 작성하세요.
		 * switch 문으로
		 */
		int num; 
		System.out.println("학생 번호를 입력하세요. : ");
		
		Scanner sc = new Scanner(System.in); 
		num = sc.nextInt();
		
		switch (num % 3) {
		case 1 , 2 :
			System.out.println("조원입니다.");
		 break;
		case 0 :
			System.out.println("조장입니다.");
			break;
		default:
			System.out.println("학생이 아닙니다.");	
			
		}
		sc.close();
	}

}
