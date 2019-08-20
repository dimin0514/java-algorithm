package study04;

public class Student {

	public String daechul(String name,String addr,int age,int money, String shin) {
		return "1억대출";
		
	}

	public String getBmi(String name,double weight,double height) {
		double bmi = weight/(height*height);
		String eval = "";
		
		if(bmi > 30.0) {
			eval="고도비만";
		}else if(bmi > 25.0) {
			eval="비만";
		}else if(bmi > 23.0) {
			eval="고도비만";
		}else if(bmi > 18.5) {
			eval="정상";
		} else {
			eval="저체중";
		}
		String result = String.format("%s님은  bmi는 %.1f %s 입니다", name, bmi, eval);
		return result;
	

	}

}
