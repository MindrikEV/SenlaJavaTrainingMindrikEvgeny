package org.senlatraining.autoservice.util.time;

import java.util.Calendar;
import java.util.TimeZone;

public class TimeWorker {
	 public void getTime(){
	        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT+01:00")); // ���������� �����
	        System.out.println("Day: " + calendar.getTime());
	        
	        calendar.add(Calendar.DAY_OF_MONTH, -1);
	        System.out.println("Day: " + calendar.getTime());
	        
	        // ������ ��������
	        
	        calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT+01:00")); // ���������� �����
	        calendar.set(2006,8,01); // 1 �������� 2006 ���� (�� ��������, ��� ����� � ��������� ���������� � "0")
	        System.out.println("Day: " + calendar.getTime());
	 
	        calendar.add(Calendar.DAY_OF_MONTH, -1);
	        System.out.println("Day: " + calendar.getTime());
	    }
}
