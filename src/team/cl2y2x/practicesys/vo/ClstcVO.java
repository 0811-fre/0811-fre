package team.cl2y2x.practicesys.vo;

import java.io.Serializable;

/**
 * �γ̰༶��Ϣ������cno��sno��tno��clano��
 */
public class ClstcVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * �γ̺�
	 */
	private String cno;
	/**  
	 * ѧ��ѧ��
	 */
	private String sno;
	/**  
	 * ��ʦ����
	 */
	private String tno;
	/**  
	 * �γ̰༶���
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
