package team.cl2y2x.practicesys.service;

import javax.servlet.http.HttpServletRequest;

public interface MergeService {

	void createPaper(HttpServletRequest request) throws Exception;

	void choose(HttpServletRequest request) throws Exception;
	
	void remove(HttpServletRequest request) throws Exception;
	
}
