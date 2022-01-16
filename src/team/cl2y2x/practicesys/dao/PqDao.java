package team.cl2y2x.practicesys.dao;

import team.cl2y2x.practicesys.vo.PqVO;

public interface PqDao {
	/**
     * 增加试卷题目信息
     * @param pq 试卷题目
     * @throws Exception 
     */
	boolean insert(PqVO pq) throws Exception;

}
