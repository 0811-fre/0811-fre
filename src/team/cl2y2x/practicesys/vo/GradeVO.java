package team.cl2y2x.practicesys.vo;

/**
 * ѧ���Ծ������Ϣ������grade��times��pno��sno��
 */
public class GradeVO {
	/**
	 * �Ծ����
	 */
	private int grade;
	/**
	 * �Ծ���ϰ����
	 */
	private int times;
	/**  
	 * ѧ��ѧ��
	 */
	private String sno;
	/**
	 * �Ծ���
	 */
	private String pno;
	
	public int getTimes() {
		return times;
	}
	
	public void setTimes(int times) {
		this.times = times;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public void setGrade(int grade) {
		this.grade=grade;
	}
	
	public String getSno() {
		return sno;
	}
	
	public void setSno(String sno) {
		this.sno=sno;
	}
	
	public String getPno() {
		return pno;
	}
	
	public void setPno(String pno) {
		this.pno=pno;
	}
	
}
