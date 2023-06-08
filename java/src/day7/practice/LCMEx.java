package day7.practice;

import java.util.Scanner;

public class LCMEx {

	public static void main(String[] args) {
		int num1 , num2;
		int i = 1;
		int lcm = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input number : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		for(i = 1; i <= num1*num2; i++) {
			if(i % num1 == 0 && i % num2 == 0) {
				lcm = i;
				break;
			}
		}
		System.out.println(lcm);
		
		System.out.println("===============================");
		
		for(i=num1; i<=num1*num2; i += num1) {
			if(i%num2==0) {
				lcm =i;
				break;
			}
		}
		System.out.println(lcm);
		sc.close();
	}

}
