package com.kp.org.timesheet.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilities {

	public static Date stringToDate(String dateStr){
		try{
			SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
			return sdf.parse(dateStr);
		}catch (Exception e) {
			return null;
		}
	}
}
