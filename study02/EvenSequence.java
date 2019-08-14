package study02;
import java.util.Scanner;
public class EvenSequence {
	// 1 + 3 + 5 + 7 + 9 = ?
	//i % 2 = 0 이면 짝수. 1이면 홀수
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String sequence="";
		int series=0;
		System.out.println("시작값을 입력하세요");
		int start = scan.nextInt();
		System.out.println("끝값");
		int end = scan.nextInt();
		for(int i=start;i<=end;i++) {
			if(i%2==0) {
				if(i != end){
				sequence += i+"+";
				}else{
				sequence += i+"=";
				}
				series += i;
			}
		}
		System.out.println(sequence+series);

	}

}
