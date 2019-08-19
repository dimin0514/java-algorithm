package homework02;

import java.util.Scanner;

public class ReportCard {

	public static void main(String[] args) {
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
		System.out.printf(" %s    %d     %d     %d     %d     %d    %s", name, scores[0], scores[1],scores[2], sum , avg, passFail);	

	}

}
