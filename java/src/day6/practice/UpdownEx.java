package day6.practice;

import java.util.Scanner;

public class UpdownEx {

	public static void main(String[] args) {
		int min = -100 , max =1000;
		int num = min -1;
		char menu = 'y';
		Scanner sc = new Scanner(System.in);
		
		for(menu = 'y';menu != 'n';) {
			
			int random = (int)(Math.random() * (max - min + 1) + min);
			
			for ( num= min-1 ;random != num;) {
				System.out.println("input(-100~1000) : "  );
				num = sc.nextInt();
		
			
		
			if(num < random) {
				System.out.println("up");
			}
			else if(num > random) {
				System.out.println("down");
			}
			else{
				System.out.println("good");
			
			}
		
			}
			System.out.println("continue?(y/n) : ");
			menu =sc.next().charAt(0);
		}
		System.out.println("Exit!");
		sc.close();
		
		
	}

}
