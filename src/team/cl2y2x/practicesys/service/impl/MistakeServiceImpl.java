package team.cl2y2x.practicesys.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import team.cl2y2x.practicesys.dbc.DBC;
import team.cl2y2x.practicesys.factory.DaoFactory;
import team.cl2y2x.practicesys.service.MistakeService;
import team.cl2y2x.practicesys.vo.QqbVO;
import team.cl2y2x.practicesys.vo.StudentVO;

public class MistakeServiceImpl implements MistakeService {

	private DBC dbc;
	
	public MistakeServiceImpl() throws Exception{
		dbc = new DBC();
	}
	
	public void getMistake(HttpServletRequest request) {
		StudentVO s = (StudentVO) request.getSession().getAttribute("student");
		try {
			List<QqbVO> mistakeList = DaoFactory.getMistakeDaoInstance(dbc.getConnection()).selectAll(s);
			request.getSession().setAttribute("mistakeList", mistakeList);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

}
