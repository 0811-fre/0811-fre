package team.cl2y2x.practicesys.vo;

/**
 * 学生试卷分数信息，包括grade，times，pno，sno。
 */
public class GradeVO {
	/**
	 * 试卷分数
	 */
	private int grade;
	/**
	 * 试卷练习次数
	 */
	private int times;
	/**  
	 * 学生学号
	 */
	private String sno;
	/**
	 * 试卷编号
	 */
	private String pno;
	
	public int getTimes() {
		return times;
	}
	
	public void setTimes(int times) {
		this.times = times;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public void setGrade(int grade) {
		this.grade=grade;
	}
	
	public String getSno() {
		return sno;
	}
	
	public void setSno(String sno) {
		this.sno=sno;
	}
	
	public String getPno() {
		return pno;
	}
	
	public void setPno(String pno) {
		this.pno=pno;
	}
	
}
