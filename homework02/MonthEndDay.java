package homework02;

import java.util.Scanner;

public class MonthEndDay {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int month = 0;
		String eval = "";
		
		System.out.println("달을 입력하세요");
		month = scanner.nextInt();
			
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
		}System.out.printf("%d월은 %s까지 입니다",month, eval);



	}

}
