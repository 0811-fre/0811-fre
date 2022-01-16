package team.cl2y2x.practicesys.vo;

/**
 * 错题库信息，包括sno，qno。
 */
public class MistakeVO {
	/**
	 * 题目编号
	 */
	private String qno;
	/**
	 * 学生学号
	 */
	private String sno;
	
	public String getQno() {
		return qno;
	}
	
	public void setQno(String qno) {
		this.qno=qno;
	}
	
	public String getSno() {
		return sno;
	}
	
	public void setSno(String sno) {
		this.sno=sno;
	}
	
}
