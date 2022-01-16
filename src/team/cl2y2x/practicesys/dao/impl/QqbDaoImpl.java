package team.cl2y2x.practicesys.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import team.cl2y2x.practicesys.dao.QqbDao;
import team.cl2y2x.practicesys.vo.QqbVO;

public class QqbDaoImpl implements QqbDao {
	
	private Connection conn;
	
	public QqbDaoImpl(Connection conn) {
		this.conn = conn;
	}
	
	public List<QqbVO> selectByKeyword(String keyword) throws Exception {
		String sql="select * from qqb where stem like?";
        PreparedStatement stmt= conn.prepareStatement(sql);// 得到PreparedStatement对象
        stmt.setObject(1, "%"+keyword+"%");
        ResultSet rs=    stmt.executeQuery();// 执行SQL语句
        List<QqbVO> qList = new ArrayList<QqbVO>();
    	while(rs.next()) {
    		QqbVO q = new QqbVO();
    		q.setQbno(rs.getString("qbno"));       
    		q.setQno(rs.getString("qno"));
    		q.setStem(rs.getString("stem")); 
    		q.setOption1(rs.getString("option1"));
    		q.setOption1(rs.getString("option2"));
    		q.setOption1(rs.getString("option3"));
    		q.setOption1(rs.getString("option4"));
    		q.setAnswer(rs.getString("answer"));
    		qList.add(q);
    	}
		return qList;
	}
	
	public List<QqbVO> selectAll() throws Exception {
		String sql="select * from qqb";
        PreparedStatement stmt= conn.prepareStatement(sql);// 得到PreparedStatement对象
       
        ResultSet rs=    stmt.executeQuery();// 执行SQL语句
        List<QqbVO> qList = new ArrayList<QqbVO>();
    	while(rs.next()) {
    		QqbVO q = new QqbVO();
    		q.setQbno(rs.getString("qbno"));       
    		q.setQno(rs.getString("qno"));
    		q.setStem(rs.getString("stem")); 
    		q.setOption1(rs.getString("option1"));
    		q.setOption1(rs.getString("option2"));
    		q.setOption1(rs.getString("option3"));
    		q.setOption1(rs.getString("option4"));
    		q.setAnswer(rs.getString("answer"));
    		qList.add(q);
    	}
		return qList;
	}

	public boolean insert(Object object) throws Exception {
		String sql="insert into qqb(qbno,qno,stem,option1,option2,option3,option4) values (?,?,?,?,?,?,?,?)";
        PreparedStatement stmt= conn.prepareStatement(sql);// 得到PreparedStatement对象
        stmt.setObject(1, ((QqbVO) object).getQbno());// 为预编译sql设置参数
        stmt.setObject(2, ((QqbVO) object).getQno());
        stmt.setObject(3, ((QqbVO) object).getStem());
        stmt.setObject(4, ((QqbVO) object).getOption1());
        stmt.setObject(5, ((QqbVO) object).getOption2());
        stmt.setObject(6, ((QqbVO) object).getOption3());
        stmt.setObject(7, ((QqbVO) object).getOption4());
        stmt.setObject(8, ((QqbVO) object).getAnswer());
        int num=    stmt.executeUpdate();// 执行SQL语句
        if(num > 0) {
        	return true;
        } else {
        	return false;
        }
	}

	public List<QqbVO> selectByPno(String pno) throws Exception {
		String sql="select qbno,qqb.qno,stem,option1,option2,option3,option4,answer,score from pq,qqb where pq.qno=qqb.qno and pq.pno=?";
        PreparedStatement stmt= conn.prepareStatement(sql);// 得到PreparedStatement对象
        stmt.setObject(1, pno);
        ResultSet rs=    stmt.executeQuery();// 执行SQL语句
        List<QqbVO> qList = new ArrayList<QqbVO>();
    	while(rs.next()) {
    		QqbVO q = new QqbVO();
    		q.setQbno(rs.getString("qbno"));       
    		q.setQno(rs.getString("qno"));
    		q.setStem(rs.getString("stem")); 
    		q.setOption1(rs.getString("option1"));
    		q.setOption2(rs.getString("option2"));
    		q.setOption3(rs.getString("option3"));
    		q.setOption4(rs.getString("option4"));
    		q.setAnswer(rs.getString("answer"));
    		q.setScore(rs.getInt("score"));
    		qList.add(q);
    	}
		return qList;
	}

	public QqbVO selectByQno(String qno) throws Exception {
		String sql="select * from qqb where qno=?";
        PreparedStatement stmt= conn.prepareStatement(sql);// 得到PreparedStatement对象
        stmt.setObject(1, qno);
        ResultSet rs=    stmt.executeQuery();// 执行SQL语句
        QqbVO q = null;
    	if(rs.next()) {
    		q = new QqbVO();
    		q.setQbno(rs.getString("qbno"));       
    		q.setQno(rs.getString("qno"));       
    		q.setStem(rs.getString("stem")); 
    		q.setOption1(rs.getString("option1"));
    		q.setOption1(rs.getString("option1"));
    		q.setOption1(rs.getString("option1"));
    		q.setOption1(rs.getString("option1"));
    		q.setAnswer(rs.getString("answer"));
    		q.setScore(rs.getInt("score"));
    	}
		return q;
	}
	
}
