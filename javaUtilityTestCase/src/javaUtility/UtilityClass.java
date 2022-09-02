package javaUtility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//import java.util.regex.

public class UtilityClass {
	
	public int sum (int num1, int num2) {
		int no = num1 + num2;
		return no;
	}
	
	public static boolean isAlphaNumeric(String s) {
		String regex = "^[a-zA-Z0-9]+$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(s);
		
		return matcher.matches();

	}
	
	public static String removeLeadingZero(String s) {

		        String regex = "^0+(?!$)";
		 
		        s = s.replaceAll(regex, "");
		 
		        return s;
		    
	}
	
	public static boolean isNullOrEmpty(String s) {
		
		if (s == null || s.isEmpty()){
			return false;
		}
		
		return true;
		
	}
	
	public static Date convertToDate(String sDate) {
		
		try {
		 SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
		 Date date=format.parse(sDate); 
		 return date;
		}
		catch(Exception e) {
			return null;
		}
		
		
	}
	

}










//return s != null && s.matches("^[a-zA-Z0-9]*$");
