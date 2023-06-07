package day6.practice;

import java.util.Scanner;

public class SumeEx {

	public static void main(String[] args) {
		int n;
		int sum = 0;
		int i =1;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("input : ");
		n = sc.nextInt();
		
		while(i <= n) {
			if(i % 2 == 0)
			sum += i;
			i++;
		}
		System.out.println("1~ " + n + " even sum : " + sum);
		sc.close();
	}

}
