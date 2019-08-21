package homework04_grade;

public class GradeService {
	public String getTotal(Grade grade) {
		String total = "";
		int kor = grade.getKor();
		int eng = grade.getEng();
		int math = grade.getMath();
		
		int sum = kor+eng+math;
		total = String.format("총점은 %d 입니다", sum);
		return total;
	}
	public String getAvg(Grade grade) {
		String avg = "";
		int kor = grade.getKor();
		int eng = grade.getEng();
		int math = grade.getMath();
		
		int temp= kor+eng+math/3;
		avg = String.format("평균은  %d점 입니다", temp);
		return avg;
	}
}