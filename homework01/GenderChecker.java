package homework01;

import java.util.Scanner;

public class GenderChecker {

	public static void main(String[] args) {
		System.out.println("성별 판독기입니다 주민번호 입력하세요");
		Scanner scan = new Scanner(System.in);
		String ssn="";
		ssn = scan.next();
		int num = Integer.parseInt(ssn.substring(7,8));
		String eval="";
		switch(num) {
		case 9 : eval="1800~1899년에 태어난 남성"; break;
		case 0 : eval="1800~1899년에 태어난 여성"; break;
		case 1 : eval="1900~1999년에 태어난 남성"; break;
		case 2 : eval="1900~1999년에 태어난 여성"; break;
		case 3 : eval="2000~2099년에 태어난 남성"; break;
		case 4 : eval="2000~2099년에 태어난 여성"; break;
		case 5 : eval="1900~1999년에 태어난 외국인 남성"; break;
		case 6 : eval="1900~1999년에 태어난 외국인 여성"; break;
		case 7 : eval="2000~2099년에 태어난 외국인 남성"; break;
		case 8 : eval="2000~2099년에 태어난 외국인 여성"; break;
					
		}System.out.println(eval);
			
	}

}
