package day2.homework;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		int num1, num2;
		char op;
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("�� ������ ��������ڸ� �Է��ϼ��� (�� :1 + 2) ");
				num1 = sc.nextInt();
				op = sc.next().charAt(0);
				num2 = sc.nextInt();
				System.out.println("" + num1 + " " + op + " " + num2);
				
				sc.close();
	}

}
