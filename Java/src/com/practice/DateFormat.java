package com.practice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormat {

	public static void main(String[] args) {
		
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
		System.out.println(dateFormat.format(date));
		
		Calendar calendar = dateFormat.getCalendar();
		calendar.add(Calendar.DAY_OF_MONTH,30);
		System.out.println(dateFormat.format(calendar.getTime()));
	}

}
