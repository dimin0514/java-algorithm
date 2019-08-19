package homework02;
import java.util.Scanner;
public class Ranking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] score =new double[3];
		String[] player = {"A","B","C"};
		
		System.out.println("A, B, C 선수의 기록을 차례로 입력하세요 ");
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%s 선수의 기록 : %f 초 \n " ,player[i],score[i] );
		}
		
		for (int i =0 ; i < score.length-1; i++) {
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

		
	}
	
}
