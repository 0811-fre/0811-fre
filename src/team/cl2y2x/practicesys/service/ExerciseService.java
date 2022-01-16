package team.cl2y2x.practicesys.service;

import javax.servlet.http.HttpServletRequest;

public interface ExerciseService {
	/**
     * 获取试卷
     * @param request HttpServletRequest 做题请求
     */
	void getPaper(HttpServletRequest request) throws Exception;
	/**
     * 计算分数
     * @param request HttpServletRequest 提交请求
     */
	void score(HttpServletRequest request) throws Exception;
	/**
     * 获取题目
     * @param request HttpServletRequest 获取题目请求
     */
	void getQuestion(HttpServletRequest request) throws Exception;
	/**
     * 获取课程
     * @param request HttpServletRequest 获取课程请求
     */
	void getCourse(HttpServletRequest request) throws Exception;
}
