package team.cl2y2x.practicesys.dao;

import java.util.List;

import team.cl2y2x.practicesys.vo.MistakeVO;
import team.cl2y2x.practicesys.vo.QqbVO;
import team.cl2y2x.practicesys.vo.StudentVO;

public interface MistakeDao {
	/**
     * 获取学生错题信息
     * @param stu StudentVO 学生
     * @return List<MistakeVO> 错题列表
     * @throws Exception 
     */
	List<QqbVO> selectAll(StudentVO stu) throws Exception;

	MistakeVO selectByMistake(MistakeVO m) throws Exception;

	boolean insert(MistakeVO m) throws Exception;

}
