package day4.practice;

import java.util.Scanner;

public class IfScoreEx2 {

	public static void main(String[] args) {
		//성적을 입력받아 성적에 맞는 학점을 출력하는 코드를 작성하세요
		System.out.println("성적을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		if(score < 0 || score > 100) {
			System.out.println("잘못된 점수");
		}
		else if(score >= 90) {
			System.out.println("A");
		}
		
	    else if(score >= 80) {
			System.out.println("B");
		}
	    else if(score >= 70) {
			System.out.println("C");
		}
	    else if(score >= 60) {
	    	System.out.println("D");
	    }
	    else {
	    	System.out.println("F");
	    }
		sc.close();
	}

}
