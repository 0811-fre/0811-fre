package team.cl2y2x.practicesys.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import team.cl2y2x.practicesys.dao.TeacherDao;
import team.cl2y2x.practicesys.vo.TeacherVO;

public class TeacherDaoImpl implements TeacherDao {
	
	private Connection conn;
	
	public TeacherDaoImpl(Connection conn) {
		this.conn = conn;
	}
	
	public TeacherVO selectByName(String name) throws Exception {
		String sql="select * from teacher where username = ?";
        PreparedStatement stmt= conn.prepareStatement(sql);// 得到PreparedStatement对象
        stmt.setObject(1, name);// 为预编译sql设置参数
        ResultSet rs=    stmt.executeQuery();// 执行SQL语句
        TeacherVO user = null;
    	if(rs.next()) {
    		user = new TeacherVO();
    		user.setStatus(rs.getString("status"));       
    		user.setUsername(rs.getString("username"));       
    		user.setPwd(rs.getString("pwd")); 
    		user.setTno(rs.getString("tno"));       
    		user.setTname(rs.getString("tname")); 
    	}
		return user;
	}

	public boolean insert(TeacherVO teacher) throws Exception {
		String sql="insert into teacher(tno,tname,username,pwd,status) values (?,?,?,?,?)";
        PreparedStatement stmt= conn.prepareStatement(sql);// 得到PreparedStatement对象
        stmt.setObject(1, teacher.getTno());// 为预编译sql设置参数
        stmt.setObject(2, teacher.getTname());
        stmt.setObject(3, teacher.getUsername());
        stmt.setObject(4, teacher.getPwd());
        stmt.setObject(5, teacher.getStatus());
        int num=    stmt.executeUpdate();// 执行SQL语句
        if(num > 0) {
        	return true;
        } else {
        	return false;
        }
	}
	
}

