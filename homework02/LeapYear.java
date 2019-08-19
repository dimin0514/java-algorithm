package homework02;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		int year=0;
		String result= "";
		System.out.println("년도를 입력하세요");
		year = scanner.nextInt();

		
		if(year%4==0){
			result ="윤년";
			if(year%100==0) {
				result ="평년";
				if(year%400==0) {
					result ="윤년";
				}else {
					result ="평년";
				}
			}else {
				result ="윤년";
			}
		}else{
			result ="평년";
		}
		System.out.println(result);
		
		
		


	}

	

}
