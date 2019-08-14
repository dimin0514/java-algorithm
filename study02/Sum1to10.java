package study02;

public class Sum1to10 {

	public static void main(String[] args) {
		// 1+2+3+4+5... 10 = 
		String result = ""; // eval 값은 꼭 넣어줘야함.
		int sum = 0;
		for(int i=1;i<=10;i++) {
			if(i==10) {
				result += i+"=";   //+= 누적해라 명령 
 			}else{
				result += i+"+";   //+= 누적해라 명령
			}
			sum += i;

		}
		System.out.print(result +sum); //for문 바깥에서 얻으려는 문장이 나와야함

	}

}
