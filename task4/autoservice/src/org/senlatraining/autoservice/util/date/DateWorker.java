package org.senlatraining.autoservice.util.date;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import org.senlatraining.autoservice.util.parsers.ParserForDate;

public class DateWorker {

	public String getFormatDate(Calendar c){
	    SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
	    
	    return dateFormat.format(c);     
	}
//--------------------------------------------------------------------------	
	public Calendar addDays(Calendar c, Integer d){
		c.add(Calendar.DAY_OF_YEAR, d);
		 
		return c; 
	}
//--------------------------------------------------------------------------
	
}
