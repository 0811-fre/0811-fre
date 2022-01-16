package team.cl2y2x.practicesys.vo;

/**
 * 课程题库信息，包括qbno，cno。
 */
public class CqbVO {
	/**
	 * 课程号
	 */
	private String cno;
	/**
	 * 题库号（章节号）
	 */
	private String qbno;
	
	public String getCno() {
		return cno;
	}
	
	public void setCno(String cno) {
		this.cno=cno;
	}
	
	public String getQbno() {
		return qbno;
	}
	
	public void setQbno(String qbno) {
		this.qbno=qbno;
	}
	
}
