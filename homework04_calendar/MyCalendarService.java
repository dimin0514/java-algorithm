package homework04_calendar;

public class MyCalendarService {
	public String getEndDay(MyCalendar myCalendar) {
		String endDay = "";
		
		String eval = "";
		int month=myCalendar.getMonth();
		
		switch(month){
		case 1 : eval= "31일"; break;
		case 2 : eval= "29일"; break;
		case 3 : eval= "31일"; break;
		case 4 : eval= "30일"; break;
		case 5 : eval= "31일"; break;
		case 6 : eval= "30일"; break;
		case 7 : eval= "31일"; break;
		case 8 : eval= "31일"; break;
		case 9 : eval= "30일"; break;
		case 10 : eval= "31일"; break;
		case 11 : eval= "30일"; break;
		case 12 : eval= "31일"; break;
		
		}
		
		endDay = String.format("마지막 날은 %s 입니다", eval);
		return endDay;
	
	}
	public String isLeapYear(MyCalendar myCalendar) {
		String leapYear = "";
		int year=myCalendar.getYear();

		if(year%4==0){
			leapYear ="윤년";
			if(year%100==0) {
				leapYear ="평년";
				if(year%400==0) {
					leapYear ="윤년";
				}else {
					leapYear ="평년";
				}
			}else {
				leapYear ="윤년";
			}
		}else{
			leapYear ="평년";
		}
		
		leapYear = String.format("그 년도는 %s입니다", leapYear);
		return leapYear;

	
	}

}
