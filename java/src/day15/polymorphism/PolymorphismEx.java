package day15.polymorphism;

public class PolymorphismEx {

	public static void main(String[] args) {
		//Tv 1대 에어컨 2대 라디오 3대를 객체로 생성한 후 전원을 켜는 기능을 실행해 보세요
		/*Tv tv =new Tv();
		Radio radio = new Radio();
		Radio radio1 = new Radio();
		Radio radio2 = new Radio();
		AirConditioner aircon =new AirConditioner();
		AirConditioner aircon1 =new AirConditioner();
		RemoteControl remocon = new RemoteControl();
		
		HomeAppliances appliance =tv; //업캐스팅
		
		remocon.turnOn(radio);//가전키는거
		remocon.turnOn(radio1);//가전키는거
		remocon.turnOn(radio2);//가전키는거
		remocon.turnOn(aircon);//가전키는거
		remocon.turnOn(aircon1);//가전키는거
		remocon.turnOn(tv);//가전키는거
		*/
		/*
		RemoteControl remocon = new RemoteControl();
		Tv tv = new Tv();
		AirConditioner aircons[] = new AirConditioner[2];
		Radio radios[] =new Radio[3];
		
		for(int i = 0; i<aircons.length; i++) {
			aircons[i] = new AirConditioner();
		}
		for(int i = 0; i<radios.length; i++) {
			radios[i] = new Radio();
		}
		tv.turnOn();
		for(AirConditioner aircon : aircons) {
			remocon.turnOn(aircon);
		}
		for(Radio radio : radios) {
			remocon.turnOn(radio);
		}
		*/
		RemoteControl remocon = new RemoteControl();
		int tvCount = 1, airconCount =2, radioCount =3;
		int total = tvCount +airconCount+radioCount;
		HomeAppliances homeAppliances[] = new HomeAppliances[6];
		int count =0;
		
		for(int i = 0; i <tvCount; i++) {
			homeAppliances[count++] =new Tv();//업캐스팅
		}
		
		for(int i = 0; i <airconCount; i++) {
			homeAppliances[count++] =new AirConditioner();//업캐스팅
		}
		
		for(int i = 0; i <radioCount; i++) {
			homeAppliances[count++] =new Radio();//업캐스팅
		}
		
		for(HomeAppliances homeAppliance :  homeAppliances) {
			remocon.turnOn(homeAppliance);
		}
		
		for(HomeAppliances homeAppliance :  homeAppliances) {
			//라디오로 다운캐스팅이 가능한 객체만 꺼
			if(homeAppliance instanceof Radio) {
				remocon.turnOff(homeAppliance);//다운캐스팅 아님
				Radio radio =(Radio)homeAppliance;//다운캐스팅
				System.out.println(radio.frequency);
			}
		}
		
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
class RemoteControl {
	
	public void turnOn(HomeAppliances appliance) {
		appliance.turnOn();
		System.out.println("전원이 켜졌습니다.");
		
	}
	
	public void turnOff(HomeAppliances appliance) {
		appliance.turnOff();
		System.out.println("전원이 꺼졌습니다.");
		
	}
	
}
class Tv extends HomeAppliances{
	
	boolean power;
	int channel;
}

class AirConditioner extends HomeAppliances{
	
	boolean power;
	double currentTemperature;
	double desiredTemperature;
}

class Radio extends HomeAppliances{
	
	boolean power;
	double frequency;
}
