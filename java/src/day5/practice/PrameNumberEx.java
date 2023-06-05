package day5.practice;

import java.util.Scanner;

public class PrameNumberEx {

	public static void main(String[] args) {
		//정수 num을 입력받아 num이 소수인지 아닌지를 판별하는 코드를 작성하세요
		//소수 약수가 1과 자기 자신밖에 없는 수
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요:");
		int num1 = sc.nextInt();
		int num2 = 1;
		int count = 0;
		while(num2 <= num1){
			if(num1 % num2 ==0) {
					count++;
			}
			num2++;
		}
		if (count == 2) {
			System.out.println(num1 + " 소수입니다");
		}
		else {
			System.out.println(num1 + " 소수가 아닙니다");
		
		}
				sc.close();
		}
	}


