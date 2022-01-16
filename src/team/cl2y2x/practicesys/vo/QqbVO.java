package team.cl2y2x.practicesys.vo;

import java.io.Serializable;

/**
 * 题库题目信息，包括qbno，qno，stem，option1，option2，option3，option4，answer，score。
 */
public class QqbVO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 题库号
	 */
	private String qbno;
	/**
	 * 题目编号
	 */
	private String qno;
	/**
	 * 分值
	 */
	private int score;
	/**
	 * 题干
	 */
	private String stem;
	/**
	 * 选项一
	 */
	private String option1;
	/**
	 * 选项二
	 */
	private String option2;
	/**
	 * 选项三
	 */
	private String option3;
	/**
	 * 选项四
	 */
	private String option4;
	/**
	 * 正确答案
	 */
	private String answer;
	
	public String getQno() {
		return qno;
	}
	
	public void setQno(String qno) {
		this.qno=qno;
	}
	
	public String getQbno() {
		return qbno;
	}
	
	public void setQbno(String qbno) {
		this.qbno=qbno;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score=score;
	}
	
	public String getStem() {
		return stem;
	}
	
	public void setStem(String stem) {
		this.stem=stem;
	}
	
	public String getOption1() {
		return option1;
	}
	
	public void setOption1(String option1) {
		this.option1=option1;
	}
	
	public String getOption2() {
		return option2;
	}
	
	public void setOption2(String option2) {
		this.option2=option2;
	}
	
	public String getOption3() {
		return option3;
	}
	
	public void setOption3(String option3) {
		this.option3=option3;
	}
	
	public String getOption4() {
		return option4;
	}
	
	public void setOption4(String option4) {
		this.option4=option4;
	}
	
	public String getAnswer() {
		return answer;
	}
	
	public void setAnswer(String answer) {
		this.answer=answer;
	}
	
}
