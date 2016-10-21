package org.senlatraining.autoservice.util.parsers;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ParserForDate {
	public Date parseDate(String date_time){
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
		Date date = dateFormat.parse(date_time);
	
		return date;
	}
}
