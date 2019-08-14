package homework02;
import java.util.Scanner;
public class TimeCalc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("초를 입력하세요");
		int time = 0;
		time = scanner.nextInt();
		
		System.out.println(time/60/60+"시간 "+time/60%60+"분 "+time%60+"초 입니다");
		
	}

}
