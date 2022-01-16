package team.cl2y2x.practicesys.factory;

import team.cl2y2x.practicesys.service.DetailService;
import team.cl2y2x.practicesys.service.ExerciseService;
import team.cl2y2x.practicesys.service.LoginService;
import team.cl2y2x.practicesys.service.MergeService;
import team.cl2y2x.practicesys.service.MistakeService;
import team.cl2y2x.practicesys.service.SearchService;
import team.cl2y2x.practicesys.service.StudyInfoService;
import team.cl2y2x.practicesys.service.impl.DetailServiceImpl;
import team.cl2y2x.practicesys.service.impl.ExerciseServiceImpl;
import team.cl2y2x.practicesys.service.impl.LoginServiceImpl;
import team.cl2y2x.practicesys.service.impl.MergeServiceImpl;
import team.cl2y2x.practicesys.service.impl.MistakeServiceImpl;
import team.cl2y2x.practicesys.service.impl.SearchServiceImpl;
import team.cl2y2x.practicesys.service.impl.StudyInfoServiceImpl;

public class ServiceFactory {
	
	public static LoginService getLoginServiceInstance() throws Exception{
	    return new LoginServiceImpl();
	}
	
	public static ExerciseService getExerciseServiceInstance() throws Exception{
	    return new ExerciseServiceImpl();
	}
	public static DetailService getDetailServiceInstance() throws Exception {
		return new DetailServiceImpl();
	}
	
	public static MistakeService getMistakeServiceInstance() throws Exception {
		return new MistakeServiceImpl();
	}
	
	public static SearchService getSearchServiceInstance() throws Exception {
		return new SearchServiceImpl();
	}
	
	public static MergeService getMergeServiceInstance() throws Exception {
		return new MergeServiceImpl();
	}
	
	public static StudyInfoService getStudyInfoServiceInstance() throws Exception {
		return new StudyInfoServiceImpl();
	}
	
}
