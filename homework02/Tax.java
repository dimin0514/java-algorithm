package homework02;

import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String name = "";
		int income=0;
		double taxRate = 0.097;
		double tax = 0;
		
		System.out.println("이름을 입력하세요");
		name = scanner.next();
		System.out.println("연봉을 입력하세요");
		income = scanner.nextInt();
	
		tax = income * taxRate;
		
		System.out.printf("납부할 세금은 %.1f",tax); 
		

	}

}
