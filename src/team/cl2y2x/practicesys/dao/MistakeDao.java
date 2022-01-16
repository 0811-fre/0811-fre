package team.cl2y2x.practicesys.dao;

import java.util.List;

import team.cl2y2x.practicesys.vo.MistakeVO;
import team.cl2y2x.practicesys.vo.QqbVO;
import team.cl2y2x.practicesys.vo.StudentVO;

public interface MistakeDao {
	/**
     * ��ȡѧ��������Ϣ
     * @param stu StudentVO ѧ��
     * @return List<MistakeVO> �����б�
     * @throws Exception 
     */
	List<QqbVO> selectAll(StudentVO stu) throws Exception;

	MistakeVO selectByMistake(MistakeVO m) throws Exception;

	boolean insert(MistakeVO m) throws Exception;

}
