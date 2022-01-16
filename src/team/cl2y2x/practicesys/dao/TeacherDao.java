package team.cl2y2x.practicesys.dao;

import team.cl2y2x.practicesys.vo.TeacherVO;

public interface TeacherDao {
	/**
     * 查询某个老师信息
     * @param name 老师用户名
     * @return TeacherVO 老师
     */
	TeacherVO selectByName(String name) throws Exception;
    /**
     * 增加老师信息
     * @param student TeacherVO 老师
     * @return boolean 增加是否成功
     */
    boolean insert(TeacherVO teacher) throws Exception;
}
