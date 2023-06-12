package day9.classex;

public class Car {
	//맴버변수(필드)
	private String name;
	private String company;
	private int year;
	private int speed;
	private char gear ;
	private boolean power;
	
	
	
	//생성자
	public Car(String _name, String _company, int _year) {		
		name = _name;
		company = _company;
		year = _year;
		gear = 'P';
	}
	
	//메서드
	/** 자동차 정보를 출력하는 메서드
	 * 매개변수 
	 * 리턴타입
	 * 메서드명 printInfo
	 */
	public void printInfo() {
		
		System.out.println("자동차 조회");
		System.out.println("차량이름 : " + name);
		System.out.println("제조사  : " + company);
		System.out.println("연식   : " + year);
		System.out.println("전원   : " + (power? "on" : "off"));
		System.out.println("기어   : " + gear);
		System.out.println("속력   : " + speed);
		
	}
	/** 속력이 1씩 증가하는 메서드
	 *  매개변수 증가할껀지 안할껀지 boolean
	 *  리턴타입 
	 *  메서드명 getSpeed
	 */
	
	public void speedChange(boolean positive){
		//전원이 꺼져있음 종료
		if(!power) {
			return;
		}
		//기어가 중립 또는 주자중이면 종료
		if(gear =='N' || gear == 'P') {
			return;
		}
		//속력이 증가하는 경우이면
		if(positive) {
			speed += 1;
		}
		//속력이 감소하는 경우이고 0보다 클때
		else if(speed > 0){
			speed -= 1;
		}
	}
	/**자동차 시동을 켜거나 끄는 메서드
	 * 매개변수 
	 * 리턴타입
	 * 메서드명 turn
	 */
	public void turn() {
		if(!power) {
			power = true;
		}
		else if(gear == 'P') {
			power = false;
		}
	}

	public void setGear(char _gear) {
		gear = _gear;
	}
	
}
