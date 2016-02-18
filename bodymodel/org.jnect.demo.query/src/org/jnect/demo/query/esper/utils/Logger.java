package org.jnect.demo.query.esper.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

	public static void log(String message) {
		System.out.println(getDateTime() + " " + message);
	}
	
	private static String getDateTime() {
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss:SSS");
		Date date = new Date();
		return dateFormat.format(date);
	}
}
