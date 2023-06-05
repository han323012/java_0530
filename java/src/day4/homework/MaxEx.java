package day4.homework;

import java.util.Scanner;

public class MaxEx {

	public static void main(String[] args) {
		//국어 영어 수학 성적을 입력받아 평균을 출력하는 코드를 작성하세요
		double avg;
		System.out.println("숫자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int kor =sc.nextInt();
		int eng =sc.nextInt();
		int mat =sc.nextInt();
		
		avg = (kor + eng + mat)/3.0;
		
		System.out.println("avg : " + avg);
		
		
		sc.close();
	}

}
