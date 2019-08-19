package homework02;

import java.util.Scanner;

public class Join {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String id = "", password="",name="",birth="",blood="";
		String checkAudlt="";
		double tall=0, weight =0;
		
		System.out.println("아이디를 입력하세요");
		id = scanner.next();
		System.out.println("비밀번호를 입력하세요");
		password=scanner.next();
		System.out.println("이름을 입력하세요");
		name=scanner.next();
		System.out.println("생년월일 입력하세요 ex) 1980-01-01");
		birth = scanner.next();
		
		System.out.println("키");
		tall = scanner.nextDouble();
		System.out.println("몸무게");
		weight = scanner.nextDouble();
		System.out.println("혈액형");
		blood = scanner.next();
		
		System.out.println("=== 회원정보 ===");
		int temp=Integer.parseInt(birth.substring(1,4));
		if(temp<=1999) { checkAudlt = "성년";
		}else { 
			checkAudlt = "미성년";
		}
		System.out.printf("아이디: %s \n 비밀번호:%s \n 이름: %s \n 생년월일: %s \n 성인여부: %s \n 키: %.1f \n 몸무게: %.1f \n 혈액형: %s",id,password,name,birth,checkAudlt,tall,weight,blood);
		

	}

}
