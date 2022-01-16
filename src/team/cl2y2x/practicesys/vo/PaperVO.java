package team.cl2y2x.practicesys.vo;

import java.io.Serializable;

/**
 * ÊÔ¾íÐÅÏ¢£¬°üÀ¨pno£¬times£¬flag£¬cno¡£
 */
public class PaperVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * ¿Î³ÌºÅ
	 */
	private String cno;
	/**
	 * ÊÔ¾í±àºÅ
	 */
	private String pno;
	/**
	 * ÊÔ¾íÁ·Ï°´ÎÊý
	 */
	private int times;
	/**
	 * ÊÔ¾í×´Ì¬
	 */
	private String flag;
	
	public String getCno() {
		return cno;
	}
	
	public void setCno(String cno) {
		this.cno=cno;
	}
	
	public String getPno() {
		return pno;
	}
	
	public void setPno(String pno) {
		this.pno=pno;
	}
		
	public int getTimes() {
		return times;
	}
	
	public void setTimes(int times) {
		this.times = times;
	}
	
	public String getFlag() {
		return flag;
	}
	
	public void setFlag(String flag) {
		this.flag = flag;
	}
	
}