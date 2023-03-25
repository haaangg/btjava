package KiemTraGiuaKi;

public class MyDate {
		private int year;
		private int month;
		private int day;
		private static String MONTHS[]= {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		private static String DAYS[]= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};	
		private static int DAYS_IN_MONTHS[]= {31,28,31,30,31,30,31,31,30,31,30,31};
		
		public static boolean isLeapYear(int year) {
			if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
				return true;
			return false;
		}
		
		public static boolean isValidDate(int year, int month, int day) {
	        return (1 <= year && year <= 9999) && (1 <= month  && month <= 12)
	        		&& ( 1 <= day   &&    day <= getMonthLastDay(year, month));
	    }
		
		public static int getDayOfWeek(int year,int month,int day){
		    int fullDay = 0;
		    for (int i = 0; i < year; i++) {
		        if (isLeapYear(i)) {
		            fullDay += 366;
		        } else {
		            fullDay += 365;
		        }
		    }
		    for (int i = 1; i < month; i++) {
		        fullDay += DAYS_IN_MONTHS[i-1];
		    }
		    fullDay += day - 1;

		    // Trả về ngày trong tuần tương ứng với kết quả tính được
		    return fullDay % 7;
		}
		
		public MyDate(int year, int month, int day) {
			this.year = year;
			this.month = month;
			this.day = day;
		}

		public void setDate(int year, int month, int day) 
	    {
	        this.year  = year;
	        this.month = month;
	        this.day   = day;
	    }
		
		public void setYear(int year) {
			this.year = year;
		}
		
		public int getYear() {
			return year;
		}
		
		public void setMonth(int month) {
			this.month = month;
		}
		
		public int getMonth() {
			return month;
		}
		public void setDay(int day) {
			this.day = day;
		}
		public int getDay() {
			return day;
		}
		public static int getMonthLastDay(int year, int month) {
			if(isLeapYear(year) && month == 2)
				return DAYS_IN_MONTHS[month-1] + 1;
			else
				return DAYS_IN_MONTHS[month-1];
	    }
		
		@Override
		public String toString() {
			int weekDay = getDayOfWeek(year, month, day);
			if(weekDay==0)
				weekDay=7;
	        return String.format("%1$s %2$d %3$s %4$d", DAYS[weekDay-1], day, MONTHS[month-1], year);
		}
		
		public MyDate nextDay() {
			int maxDay = getMonthLastDay(year, month);
	        if (maxDay == day && 12 == month && 9999 == year) {
	            return this;
	        }

	        if (maxDay == day && 12 == month) {
	            setDate(year+1, 1, 1);
	            return this;
	        }

	        if (maxDay == day) {
	            setDate(year, month+1, 1);
	            return this;
	        }
	        
	        setDate(year, month, day+1);
	        return this;
		}

		
		public MyDate nextMonth() {
			if (12 == month && 9999 == year) {
	            return this;
	        }
			int maxDay;
			if(12 == month)
				maxDay=getMonthLastDay(year+1, 1);
			else
				maxDay=getMonthLastDay(year, month+1);

	        if (day == getMonthLastDay(year, month)) {
	            maxDay = maxDay;
	        }
	        else if (day > maxDay) {
	            maxDay = maxDay;
	        }
	        else if (day < maxDay) {
	            maxDay = day;
	        }

	        if (12 == month) {
	            setDate(year+1, 1, maxDay);
	            return this;
	        }

	        setDate(year, month+1, maxDay);
	        return this;
		}
		
		public MyDate nextYear() {
			if ( year==9999) {
	            return this;
	        }

	        int maxDay = getMonthLastDay(year+1, month);

	        if (day == getMonthLastDay(year, month)) {
	            maxDay = maxDay;
	        }
	        else if (day > maxDay) {
	            maxDay = maxDay;
	        }
	        else if (day < maxDay) {
	            maxDay = day;
	        }

	        setDate(year+1, month, maxDay);
	        return this;
		}
		
		public MyDate previousDay() {
			if (1 == day && 1 == month && 1 == year) {
	            return this;
	        }

	        if (1 == day && 1 == month) {
	            setDate(year-1, 12, getMonthLastDay(year-1, 12));
	            return this;
	        }

	        if (1 == day) {
	            setDate(year, month-1, getMonthLastDay(year, month-1));
	            return this;
	        }
	        
	        setDate(year, month, --day);
	        return this;
		}

		public MyDate previousMonth() {
			if (1 == month && 1 == year) {
	            return this;
	        }
			int maxDay;
			if(1 == month)
				maxDay=getMonthLastDay(year-1, 12);
			else
				maxDay=getMonthLastDay(year, month-1);
	        
	        if (day == getMonthLastDay(year, month)) {
	            maxDay = maxDay;
	        }
	        else if (day > maxDay) {
	            maxDay = maxDay;
	        }
	        else if (day < maxDay) {
	            maxDay = day;
	        }

	        if (1 == month) {
	            setDate(year-1, 12, maxDay);
	            return this;
	        }

	        setDate(year, month-1, maxDay);
	        return this;
		}

		public MyDate previousYear() {
			if (1 == year) {
	            return this;
	        }

	        int maxDay = getMonthLastDay(year-1, month);

	        if (day == getMonthLastDay(year, month)) {
	            maxDay = maxDay;
	        }
	        else if (day > maxDay) {
	            maxDay = maxDay;
	        }
	        else if (day < maxDay) {
	            maxDay = day;
	        }

	        setDate(year-1, month, maxDay);
	        return this;
		}
}