package src;



public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date dt1 = new Date(1, 9, 2020);
        Date dt2 = new Date(22, 9, 2026);
        System.out.println("Difference between two dates is " +
                            getDifference(dt1, dt2));

	}
	
	// A date has day 'd', month 'm' and year 'y'
    static class Date
    {
        int d, m, y;
 
        public Date(int d, int m, int y)
        {
            this.d = d;
            this.m = m;
            this.y = y;
        }
 
    };
 
    // To store number of days in
    // all months from January to Dec.
    static int monthDays[] = {31, 28, 31, 30, 31, 30,
                            31, 31, 30, 31, 30, 31};
 
    // This function counts number of
    // leap years before the given date
    static int countLeapYears(Date d)
    {
        int years = d.y;
 
        // Check if the current year needs to be considered
        // for the count of leap years or not
        if (d.m <= 2)
        {
            years--;
        }
 
        // An year is a leap year if it is a multiple of 4,
        // multiple of 400 and not a multiple of 100.
        return years / 4 - years / 100 + years / 400;

        
    }
    
    static int countLeapYearsMethod(Date d) {
    	
    	 // year to be checked
        int year = d.y;
        int leap = 0;

        // if the year is divided by 4
        if (year % 4 == 0) {

          // if the year is century
          if (year % 100 == 0) {

            // if year is divided by 400
            // then it is a leap year
            if (year % 400 == 0)
              leap = 1;
            else
              leap = 1;
          }
          
          // if the year is not century
          else
            leap = 1;
        }
        
        else
          leap = 0;
        
        return leap;

//        if (leap)
//          System.out.println(year + " is a leap year.");
//        else
//          System.out.println(year + " is not a leap year.");
      
    }

 
    // This function returns number
    // of days between two given dates
    static int getDifference(Date dt1, Date dt2)
    {
        
        int n1 = dt1.y * 365 + dt1.d;
 
        
        for (int i = 0; i < dt1.m - 1; i++)
        {
            n1 += monthDays[i];
        }
 
       
        n1 += countLeapYears(dt1);
 
       
        int n2 = dt2.y * 365 + dt2.d;
        for (int i = 0; i < dt2.m - 1; i++)
        {
            n2 += monthDays[i];
        }
        n2 += countLeapYears(dt2);
 
       
        return (n2 - n1);
    }

}
