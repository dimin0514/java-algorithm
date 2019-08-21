package homework04_grade;

import javax.swing.JOptionPane;

public class GradeController {

	public static void main(String[] args) {
		Grade grade = null;
		GradeService greadeService = new GradeService();

		while(true) {
			
			switch(JOptionPane.showInputDialog("0.종료  1.점수입력  2.총점  3.평균")) {
			case "0":System.out.println("종료"); return;
			case "1": 
				grade= new Grade();
				String kor=JOptionPane.showInputDialog("국어");
				grade.setKor(Integer.parseInt(kor));
				String eng=JOptionPane.showInputDialog("영어");
				grade.setKor(Integer.parseInt(eng));
				String math=JOptionPane.showInputDialog("수학");
				grade.setMath(Integer.parseInt(math));

			
			break;
			case "2":
				JOptionPane.showMessageDialog(null, greadeService.getTotal(grade));
				break;
				
			case "3":
				JOptionPane.showMessageDialog(null, greadeService.getAvg(grade));
			
			break;
			
			}
		}
		
	}

}
