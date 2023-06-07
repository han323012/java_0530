package day5.homework;

import java.util.Scanner;

public class UpDownEx {

	public static void main(String[] args) {
		//1~100사이의 랜덤한 정수를 생성하고, 이 정수를 맟추는 게임을 구현하세요
		//RandomEx 예제 이용하세요
		int min =1 ,max =100;
		int num = min -1;
		Scanner sc = new Scanner(System.in);
		
		int random = (int)(Math.random() * (max - min + 1) +min);
		while (random != num ) {
			System.out.println("input(1~100) : "  );
			num = sc.nextInt();
		
			
		
		if(num > random) {
			System.out.println("up");
		}
		else if(num < random) {
			System.out.println("down");
		}
		else{
			System.out.println("good");
			
		}
		}
		sc.close();
		
	}

}
