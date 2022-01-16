package team.cl2y2x.practicesys.vo;

/**
 * 课程信息，包括cno，cname。
 */
public class CourseVO {
	/**
	 * 课程号
	 */
	private String cno;
	/**
	 * 课程名
	 */
	private String cname;
	
	public String getCno() {
		return cno;
	}
	
	public void setCno(String cno) {
		this.cno=cno;
	}
	
	public String getCname() {
		return cname;
	}
	
	public void setCname(String cname) {
		this.cname=cname;
	}
	
}
