package homework02;
import java.util.Scanner;
public class ArithmeticCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("사칙 연산 프로그램");
		int choice=0;
		int a=0;
		int b=0;

		System.out.println("사칙연산을 선택하세요");
		System.out.println("1.+ 2.- 3.* 4./");
		choice = scanner.nextInt();
		System.out.println("첫번째 수를 입력하세요");
		a = scanner.nextInt();
		System.out.println("두번째 수를 입력하세요");
		b = scanner.nextInt();
		String result ="";
		switch(choice) {
		case 1 : result = String.format("%d + %d = ",a,b)+Integer.toString(a+b) ; break;
		case 2 : result = String.format("%d - %d = ",a,b)+Integer.toString(a-b) ; break;
		case 3 : result = String.format("%d * %d = ",a,b)+Integer.toString(a*b) ; break;
		case 4 : result = String.format("%d / %d = ",a,b)+Integer.toString(a/b)+"["+Integer.toString(a%b)+"]" ; break;
		}
		System.out.println(result);

	}

}
