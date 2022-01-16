package team.cl2y2x.practicesys.vo;

import java.io.Serializable;

/**
 * 试卷每道题目答题情况，包括pno，times，qno，correct，wrong。
 */
public class QdetailVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 题目正确数
	 */
	private int correct;
	/**
	 * 题目错误数
	 */
	private int wrong;
	/**
	 * 试卷练习次数
	 */
	private int times;
	/**
	 * 试卷编号
	 */
	private String pno;
	/**
	 * 题目编号
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
