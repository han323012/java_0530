package day2.variable;

public class OverflowEx {

	public static void main(String[] args) {
		byte num = 127;
		++num; // num에 +1 하는거
		System.out.println(num); // 오버플로우가 발생
		
		num = -128;
		--num; // num에 -1 하는거
		System.out.println(num);// 언더플로우가 발생
	}

}
