package team.cl2y2x.practicesys.service;

import javax.servlet.http.HttpServletRequest;

public interface StudyInfoService {

	void getPaper(HttpServletRequest request) throws Exception;

	void getGrade(HttpServletRequest request) throws Exception;

}
