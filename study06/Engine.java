package study06;
import javax.swing.JOptionPane;

import practics.Member;
import practics.Service;

public class Engine {

	public static void main(String[] args) {
		Member member = null;
		Service service = new Service();

		while(true) {
			
			switch(JOptionPane.showInputDialog("0.종료 1.Join 2.마이페이지 3.Bmi 4.ReportCard 5.Tax")) {
			case "0":System.out.println("종료"); return;
			case "1": 
				member= new Member();

				member.setId(JOptionPane.showInputDialog("ID입력"));
				member.setPassword(JOptionPane.showInputDialog("비번입력"));
				String tall=JOptionPane.showInputDialog("키 입력");
                member.setTall(Double.parseDouble(tall));
			
			break;
			case "2":
				JOptionPane.showMessageDialog(null, "2.마이페이지\n"+member.toString());
				break;
				
			case "3":
				
			case "4":
			System.out.println("bmi 프로그램");
			
			
				
	
				
				
				break;
			
			
			}
		}
		
	}

}
