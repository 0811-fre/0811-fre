package team.cl2y2x.practicesys.factory;

import java.sql.Connection;

import team.cl2y2x.practicesys.dao.ClstcDao;
import team.cl2y2x.practicesys.dao.CourseDao;
import team.cl2y2x.practicesys.dao.CqbDao;
import team.cl2y2x.practicesys.dao.GradeDao;
import team.cl2y2x.practicesys.dao.MistakeDao;
import team.cl2y2x.practicesys.dao.PaperDao;
import team.cl2y2x.practicesys.dao.PqDao;
import team.cl2y2x.practicesys.dao.QdetailDao;
import team.cl2y2x.practicesys.dao.QqbDao;
import team.cl2y2x.practicesys.dao.StudentDao;
import team.cl2y2x.practicesys.dao.TeacherDao;
import team.cl2y2x.practicesys.dao.impl.ClstcDaoImpl;
import team.cl2y2x.practicesys.dao.impl.CourseDaoImpl;
import team.cl2y2x.practicesys.dao.impl.CqbDaoImpl;
import team.cl2y2x.practicesys.dao.impl.GradeDaoImpl;
import team.cl2y2x.practicesys.dao.impl.MistakeDaoImpl;
import team.cl2y2x.practicesys.dao.impl.PaperDaoImpl;
import team.cl2y2x.practicesys.dao.impl.PqDaoImpl;
import team.cl2y2x.practicesys.dao.impl.QdetailDaoImpl;
import team.cl2y2x.practicesys.dao.impl.QqbDaoImpl;
import team.cl2y2x.practicesys.dao.impl.StudentDaoImpl;
import team.cl2y2x.practicesys.dao.impl.TeacherDaoImpl;

public class DaoFactory {
	
	public static ClstcDao getClstcDaoInstance(Connection conn){
	    return new ClstcDaoImpl(conn);  
	}
	
	public static CourseDao getCourseDaoInstance(Connection conn){
	    return new CourseDaoImpl(conn);  
	}

	public static CqbDao getCqbDaoInstance(Connection conn){
	    return new CqbDaoImpl(conn);  
	}

	public static GradeDao getGradeDaoInstance(Connection conn){
	    return new GradeDaoImpl(conn);
	}

	public static QqbDao getQqbDaoInstance(Connection conn){
	    return new QqbDaoImpl(conn);  
	}

	public static PaperDao getPaperDaoInstance(Connection conn){
	    return new PaperDaoImpl(conn); 	    
	}

	public static PqDao getPqDaoInstance(Connection conn){
	    return new PqDaoImpl(conn);  
	}

	public static QdetailDao getQdetailDaoInstance(Connection conn){
	    return new QdetailDaoImpl(conn);  
	}

	public static StudentDao getStudentDaoInstance(Connection conn){
	    return new StudentDaoImpl(conn);
	}

	public static TeacherDao getTeacherDaoInstance(Connection conn){
	    return new TeacherDaoImpl(conn);
	}
	
	public static MistakeDao getMistakeDaoInstance(Connection conn){
	    return new MistakeDaoImpl(conn);
	}
	
}
