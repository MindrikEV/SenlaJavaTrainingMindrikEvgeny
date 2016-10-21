package org.senlatraining.autoservice.util.date;

import java.util.Calendar;
import java.util.TimeZone;
import java.text.SimpleDateFormat;
import org.senlatraining.autoservice.util.parsers.ParserForDate;
import java.util.Date;

public class DateWorker {
	 public Date getCurrentDate(){

	        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
	        Calendar calendar = Calendar.getInstance();
	        
	        return dateFormat.format(calendar.getTime());
	 }       
}
