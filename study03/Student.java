package study03;

import java.util.Scanner;

public class Student {
//bmi ranking 3 4
	public String getBmi(String name, double weight, double tall) {

	
		String eval = "";

		double bmi = weight/(tall*tall);
		
		if(bmi > 30.0) {
			eval="고도비만";
		}else if(bmi > 25.0) {
			eval="비만";
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
	public String getRanking(double[] score) {
			
		for (int i = 0; i < score.length; i++) {
		}
		String[] player = {"A","B","C"};
		for (int i =0 ; i < score.length-1; i++) {
			System.out.printf("%s 선수의 기록 : %f 초 \n ", player[i],score[i] );

			for (int j = i+1; j < score.length; j++) {
				if(score[i]> score[j]) {
					double temp = 0.0d;
					String tempName = "";
					
					temp = score[i];
					score[i] = score[j];
					score[j] = temp;
					
					tempName = player[i];
					player[i] = player[j];
					player[j] = tempName;
					
					
				}//선택정렬
			}
		}
	
		for (int i = 0; i < player.length; i++) {
			System.out.printf(" %d등 : %s 선수 기록 (%f초 ) \n" , i+1 , player[i] , score[i]);
		}
		return "등수를 계산중";

		
	}
	public void howMuch() {
		Scanner scanner = new Scanner(System.in);
		
		int price = 0;
		int num = 0;
		
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
		
	}    // howmuch 는 동사라서 get 안써도 됨
	public void getReportCard() {
		Scanner scanner = new Scanner(System.in);
		String[] subjects = {"국어","영어","수학"};
		int[] scores = new int[3];
		int sum = 0;
		int avg = 0;
		String name = "";
		
		System.out.println("이름을 입력하세요");
		name = scanner.next();
		
		for(int i=0; i < subjects.length; i++) {
			System.out.printf("%s 점수를 입력하세요\n",subjects[i]);
			scores[i] = scanner.nextInt();
		}
		
		sum = scores[0]+scores[1]+scores[2];
		avg = sum /3 ;
		
		String passFail = "";
		if(avg >= 90) {
			passFail="장학생";
		}else if(avg >= 70) { 
			passFail = "합격";
		}else { passFail = "불합격";
		}
		
		System.out.println("학생           국어        영어        수학        총점        평균        합격여부");
		System.out.println("=======================================================");
		System.out.printf(" %s    %d     %d     %d     %d     %d    %s \n", name, scores[0], scores[1],scores[2], sum , avg, passFail);	
	}
}
