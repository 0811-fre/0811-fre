package team.cl2y2x.practicesys.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import team.cl2y2x.practicesys.dbc.DBC;
import team.cl2y2x.practicesys.factory.DaoFactory;
import team.cl2y2x.practicesys.service.DetailService;
import team.cl2y2x.practicesys.vo.ClstcVO;
import team.cl2y2x.practicesys.vo.PaperVO;
import team.cl2y2x.practicesys.vo.QdetailVO;

public class DetailServiceImpl implements DetailService {
	
	private DBC dbc;
	
	public DetailServiceImpl() throws Exception{
		dbc = new DBC();
	}

	public void getQdetail(HttpServletRequest request) throws Exception {		
		String pno = request.getParameter("pno");
		String times = request.getParameter("times");		
		PaperVO p = new PaperVO();
		p.setPno(pno);
		p.setTimes(Integer.parseInt(times));		
		List<QdetailVO> qd = new ArrayList<QdetailVO>();		
		try {
			qd = DaoFactory.getQdetailDaoInstance(dbc.getConnection()).selectByPaper(p);
			request.getSession().setAttribute("qdetail", qd);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void getPaper(HttpServletRequest request) throws Exception {
		ClstcVO clstc = (ClstcVO) request.getSession().getAttribute("clstc");//获取课程号
		List<PaperVO> pList = DaoFactory.getPaperDaoInstance(dbc.getConnection()).selectByCno(clstc.getCno());//查找试卷
		request.getSession().setAttribute("paperList", pList);
	}

}
