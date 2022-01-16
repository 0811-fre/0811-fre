package team.cl2y2x.practicesys.dao;

import java.util.List;

import team.cl2y2x.practicesys.vo.QqbVO;

public interface QqbDao {
	/**
     * 查询试卷题目
     * @param pno 试卷编号
     * @return ListList<QqbVO> 题目列表
	 * @throws Exception 
     */
	List<QqbVO> selectByPno(String pno) throws Exception;
	/**
     * 查询题目
     * @param qno 题目编号
     * @return QqbVO 题目
     */
	QqbVO selectByQno(String qno) throws Exception;;
	/**
     * 查询题目
     * @param keyword 题目关键字
     * @return ListList<QqbVO> 题目列表
	 * @throws Exception 
     */
	List<QqbVO> selectByKeyword(String keyword) throws Exception;
	
	List<QqbVO> selectAll() throws Exception;
	
}
