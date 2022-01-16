package team.cl2y2x.practicesys.vo;

import java.io.Serializable;

/**
 * 学生信息，包括status，username，pwd，sno，sname。
 */
public class StudentVO extends UserVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**  
	 * 学生学号
	 */
	private String sno;
	/**  
	 * 学生姓名
	 */
	private String sname;
	
	public String getSno() {
		return sno;
	}
	
	public void setSno(String sno) {
		this.sno=sno;
	}
	
	public String getSname() {
		return sname;
	}
	
	public void setSname(String sname) {
		this.sname=sname;
	}
	
}