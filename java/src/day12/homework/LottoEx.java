package day12.homework;

import java.util.Scanner;

import array.Array;

/*
 * 로또 번호를 생성하고, 사용자가 번호를 입력하면 몇등인지 출력하는 코드를
 * 작성하세요. (1~45)
 * 1등 : 번호 6개
 * 2등 : 번호 5개 + 보너스
 * 3등 : 번호 5개
 * 4등 : 번호 4개
 * 5등 : 번호 3개
 * 꽝
 * number : [1, 3, 40, 23, 24, 45]		//컴퓨터는 숫자 7개
 * bonus : 2
 * user  : 1 3 40 23 24 2				//사용자는 6개
 * 2등 입니다.
 * 
 * number : [1, 3, 40, 23, 24, 45]
 * user : 1 2 3 4 5 6
 * 꽝
 */

/**
 * 주어진 배열에 중복된 값이 있는지 없는지 체크
 * 매개변수 : 배열 = int arr[]
 * 리턴타입 : 중복여부 boolean
 * 메서드명 : arrayCheck
 */

public class LottoEx {

	public static void main(String[] args) {

		int arr1[] = new int[7];
		int arr2[] = new int[6];
		int count=0;
		Array.createRandomArray(1, 45, arr1);
		Array.printArray(arr1);
		
		
		arr2 = Array.scanArray(6);
		
		for (int i = 0; i < 6; i++) {
			if (Array.contains(arr1[i], 6, arr2)) {
				count++;
			}
		}
		if(count ==6) System.out.println("1등");
		else if(count ==5 && Array.contains(arr1[6], 6, arr2)) System.out.println("2등");
		else if(count ==5) System.out.println("3등");
		else if(count ==4) System.out.println("4등");
		else if(count ==3) System.out.println("5등");
		else System.out.println("꽝");
		
		/*
		 * int lotto[] = new int[7];
		Array.createRandomArray(1, 45, lotto);
		
		int bonus =lotto[6];
		int lotto2 = new int[6];
		System.arraycopy(lotto, 0, lotto2, 0, 0);
		*/
	}
	/**로또번호와 사용자 번호가 주어지면 몇개가 같은지 알려주는 메서드
	 * 매새변수 int lotto[] int user[]
	 * 리턴타입 int
	 * 메서드명 count
	 */
	public static int count(int lotto[],int user[]) {
		if(lotto == null || user == null) {
			return 0;
		}
		int count = 0;
		for(int tmp : lotto) {
			if(Array.contains(user.length, tmp, user)) {
				count++;
			}
		}
		return count;
	}
	/**일치하는 개수와 보너스 번호와 사용자 번호가 일치하는 여부를 알려주면 등수를 출력하는 메소드
	 * 매개변수 int count boolean checkBonus
	 * 리턴타입
	 * 메서드명	
	 */
	public static void printResult(int count, boolean checkBonus) {
		switch(count) {
		case 6:
			System.out.println("Winner of the lottery");
			break;
		case 5:
			if(checkBonus) {
			System.out.println("second place in the lottery");
			}else {
			System.out.println("3rd place in the lottery");
			}
			break;
		case 4:
			System.out.println("4rd place in the lottery");
			break;
		case 3:
			System.out.println("5rd place in the lottery");
			break;
		default:
		System.out.println("losing ticket");
		}
	}
}
