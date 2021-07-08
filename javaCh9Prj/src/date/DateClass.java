package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClass {

	public static void main(String[] args) {
		
		Date now = new Date();
		System.out.println(now);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yy년 MM월 dd일 hh:mm:ss");
		System.out.println(sdf.format(now));
		
		
	}

}
