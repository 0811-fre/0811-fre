package team.cl2y2x.practicesys.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import team.cl2y2x.practicesys.dao.StudentDao;
import team.cl2y2x.practicesys.vo.StudentVO;

public class StudentDaoImpl implements StudentDao{
	
	private Connection conn;
	
	public StudentDaoImpl(Connection conn) {
		this.conn = conn;
	}
	
	public StudentVO selectByName(String username) throws Exception {
		String sql="select * from student where username=?";
        PreparedStatement stmt= conn.prepareStatement(sql);// �õ�PreparedStatement����
        stmt.setObject(1, username);// ΪԤ����sql���ò���
        ResultSet rs=    stmt.executeQuery();// ִ��SQL���
        StudentVO user = null;
    	if(rs.next()) {
    		user = new StudentVO();
    		user.setStatus(rs.getString("status"));
    		user.setUsername(rs.getString("username")); 
    		user.setPwd(rs.getString("pwd"));
    		user.setSno(rs.getString("sno"));
    		user.setSname(rs.getString("sname")); 
    	}
		return user;
	}

	public boolean insert(StudentVO student) throws Exception {
		String sql="insert into student(sno,sname,username,pwd,status) values (?,?,?,?,?)";
        PreparedStatement stmt= conn.prepareStatement(sql);// �õ�PreparedStatement����
        stmt.setObject(1, student.getSno());// ΪԤ����sql���ò���
        stmt.setObject(2, student.getSname());
        stmt.setObject(3, student.getUsername());
        stmt.setObject(4, student.getPwd());
        stmt.setObject(5, student.getStatus());
        int num=    stmt.executeUpdate();// ִ��SQL���
        if(num > 0) {
        	return true;
        } else {
        	return false;
        }
	}
	
}
