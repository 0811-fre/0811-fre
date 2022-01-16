package team.cl2y2x.practicesys.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import team.cl2y2x.practicesys.dbc.DBC;
import team.cl2y2x.practicesys.factory.DaoFactory;
import team.cl2y2x.practicesys.service.MergeService;
import team.cl2y2x.practicesys.vo.ClstcVO;
import team.cl2y2x.practicesys.vo.PaperVO;
import team.cl2y2x.practicesys.vo.PqVO;
import team.cl2y2x.practicesys.vo.QqbVO;

public class MergeServiceImpl implements MergeService {

	private DBC dbc;
	
	public MergeServiceImpl() throws Exception{
		dbc = new DBC();
	}
	
	public void createPaper(HttpServletRequest request) throws Exception {
		ClstcVO clstc = (ClstcVO) request.getSession().getAttribute("clstc");
		String pno = request.getParameter("pno");
		PaperVO p = new PaperVO();
		p.setCno(clstc.getCno());
		p.setPno(pno);
		p.setTimes(0);
		p.setFlag("NOK");
		List<QqbVO> questionList = DaoFactory.getQqbDaoInstance(dbc.getConnection()).selectAll();//查找题目
		request.getSession().setAttribute("questionList", questionList);
		DaoFactory.getPaperDaoInstance(dbc.getConnection()).insert(p);//创建试卷
		request.getSession().setAttribute("paper", p);
		
	}
	
	public void choose(HttpServletRequest request) throws Exception {
		String[] qno = request.getParameterValues("qno");
		PaperVO p = (PaperVO) request.getSession().getAttribute("paper");
		String pno = p.getPno();System.out.printf(qno[0]);
		for(int i = 0;i < qno.length;i++) {
			PqVO pq = new PqVO();
			pq.setPno(pno);
			pq.setQno(qno[i]);
			DaoFactory.getPqDaoInstance(dbc.getConnection()).insert(pq);//选择题目
		}			
	}

	public void remove(HttpServletRequest request) throws Exception {
		String pno = request.getParameter("pno");
		PaperVO p = new PaperVO();
		p.setPno(pno);
		DaoFactory.getPaperDaoInstance(dbc.getConnection()).delete(p);
	}

}
