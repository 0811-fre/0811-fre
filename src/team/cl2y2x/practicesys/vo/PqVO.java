package team.cl2y2x.practicesys.vo;

/**
 * 试卷题目信息，包括pno，qno。
 */
public class PqVO {
	/**
	 * 题目编号
	 */
	private String qno;
	/**
	 * 试卷编号
	 */
	private String pno;
	
	public String getQno() {
		return qno;
	}
	
	public void setQno(String qno) {
		this.qno=qno;
	}
	
	public String getPno() {
		return pno;
	}
	
	public void setPno(String pno) {
		this.pno=pno;
	}
	
}
