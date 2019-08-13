package homework01;
import java.util.Scanner;
import java.util.Random;
public class Ex {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		System.out.println("가위 바위 보 게임");
		System.out.println("1.가위  2.바위 3.보");
		int com = ran.nextInt(3)+1;
		int user = 0;
		user = scan.nextInt();
		String eval="";
		switch(com) {
		case 1 : 
			switch(user) {
			case 1 : eval = "비겼습니다."; break;
			case 2 : eval = "이겼습니다"; break;
			case 3 : eval = "졌습니다."; break;
			}break;
		case 2 : 
			switch(user) {
			case 1 : eval = "졌습니다."; break;
			case 2 : eval = "비겼습니다"; break;
			case 3 : eval = "이겼습니다."; break;
			}break;
		case 3 : 
			switch(user) {
			case 1 : eval = "이겼습니다"; break;
			case 2 : eval = "졌습니다."; break;
			case 3 : eval = "비겼습니다."; break;
			}break;
		} System.out.println(eval);

	}

}
