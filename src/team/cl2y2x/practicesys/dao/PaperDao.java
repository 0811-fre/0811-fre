package team.cl2y2x.practicesys.dao;

import java.util.List;

import team.cl2y2x.practicesys.vo.PaperVO;

public interface PaperDao {
	/**
     * 获取课程试卷信息
     * @param cno 课程号
     * @return List<PaperVO> 试卷列表
     * @throws Exception 
     */
	List<PaperVO> selectByCno(String cno) throws Exception;
	/**
     * 获取试卷信息
     * @param cno 课程号
     * @throws Exception 
     */
	List<PaperVO> selectByCnoF(String cno) throws Exception;
	/**
     * 增加试卷信息
     * @param p 试卷
     * @throws Exception 
     */
	boolean insert(PaperVO p) throws Exception;
	
	boolean delete(PaperVO p) throws Exception;
}
