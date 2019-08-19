package study03;
import java.util.Scanner;
import study03.Student;
public class Engine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		
		int flag = 0;
		String result = "";
		while(true) {
			System.out.println("메뉴: 0 종료  1.BMI 2.Ranking 3.How much? 4.ReportCard");
			flag = scanner.nextInt();
			switch(flag) {
			case 0 : 
				System.out.println("종료"); 
				return;
			case 1 : 
				System.out.println("BMI");
				String name = "";
				double tall = 0.0;
				double weight = 0.0;
				System.out.println("이름을 입력하세요");
				name = scanner.next();
				System.out.println("몸무게를 입력하세요");
				weight = scanner.nextInt();
				System.out.println("키를 m로 입력하세요 ex) 176cm -> 1.76m ");
				tall = scanner.nextDouble();
				result = student.getBmi(name, weight, tall);
				System.out.println(result);
				break;
			case 2 : 
				System.out.println("Ranking");
				double[] score =new double[3];
				System.out.println("A, B, C 선수의 기록을 차례로 입력하세요 ");
				for (int i = 0; i < 3; i++) {
					score[i] = scanner.nextDouble();
				}
				result = student.getRanking(score);
				
			break;
			case 3: 
				System.out.println("HowMuch");
				student.howMuch();
			break;
			case 4: 
				System.out.println("ReportCard"); 
				student.getReportCard();
			break;
			
			}

		}	

	}

}
