package team.cl2y2x.practicesys.dao;

import java.util.List;

import team.cl2y2x.practicesys.vo.QqbVO;

public interface QqbDao {
	/**
     * ��ѯ�Ծ���Ŀ
     * @param pno �Ծ���
     * @return ListList<QqbVO> ��Ŀ�б�
	 * @throws Exception 
     */
	List<QqbVO> selectByPno(String pno) throws Exception;
	/**
     * ��ѯ��Ŀ
     * @param qno ��Ŀ���
     * @return QqbVO ��Ŀ
     */
	QqbVO selectByQno(String qno) throws Exception;;
	/**
     * ��ѯ��Ŀ
     * @param keyword ��Ŀ�ؼ���
     * @return ListList<QqbVO> ��Ŀ�б�
	 * @throws Exception 
     */
	List<QqbVO> selectByKeyword(String keyword) throws Exception;
	
	List<QqbVO> selectAll() throws Exception;
	
}
