package team.cl2y2x.practicesys.dao;

import java.util.List;

import team.cl2y2x.practicesys.vo.PaperVO;

public interface PaperDao {
	/**
     * ��ȡ�γ��Ծ���Ϣ
     * @param cno �γ̺�
     * @return List<PaperVO> �Ծ��б�
     * @throws Exception 
     */
	List<PaperVO> selectByCno(String cno) throws Exception;
	/**
     * ��ȡ�Ծ���Ϣ
     * @param cno �γ̺�
     * @throws Exception 
     */
	List<PaperVO> selectByCnoF(String cno) throws Exception;
	/**
     * �����Ծ���Ϣ
     * @param p �Ծ�
     * @throws Exception 
     */
	boolean insert(PaperVO p) throws Exception;
	
	boolean delete(PaperVO p) throws Exception;
}
