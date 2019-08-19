package study04;

import java.util.Scanner;

public class Engine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		while(true) {
			System.out.println("0.종료  1.BMI 2.이해못할 문제");
			switch(scanner.nextInt()) {
			case 0 : System.out.println("종료");return;
			case 1 : System.out.println("BMI: 이름, 2.몸무게 입력");
			//이 공간에 bmi 로직이 들어옴 근데 여기다 다 쓰면 절차지향적 코딩 student에서 가져와야 객체지향 코딩임
			String name = scanner.next();
			double height= scanner.nextDouble();
			double weight = scanner.nextDouble();
			String result = student.getBmi(name, height, weight);
			System.out.println(result);
					
			break;
			
			case 2:
				//이름 , 주소, 나이 , 은행잔고, 신용도
				//결과가 뭘 넣던간에 1억대출 

				System.out.println("이해못할문제");
				name = scanner.next();
				String addr = scanner.next();
				int age = scanner.nextInt();
				int money = scanner.nextInt();
				String shin = scanner.next();
				
				
				result = student.daechul(name, addr, age, money, shin); 
				System.out.println(result);
				break;

			
			}
		}
	}

}
