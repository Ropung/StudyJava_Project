package net.kdigital.score.vo;

public class StudentVo {
	private int stdid;
	private String stdname;
	private double it;
	private double language;
	private double basic;
	private double avg;
	private String grade;

	public StudentVo(int stdid, String stdname, double it, double language, double basic) {
		this.stdid = stdid;
		this.stdname = stdname;
		this.it = it;
		this.language = language;
		this.basic = basic;
		avgCalc();
	}

	private void avgCalc() {

		double itScore = it * 40.0 / 100.0;
//		System.out.println(it);
//		System.out.println(itScore);

		double languageScore = language * 30.0 / 100.0;
//		System.out.println(language);
//		System.out.println(languageScore);

		double basicScore = basic * 30.0 / 100.0;
//		System.out.println(basic);
//		System.out.println(basicScore);

		double totalScore = itScore + languageScore + basicScore;
//		System.out.println(totalScore);

		avg = totalScore;

		if (totalScore >= 90) {
			grade = "1등급";
		} else if (totalScore >= 80) {
			grade = "2등급";
		} else if (totalScore >= 70) {
			grade = "3등급";
		} else if (totalScore >= 60) {
			grade = "4등급";
		} else {
			grade = "5등급";
		}

	}

	public int getStdid() {
		return stdid;
	}

	public void setStdid(int stdid) {
		this.stdid = stdid;
	}

	public String getStdname() {
		return stdname;
	}

	public void setStdname(String stdname) {
		this.stdname = stdname;
	}

	public double getIt() {
		return it;
	}

	public void setIt(double it) {
		this.it = it;
		avgCalc();
	}

	public double getLanguage() {
		return language;
	}

	public void setLanguage(double language) {
		this.language = language;
		avgCalc();
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
		avgCalc();
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		String temp = String.format("%2d번 %s : %6.2f %6.2f %6.2f %6.2f %5s", stdid, stdname, it, language, basic, avg,
				grade);
		return temp;
	}
}