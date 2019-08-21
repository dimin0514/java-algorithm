package homework04_calendar;

import javax.swing.JOptionPane;

public class MycalendarController {

	public static void main(String[] args) {
		MyCalendar myCalendar = null;
		MyCalendarService myCalendarService = new MyCalendarService();
		
		while(true) {
			
			switch(JOptionPane.showInputDialog("0.종료 1.입력 2.입력한 달의 마지막 날자 3.윤달여부")) {
			case "0" : System.out.println("종료"); return;
			case "1" :
				myCalendar = new MyCalendar();
				String month=JOptionPane.showInputDialog("달 입력");
				myCalendar.setMonth(Integer.parseInt(month));
				String year=JOptionPane.showInputDialog("년도 입력");
				myCalendar.setYear(Integer.parseInt(year));
			break;
			case "2" : 
				JOptionPane.showMessageDialog(null, myCalendarService.getEndDay(myCalendar));
				break;
			case "3" : 
				JOptionPane.showMessageDialog(null, myCalendarService.isLeapYear(myCalendar));

				break;
			}
		}
		

	}

}
