package team.cl2y2x.practicesys.vo;

import java.io.Serializable;

/**
 * �Ծ�ÿ����Ŀ�������������pno��times��qno��correct��wrong��
 */
public class QdetailVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * ��Ŀ��ȷ��
	 */
	private int correct;
	/**
	 * ��Ŀ������
	 */
	private int wrong;
	/**
	 * �Ծ���ϰ����
	 */
	private int times;
	/**
	 * �Ծ���
	 */
	private String pno;
	/**
	 * ��Ŀ���
	 */
	private String qno;
	
	public int getTimes() {
		return times;
	}
	
	public void setTimes(int times) {
		this.times = times;
	}
	
	public int getCorrect() {
		return correct;
	}
	
	public void setCorrect(int correct) {
		this.correct = correct;
	}
	
	public int getWrong() {
		return wrong;
	}
	
	public void setWrong(int wrong) {
		this.wrong = wrong;
	}
	
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
