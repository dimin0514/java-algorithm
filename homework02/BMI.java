package homework02;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("비만 측정 프로그램입니다");
		String name = "";
		double weight = 0;
		double tall = 0;
		System.out.println("이름을 입력하세요");
		name = scan.next();
		System.out.println("몸무게를 입력하세요");
		weight = scan.nextInt();
		System.out.println("키를 m로 입력하세요 ex) 176cm -> 1.76m ");
		tall = scan.nextDouble();
		
		double bmi = weight/(tall*tall);
		String eval = "";
		
		if(bmi > 30.0) {
			eval="고도비만";
		}else if(bmi > 25.0) {
			eval="바먼";
		}else if(bmi > 23.0) {
			eval="과체중";
		}else if(bmi > 18.5) {
			eval="정상";
		} else {
			eval="저체중";
		}System.out.printf("%s님은  bmi는 %.1f %s 입니다", name, bmi, eval);


	}
}
