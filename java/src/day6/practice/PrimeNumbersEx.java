package day6.practice;

import java.util.Scanner;

public class PrimeNumbersEx {

	public static void main(String[] args) {
		//2부터 100사이의 소수를 출력하는 코드를 작성하세요
		int i = 2;
		int j = 1;
		int count = 0;
		//i가 소수이면 i를 출력하는 코드
		while(i <= 100) {
			j = 1;
			count = 0;
			while(j <= i) {
			
				if(i % j ==0) {
					count++;
				}
				j++;
			}
			if (count == 2) {
				System.out.println(i);
			}
		i++;
		}
		
	}
}




