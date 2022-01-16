package team.cl2y2x.practicesys.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import team.cl2y2x.practicesys.dbc.DBC;
import team.cl2y2x.practicesys.factory.DaoFactory;
import team.cl2y2x.practicesys.service.ExerciseService;
import team.cl2y2x.practicesys.vo.ClstcVO;
import team.cl2y2x.practicesys.vo.GradeVO;
import team.cl2y2x.practicesys.vo.MistakeVO;
import team.cl2y2x.practicesys.vo.PaperVO;
import team.cl2y2x.practicesys.vo.QdetailVO;
import team.cl2y2x.practicesys.vo.QqbVO;
import team.cl2y2x.practicesys.vo.StudentVO;

public class ExerciseServiceImpl implements ExerciseService {

	private DBC dbc;
	
	public ExerciseServiceImpl() throws Exception{
		dbc = new DBC();
	}
	
	public void score(HttpServletRequest request) throws Exception {				
		StudentVO s = (StudentVO) request.getSession().getAttribute("student");		
		PaperVO p = (PaperVO) request.getSession().getAttribute("paper");	
		@SuppressWarnings("unchecked")
		List<QqbVO> qList = (List<QqbVO>) request.getSession().getAttribute("questionList");
		int i = 0;
		GradeVO g = new GradeVO();
		while(i < qList.size()) {
			QdetailVO qd = new QdetailVO();
			qd.setQno(qList.get(i).getQno());
			qd.setPno(p.getPno());
			qd.setTimes(p.getTimes());
			String answer = request.getParameter("answer"+qList.get(i).getQno());//获取答案
			if(DaoFactory.getQqbDaoInstance(dbc.getConnection()).selectByQno(qList.get(i).getQno()).getAnswer().equals(answer)) {//查找答案				
				g.setGrade(g.getGrade()+qList.get(i).getScore());				
				qd.setCorrect(qd.getCorrect()+1);				
			} else {
				qd.setWrong(qd.getWrong()+1);				
				MistakeVO m = new MistakeVO();
				m.setQno(qList.get(i).getQno());
				m.setSno(s.getSno());		
				if(DaoFactory.getMistakeDaoInstance(dbc.getConnection()).selectByMistake(m) == null) {
					DaoFactory.getMistakeDaoInstance(dbc.getConnection()).insert(m);
				}
			}
			QdetailVO qdetail = null;
			qdetail = DaoFactory.getQdetailDaoInstance(dbc.getConnection()).selectByQdetail(qd);
			if(qdetail != null) {
				qd.setCorrect(qd.getCorrect()+qdetail.getCorrect());
				qd.setWrong(qd.getWrong()+qdetail.getWrong());
				System.out.print(qd.getCorrect());
				DaoFactory.getQdetailDaoInstance(dbc.getConnection()).update(qd);
			} else {
				DaoFactory.getQdetailDaoInstance(dbc.getConnection()).insert(qd);
			}
			i++;
		}
		g.setPno(p.getPno());
		g.setSno(s.getSno());
		g.setTimes(p.getTimes());
		if(DaoFactory.getGradeDaoInstance(dbc.getConnection()).selectBySpt(g) != null) {
			DaoFactory.getGradeDaoInstance(dbc.getConnection()).update(g);
		} else {
			DaoFactory.getGradeDaoInstance(dbc.getConnection()).insert(g);
		}
		request.getSession().setAttribute("grade", g);
	}
	public void getQuestion(HttpServletRequest request) throws Exception {
		String pno = request.getParameter("pno");//获取试卷编号
		String times = request.getParameter("times");
		PaperVO p = new PaperVO();
		p.setPno(pno);
		p.setTimes(Integer.parseInt(times));
		request.getSession().setAttribute("paper", p);
		List<QqbVO> questionList = DaoFactory.getQqbDaoInstance(dbc.getConnection()).selectByPno(pno);//查找题目
		request.getSession().setAttribute("questionList", questionList);
	}
	
	public void getPaper(HttpServletRequest request) throws Exception {
		String cno = request.getParameter("cno");//获取课程号
		List<PaperVO> p = DaoFactory.getPaperDaoInstance(dbc.getConnection()).selectByCnoF(cno);//查找试卷
		request.getSession().setAttribute("paperList", p);
	}

	public void getCourse(HttpServletRequest request) throws Exception {
		StudentVO s = (StudentVO) request.getSession().getAttribute("student");
		List<ClstcVO> clstc = DaoFactory.getClstcDaoInstance(dbc.getConnection()).selectBySno(s.getSno());//查找课程班级
		request.getSession().setAttribute("clstc", clstc);
	}
	
}
