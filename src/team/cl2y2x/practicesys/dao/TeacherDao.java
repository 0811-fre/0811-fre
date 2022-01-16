package team.cl2y2x.practicesys.dao;

import team.cl2y2x.practicesys.vo.TeacherVO;

public interface TeacherDao {
	/**
     * ��ѯĳ����ʦ��Ϣ
     * @param name ��ʦ�û���
     * @return TeacherVO ��ʦ
     */
	TeacherVO selectByName(String name) throws Exception;
    /**
     * ������ʦ��Ϣ
     * @param student TeacherVO ��ʦ
     * @return boolean �����Ƿ�ɹ�
     */
    boolean insert(TeacherVO teacher) throws Exception;
}
