package day19.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) throws ParseException {
		
		//현재 시간을 date 객체로 생성
		Date now = new Date();
		System.out.println(now);
		
		//date객체를 문자열로
		SimpleDateFormat format =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//EE요일 하면 요일도 나옴
		String str = format.format(now);
		System.out.println(str);
		
		//문자열 date 객체
		format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		str = "2023-06-27 18:00:00";
		Date date = format.parse(str);
		System.out.println(date);
		date = new Date();
		//원하는 포맷 지정
		DateTimeFormatter formatter 
			= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss zzzz");
		//시간대 정보 지정 시스탬에서 제공하는 기본값
		ZoneId zoneId = ZoneId.systemDefault();
		
		//Date 객체를 ZonedDateTime으로 전환
		ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(date.toInstant(), zoneId);
		
		//시간대 정보를 포함하여 문자열로 변환
		String formattedDateTime = zonedDateTime.format(formatter);
		
		//결과 출력
		System.out.println(formattedDateTime);
		
		
		
		
		
	}

}
