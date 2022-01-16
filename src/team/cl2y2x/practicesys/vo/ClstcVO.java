package team.cl2y2x.practicesys.vo;

import java.io.Serializable;

/**
 * 课程班级信息，包括cno，sno，tno，clano。
 */
public class ClstcVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 课程号
	 */
	private String cno;
	/**  
	 * 学生学号
	 */
	private String sno;
	/**  
	 * 老师工号
	 */
	private String tno;
	/**  
	 * 课程班级编号
	 */
	private String clno;
	
	public String getSno() {
		return sno;
	}
	
	public void setSno(String sno) {
		this.sno=sno;
	}
	
	public String getTno() {
		return tno;
	}
	
	public void setTno(String tno) {
		this.tno = tno;
	}
	public String getCno() {
		return cno;
	}
	
	public void setCno(String cno) {
		this.cno=cno;
	}
	
	public String getClno() {
		return clno;
	}
	
	public void setClno(String clno) {
		this.clno=clno;
	}
	
}
