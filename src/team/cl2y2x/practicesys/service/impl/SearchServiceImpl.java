package team.cl2y2x.practicesys.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import team.cl2y2x.practicesys.dbc.DBC;
import team.cl2y2x.practicesys.factory.DaoFactory;
import team.cl2y2x.practicesys.service.SearchService;
import team.cl2y2x.practicesys.vo.QqbVO;

public class SearchServiceImpl implements SearchService {
	private DBC dbc;
	
	public SearchServiceImpl() throws Exception{
		dbc = new DBC();
	}
	
	public void search(HttpServletRequest request) {
		String keyword = request.getParameter("keyword");
		try {
			List<QqbVO> qList = DaoFactory.getQqbDaoInstance(dbc.getConnection()).selectByKeyword(keyword);
			request.getSession().setAttribute("questions", qList);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
}
