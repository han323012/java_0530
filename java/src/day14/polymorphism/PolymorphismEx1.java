package day14.polymorphism;

public class PolymorphismEx1 {

	public static void main(String[] args) {
		/* 매개변수의 다형성
		 * 리모콘으로 여러 제품의 전원을 켜는 예제
		 * 제품 티비 에어컨 라디오 
		 * 리모컨 클래스 티비 클래스 에어컨 클래스 라디오 클랫
		 */
		Tv tv1 =new Tv();
		Radio radio =new Radio();
		AirConditioner aircon =new AirConditioner();
		RemoteControl remocon = new RemoteControl();
		remocon.turnOn(radio);//티비 켜는거
		remocon.turnOn(aircon);//에어컨 키는거
		remocon.turnOn(tv1);//라디오키는거
		System.out.println("============");
		Tv1 tv2 =new Tv1();
		Radio1 radio1 =new Radio1();
		AirConditioner1 aircon1 =new AirConditioner1();
		RemoteControl1 remocon1 = new RemoteControl1();
		HomeAppliances appliance =tv2; //업캐스팅
		remocon1.turnOff(appliance);
		remocon1.turnOn(radio1);//가전키는거
		remocon1.turnOn(aircon1);//가전키는거
		remocon1.turnOn(tv2);//가전키는거
		System.out.println("============");
		remocon1.turnOff(aircon1);
		remocon1.turnOff(radio1);
		remocon1.turnOff(tv2);
		
	}

}
class RemoteControl{
	public void turnOn(Tv tv) {
		tv.TurnOn();
		System.out.println("전원이 켜졌습니다.");
	}
	public void turnOn(AirConditioner aircon) {
		aircon.TurnOn();
		System.out.println("전원이 켜졌습니다.");
	}
	public void turnOn(Radio radio) {
		radio.TurnOn();
		System.out.println("전원이 켜졌습니다.");
	}
}
class Tv{
	boolean power;
	int channel;
	void TurnOn() {
		power = true;
	}
}
class AirConditioner{
	boolean power;
	double currentTemperature;
	double desiredTemperature;
	void TurnOn() {
		power = true;
	}
}
class Radio{
	boolean power;
	double frequency;
	void TurnOn() {
		power = true;
	}
}
class HomeAppliances{
	boolean power;
	void turnOn() {
		power =true;
	}
	void turnOff() {
		power = false;
	}
}
class RemoteControl1{
	public void turnOn(HomeAppliances appliance) {
		appliance.turnOn();
		System.out.println("전원이 켜졌습니다.");
		
	}
	public void turnOff(HomeAppliances appliance) {
		appliance.turnOff();
		System.out.println("전원이 꺼졌습니다.");
		
	}
}
class Tv1 extends HomeAppliances{
	boolean power;
	int channel;
}
class AirConditioner1 extends HomeAppliances{
	boolean power;
	double currentTemperature;
	double desiredTemperature;
}
class Radio1 extends HomeAppliances{
	boolean power;
	double frequency;
}