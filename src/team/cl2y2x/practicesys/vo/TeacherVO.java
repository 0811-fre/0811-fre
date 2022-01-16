package team.cl2y2x.practicesys.vo;

import java.io.Serializable;

/**
 * 老师信息，包括status，username，pwd，tno，tname。
 */
public class TeacherVO extends UserVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**  
	 * 老师工号
	 */
	private String tno;
	/**  
	 * 老师姓名
	 */
	private String tname;
	
	public String getTno() {
		return tno;
	}
	
	public void setTno(String tno) {
		this.tno = tno;
	}
	
	public String getTname() {
		return tname;
	}	
	
	public void setTname(String tname) {
		this.tname = tname;
	}
	
}
