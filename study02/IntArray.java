package study02;
import java.util.Scanner;
public class IntArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] subjects = {"국어","영어","수학","과학","사회"}; // 과목이 정해져 있음. 
		int[] scores = new int[5]; //과목 안에 들어가는 점수가 안정해 졌을때!
				//String[] ~~ = new String[5];
		for(int i=0; i < subjects.length; i++) {
			System.out.printf("%s 점수를 입력하세요\n",subjects[i]);
			scores[i] = scanner.nextInt();
			
		}
		for(int i=0; i < scores.length; i++) {
			System.out.printf("%s점수 %d \n",subjects[i], scores[i]);	
		}

	}

}
