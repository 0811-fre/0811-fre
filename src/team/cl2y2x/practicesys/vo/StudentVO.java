package team.cl2y2x.practicesys.vo;

import java.io.Serializable;

/**
 * ѧ����Ϣ������status��username��pwd��sno��sname��
 */
public class StudentVO extends UserVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**  
	 * ѧ��ѧ��
	 */
	private String sno;
	/**  
	 * ѧ������
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