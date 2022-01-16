package team.cl2y2x.practicesys.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import team.cl2y2x.practicesys.dbc.DBC;
import team.cl2y2x.practicesys.factory.DaoFactory;
import team.cl2y2x.practicesys.service.StudyInfoService;
import team.cl2y2x.practicesys.vo.GradeVO;
import team.cl2y2x.practicesys.vo.PaperVO;

public class StudyInfoServiceImpl implements StudyInfoService {
	
	private DBC dbc;
	
	public StudyInfoServiceImpl() throws Exception{
		dbc = new DBC();
	}

	public void getPaper(HttpServletRequest request) throws Exception {
		String cno = request.getParameter("cno");//��ȡ�γ̺�
		List<PaperVO> p = DaoFactory.getPaperDaoInstance(dbc.getConnection()).selectByCnoF(cno);//�����Ծ�
		request.getSession().setAttribute("paperList", p);
	}

	public void getGrade(HttpServletRequest request) throws Exception {
		String pno = request.getParameter("pno");//��ȡ�Ծ���
		String times = request.getParameter("times");
		PaperVO p = new PaperVO();
		p.setPno(pno);
		p.setTimes(Integer.parseInt(times));
		List<GradeVO> gradeList = DaoFactory.getGradeDaoInstance(dbc.getConnection()).selectByPno(p);//������Ŀ
		request.getSession().setAttribute("gradeList", gradeList);
	}

}
