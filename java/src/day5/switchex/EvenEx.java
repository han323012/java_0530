package day5.switchex;

import java.util.Scanner;

public class EvenEx {

	public static void main(String[] args) {
		//홀짝 예시를 switch로 바꿔서
		int num; 
		Scanner sc = new Scanner(System.in); 
		num = sc.nextInt();
		switch(num % 2) {
			case 0:
				System.out.println(num + " is a even number ");
				break;
		default:
			System.out.println(num + " is a odd number ");
		}
		sc.close();
	}

}
