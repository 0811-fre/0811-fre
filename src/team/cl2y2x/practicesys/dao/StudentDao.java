package team.cl2y2x.practicesys.dao;

import team.cl2y2x.practicesys.vo.StudentVO;

public interface StudentDao {
	/**
     * 查询某个学生信息
     * @param name 学生用户名
     * @return StudentVO 学生
     */
	StudentVO selectByName(String name) throws Exception;
    /**
     * 增加学生信息
     * @param student StudentVO 学生
     * @return boolean 增加是否成功
     */
    boolean insert(StudentVO student) throws Exception;
}
