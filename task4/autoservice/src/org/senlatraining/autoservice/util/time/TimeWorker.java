package org.senlatraining.autoservice.util.time;

import java.util.Calendar;
import java.util.TimeZone;

public class TimeWorker {
	 public void getTime(){
	        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT+01:00")); // Московское время
	        System.out.println("Day: " + calendar.getTime());
	        
	        calendar.add(Calendar.DAY_OF_MONTH, -1);
	        System.out.println("Day: " + calendar.getTime());
	        
	        // Пример перехода
	        
	        calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT+01:00")); // Московское время
	        calendar.set(2006,8,01); // 1 Сентября 2006 года (не забываем, что месяц в Календаре начинается с "0")
	        System.out.println("Day: " + calendar.getTime());
	 
	        calendar.add(Calendar.DAY_OF_MONTH, -1);
	        System.out.println("Day: " + calendar.getTime());
	    }
}
