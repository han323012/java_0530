package day6.practice;

import java.util.Scanner;

public class AverageEx {

	public static void main(String[] args) {
		//국어 영어 수학 성적을 입력받아 평균을 구하는 코드를 작성하세요
		int kor , eng , math ;
		char menu = 'y';
		double avg;
		
		Scanner sc = new Scanner(System.in);
		
		while(menu != 'n') {
			System.out.println("input score(kor, eng , math) : ");
			kor = sc.nextInt();
			eng = sc.nextInt();
			math = sc.nextInt();
			
			avg = (kor + eng + math) / 3.0;
			
			System.out.println("average : " + avg);
			System.out.println("continue?(y/n) : ");
			menu =sc.next().charAt(0);
			
			
		}
		System.out.println("Exit!");
		sc.close();
	}

}
