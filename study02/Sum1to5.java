package study02;

public class Sum1to5 {

	public static void main(String[] args) {
		// 1+2+3+4+5= 
		String eval = " ";
		for(int i=1;i<=5;i++) {
			/**
			if(i==5) {
				result += i+"=";
			}else{
				result += i+"+";
			}
			*/
			eval += (i==5) ? i+"=": i+"+";  // 3항 연산자  // += 누적시켜야 됨 안붙이면 덮어씌우기됨.
			
		// 최종 모양은 이거 하나만 System.out.print((i==5) ? i+"=": i+"+");
		}
		System.out.print(eval);
	}

	
}
