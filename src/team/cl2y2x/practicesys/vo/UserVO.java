package team.cl2y2x.practicesys.vo;

public class UserVO {
	/**  
	 * �û���
	 */
	private String username;
	/**  
	 * ����
	 */
	private String pwd;
	/**
	 * ���
	 */
	private String status;
		
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status=status;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username=username;
	}
	
	public String getPwd() {
		return pwd;
	}	
	
	public void setPwd(String pwd) {
 		this.pwd=pwd;
	}
	
}
