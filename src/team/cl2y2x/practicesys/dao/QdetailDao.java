package team.cl2y2x.practicesys.dao;

import java.util.List;

import team.cl2y2x.practicesys.vo.PaperVO;
import team.cl2y2x.practicesys.vo.QdetailVO;

public interface QdetailDao {
	/**
     * �����Ծ���Ŀ��ϸ��Ϣ
     * @param paper �Ծ�
     * @throws Exception 
     */
	List<QdetailVO> selectByPaper(PaperVO paper) throws Exception;
	/**
     * �����Ծ���Ŀ��ϸ��Ϣ
     * @param qd �Ծ���Ŀ
	 * @return 
     * @throws Exception 
     */
	boolean insert(QdetailVO qd) throws Exception;
	
	boolean update(QdetailVO qd) throws Exception;
	
	QdetailVO selectByQdetail(QdetailVO qd) throws Exception;
}
