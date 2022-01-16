package team.cl2y2x.practicesys.service.impl;

import javax.servlet.http.HttpServletRequest;

import team.cl2y2x.practicesys.dbc.DBC;
import team.cl2y2x.practicesys.factory.DaoFactory;
import team.cl2y2x.practicesys.service.LoginService;
import team.cl2y2x.practicesys.vo.ClstcVO;
import team.cl2y2x.practicesys.vo.StudentVO;
import team.cl2y2x.practicesys.vo.TeacherVO;
import team.cl2y2x.practicesys.vo.UserVO;

public class LoginServiceImpl implements LoginService {
	
	private DBC dbc;
	
	public LoginServiceImpl() throws Exception{
		dbc = new DBC();
	}
	
	public boolean register(HttpServletRequest request) throws Exception {
		String username = request.getParameter("username");//��ȡ����
		String pwd = request.getParameter("pwd");
		String status = request.getParameter("status");
		if(status.equals("student")) {//ѧ��ע��
			String sno = request.getParameter("no");System.out.print(status);
			String sname = request.getParameter("name");
			StudentVO u = new StudentVO();
			u.setStatus(status);
    		u.setUsername(username);
    		u.setPwd(pwd);
    		u.setSno(sno);
    		u.setSname(sname);
    		if(DaoFactory.getStudentDaoInstance(dbc.getConnection()).selectByName(username) == null) {//����Ƿ��Ѵ����û�
    			DaoFactory.getStudentDaoInstance(dbc.getConnection()).insert(u);
    			return true;
    		}
		} else if (status.equals("teacher")) {//��ʦע��
			String tno = request.getParameter("no");
			String tname = request.getParameter("name");
			TeacherVO u = new TeacherVO();
			u.setStatus(status);
    		u.setUsername(username);
    		u.setPwd(pwd);
    		u.setTno(tno);
    		u.setTname(tname);
    		if(DaoFactory.getTeacherDaoInstance(dbc.getConnection()).selectByName(username) == null) {//����Ƿ��Ѵ����û�
    			DaoFactory.getTeacherDaoInstance(dbc.getConnection()).insert(u);
    			return true;
    		}
		}
		return false;
	}

	public boolean validate(HttpServletRequest request) throws Exception {
		String username = request.getParameter("username");//��ȡ����
		String pwd = request.getParameter("pwd");
		String status = request.getParameter("status");
		if(status.equals("student")) {//ѧ����֤
			try {
				StudentVO u = new StudentVO();
				u = DaoFactory.getStudentDaoInstance(dbc.getConnection()).selectByName(username);//��֤
				if(u != null && u.getPwd().equals(pwd)) {
					request.getSession().setAttribute("student", u);
					return true;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (status.equals("teacher")) {//��ʦ��֤
			try {
				TeacherVO u = new TeacherVO();
				u = DaoFactory.getTeacherDaoInstance(dbc.getConnection()).selectByName(username);//��֤
				if(u != null && u.getPwd().equals(pwd)) {
					ClstcVO c = new ClstcVO();
					c = DaoFactory.getClstcDaoInstance(dbc.getConnection()).selectByTno(u.getTno());
					request.getSession().setAttribute("clstc", c);//���͵�session
					request.getSession().setAttribute("teacher", u);
					return true;
				}
				} catch (Exception e) {
					e.printStackTrace();
				}
		} else if (status.equals("admin")) {//����Ա��֤
			UserVO u = new UserVO();
			if("admin".equals(username) && "123456".equals(pwd)) {
				u.setUsername("admin");
				u.setPwd("123456");
				u.setStatus("admin");
				request.getSession().setAttribute("admin", u);//���͵�session
				return true;
			}
		}
		return false;
	}

	public boolean isValidate(HttpServletRequest request) throws Exception {
		if(request.getSession().getAttribute("student") != null || request.getSession().getAttribute("admin") != null || request.getSession().getAttribute("teacher") != null) {
			return true;
		} else {
			return false;
		}		 	
	}
	
}
