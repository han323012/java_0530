package day11.practice;

import java.util.Scanner;

public class DeivisorEx {

	public static void main(String[] args) {
		//정수 num의 약수들을 배열에 저장하는 코드를 작성하세요 약수는 최대 10개까지 저장
		int count =0;
		int div[]= new int [10];
		
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		for(int i = 1;i <= num; i++) {
			if(num % i == 0 ) {
				div[count] = i;
				count++;
			}
			if(count == div.length) {
				break;
			}
		}
		for(int i = 0; i < count; i++) {
			System.out.println(i);
		}
		
	sc.close();
	}

}
