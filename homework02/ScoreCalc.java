package homework02;

import java.util.Scanner;

public class ScoreCalc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  Acc= 0;
		int loop = 0;
		String AccString= "";


		while(true) {
			System.out.println("더하시려는 숫자를 입력하세요(종료는 -1)");
			int num =0;
			num = sc.nextInt();
			if (num == -1) {
				AccString = 	AccString.substring(0, AccString.length()-1);
				System.out.printf("현재까지의 누적값은 %s = %d점 이고, 평균은 %d점 입니다.", AccString , Acc , Acc/loop);
				break;
			} 

			Acc += num;
			AccString += num + "+";
			loop +=1;
		}



	}

}
