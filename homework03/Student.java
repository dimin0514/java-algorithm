package homework03;

import java.util.Scanner;

public class Student {
	public String getAc(String op, int a, int b, int eval) {
		
		switch (op) {
		case "+": eval = a+b;			
		break;
		case "-": eval = a-b;	
		break;
		case "*": eval = a*b;	
		break;
		case "/": eval = a/b; 
		break;
		}

		
		String result = String.format("%d %s %d = %d",a, op ,b, eval);		
		
		return result;
		
	}


	public String getBmi(String name,double weight,double tall) {
		double bmi = weight/(tall*tall);
		String eval = "";
		
		if(bmi > 30.0) {
			eval="고도비만";
		}else if(bmi > 25.0) {
			eval="바먼";
		}else if(bmi > 23.0) {
			eval="고도비만";
		}else if(bmi > 18.5) {
			eval="정상";
		} else {
			eval="저체중";
		}
		String result = String.format("%s님은  bmi는 %.1f %s 입니다", name, bmi, eval);
		return result;
	

	}
	public void getHowMuch() {
		int price = 0;
		int num = 0;
		Scanner scanner = new Scanner(System.in); 
		System.out.println("얼마에요?");
		price = scanner.nextInt();
		System.out.println("몇개 드릴까요?");
		num = scanner.nextInt();
		
		int total = price * num;
		int dc = total / 10;
		int finalPrice = total - dc;
		
		System.out.printf("그럼 총 금액은 %d 원 입니다.\n",total);
		System.out.printf("할인 금액은 %d 원 입니다.\n",dc);
		System.out.printf("최종 금액은 %d 원 입니다.\n",finalPrice);
	}
	public String getJoin(String id, String password, String name, String birth, String blood, double tall, double weight) {

		int temp=Integer.parseInt(birth.substring(1,4));
		String checkAudlt="";
		if(temp<=1999) { checkAudlt = "성년";
		}else { 
			checkAudlt = "미성년";
		}
		String result = String.format("=== 회원정보 === \n 아이디: %s \n 비밀번호:%s \n 이름: %s \n 생년월일: %s \n 성인여부: %s \n 키: %.1f \n 몸무게: %.1f \n 혈액형: %s",id,password,name,birth,checkAudlt,tall,weight,blood);
		return result;
		

	}
	public String getLeapYear(int year) {
		String result = "";
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
		result =String.format("%s 입니다", result);
		return result;
		
	}
	

}
