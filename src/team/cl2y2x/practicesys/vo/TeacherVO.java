package team.cl2y2x.practicesys.vo;

import java.io.Serializable;

/**
 * ��ʦ��Ϣ������status��username��pwd��tno��tname��
 */
public class TeacherVO extends UserVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**  
	 * ��ʦ����
	 */
	private String tno;
	/**  
	 * ��ʦ����
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
