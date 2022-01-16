package team.cl2y2x.practicesys.dao;

import team.cl2y2x.practicesys.vo.StudentVO;

public interface StudentDao {
	/**
     * ��ѯĳ��ѧ����Ϣ
     * @param name ѧ���û���
     * @return StudentVO ѧ��
     */
	StudentVO selectByName(String name) throws Exception;
    /**
     * ����ѧ����Ϣ
     * @param student StudentVO ѧ��
     * @return boolean �����Ƿ�ɹ�
     */
    boolean insert(StudentVO student) throws Exception;
}
