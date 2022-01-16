package team.cl2y2x.practicesys.dao;

import java.util.List;

import team.cl2y2x.practicesys.vo.PaperVO;
import team.cl2y2x.practicesys.vo.QdetailVO;

public interface QdetailDao {
	/**
     * 查找试卷题目详细信息
     * @param paper 试卷
     * @throws Exception 
     */
	List<QdetailVO> selectByPaper(PaperVO paper) throws Exception;
	/**
     * 增加试卷题目详细信息
     * @param qd 试卷题目
	 * @return 
     * @throws Exception 
     */
	boolean insert(QdetailVO qd) throws Exception;
	
	boolean update(QdetailVO qd) throws Exception;
	
	QdetailVO selectByQdetail(QdetailVO qd) throws Exception;
}
