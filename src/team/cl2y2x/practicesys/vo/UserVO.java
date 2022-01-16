package team.cl2y2x.practicesys.vo;

public class UserVO {
	/**  
	 * 用户名
	 */
	private String username;
	/**  
	 * 密码
	 */
	private String pwd;
	/**
	 * 身份
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
