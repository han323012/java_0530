package day9.classex;

import day9.classex2.B;

public class AccessModiferEx {

	public static void main(String[]args) {
		A a = new A();
		B b = new B();
		
		//num3은 접근제어자가 public
		//AccessModifier 클래스와 A클래스는 같은 패키지에 있는 클래스
		//AccessModifier 클래스와 B클래스는 같은 패키지에 있는 클래스
		//num3는 접근제어자가 public 같은 패키지이든 아니든 상관 없음
		
		a.num3 = 10;
		b.num3 = 20;
		
		//num2는 접근제어자가 디폴트 다른 페키지에 있는 B클래스의 객체는 접근이 안됨
		
		a.num2 = 10;
		//b.num2 = 20;
		
		//num1은 접근제어자가 private
		//같은 패키지이든 아니든 다른클래스에서 접근할 수 없음
		//a.num1 =10;
		a.setNum1(10);
		System.out.println(a.getNum1());
		//b.num1 =10;
		//안되는 것들은 주석처리
	}
}
class A{
	private int num1;
	int num2;
	public int num3;
	
	/** 클래스 A의 객체정보 num1을 출력하는 메서드
	 * 매개변수 없음 이미 알고있는 내 정보 num1이기 때문에
	 * 리턴타입 없음 
	 * 메서드명 print
	 */
	public void print() {
		//num1은 private이기 때문에 A클래스의 메서드에서 사용가능
		//이미 알고있는 내 정보를 활용하는 경우 매개변수로 전달받지 않아도 됨
		System.out.println(num1);
	}
	//private으로 된 num1에 접근하기 위해서 getter를 추가
	public int getNum1() {
		return num1;
		
	}
	//private으로 된 num1에 값을 변경하기 위해서 Setter로 
	public void setNum1(int _num1) {
		num1 = _num1;
	}
}
