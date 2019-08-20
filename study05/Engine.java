package study05;
import java.util.Scanner;
public class Engine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Member member = null;
		Service service = new Service();
		
		while(true) {
			System.out.println("0.종료 1.회원가입 2 정보보기 3.아이디찾기 4.BMI 5.ReportCard 6.Tax");
			
			switch(scanner.nextInt()){
			case 0: System.out.println("종료"); return;
			case 1:
				member = new Member();
				
				System.out.println("아이디를 입력하세요");
				member.setId(scanner.next());
				System.out.println("비밀번호를 입력하세요");
				member.setPassword(scanner.next());
				System.out.println("이름을 입력하세요");
				member.setName(scanner.next());
				System.out.println("주민번호");
				member.setSsn(scanner.next());
				System.out.println("키");
				member.setTall(scanner.nextDouble());
				System.out.println("몸무게");
				member.setWeight(scanner.nextDouble());
				System.out.println("혈액형");
				member.setBlood(scanner.next());
				System.out.println("국어점수");
				member.setKor(scanner.nextInt());
				System.out.println("수학점수");
				member.setMath(scanner.nextInt());
				System.out.println("영어점수");
				member.setEng(scanner.nextInt());
				System.out.println("연봉");
				member.setSalary(scanner.nextInt());
				break;
			case 2:
				System.out.println(member.toString());
				break;
				
			case 3:
				System.out.println("아이디,이름을 입력하면 비번을 알려줌");
				String searchName = scanner.next(); 
				String searchId = scanner.next();
				if(searchName.equals("a") &&
						searchId.equals("a")) {
					System.out.printf("찾는 아이디 : %s \n"
							+ "주민번호: %s \n",member.getId(), member.getSsn());
				}else {
					System.out.println("찾는 아이디가 없습니다.");
				}
				
			case 4:
				System.out.println("Bmi 구하기");
				System.out.println(service.getBmi(member)); 
				
				
				
				break;
				
			case 5:
				System.out.println("ReportCard");
				System.out.println(service.getReportCard(member));
				
				break;
				
			case 6:
				System.out.println("Tax");
				System.out.println(service.getTax(member));
				break;
			
			}
			
		}
	}

}
