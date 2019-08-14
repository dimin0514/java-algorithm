package homework02;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("비만 측정 프로그램입니다");
		String name = "";
		int weight = 0;
		double tall = 0;
		System.out.println("이름을 입력하세요");
		name = scan.next();
		System.out.println("몸무게를 입력하세요");
		weight = scan.nextInt();
		System.out.println("키를 m로 입력하세요 ex) 176cm -> 1.76m ");
		tall = scan.nextDouble();
		
		double bmi = Math.round(weight/(tall*tall)*10)/10;
		
		if(bmi > 30.0) {
			System.out.println(bmi+"고도비만");
		}else if(bmi > 25.0) {
			System.out.println("비만");
		}else if(bmi > 23.0) {
			System.out.println("과체중");
		}else if(bmi > 18.5) {
			System.out.println("정상");
		} else {
			System.out.println("저체중");
		}

	}

}
