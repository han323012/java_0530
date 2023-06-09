package day8.overloading;

public class Ex1 {

	public static void main(String[] args) {
		//println의 메서드 오버로딩 
		//지금까지 쭉 써오고 있었음
		System.out.println(1);
		System.out.println("1");
		System.out.println(1.1);
		System.out.println('c');
		
		System.out.println(sum(1,1));
		System.out.println(sum(1.1,1));
		System.out.println(sum(1.1,1));
		System.out.println(sum(1.1,1.1));
		System.out.println(sum(1,2,3));
		
	}
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	public static double sum(double num1, int num2) {
		return num1 + num2;
	}
	public static double sum(int num1, double num2) {
		return num1 + num2;
	}
	public static double sum(double num1, double num2) {
		return num1 + num2;
	}
	public static int sum(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	//public static [double|리턴타입] [sum|메서드] [(int num1, int num2)|매개변수] {
		//return num1 + num2; 
	//}
	//이해는 했다만 뭔가 근본이 해결안된 느낌...
	//맨 밑에 있는 놈만 써도 되는데 보여주기 위해서 전부 적었다 라는 느낌
}
