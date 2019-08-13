package homework01;
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		System.out.println("가위 바위 보 게임");
		System.out.println("1.가위  2.바위 3.보");
		int b = ran.nextInt(3)+1;
		int a = 0;
		a = scan.nextInt();
		String eval="";
		switch(a - b) {
		case 0 : eval="비겼습니다"; break;
		case -1 : eval ="당신은 졌습니다"; break;
		case -2 : eval="당신은 이겼습니다"; break;
		case 1 : eval="당신은 이겼습니다"; break;
		case 2 : eval="당신은 졌습니다" ; break;
		}
		System.out.println(eval);

	}

}
