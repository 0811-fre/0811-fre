package team.cl2y2x.practicesys.service;

import javax.servlet.http.HttpServletRequest;

public interface ExerciseService {
	/**
     * ��ȡ�Ծ�
     * @param request HttpServletRequest ��������
     */
	void getPaper(HttpServletRequest request) throws Exception;
	/**
     * �������
     * @param request HttpServletRequest �ύ����
     */
	void score(HttpServletRequest request) throws Exception;
	/**
     * ��ȡ��Ŀ
     * @param request HttpServletRequest ��ȡ��Ŀ����
     */
	void getQuestion(HttpServletRequest request) throws Exception;
	/**
     * ��ȡ�γ�
     * @param request HttpServletRequest ��ȡ�γ�����
     */
	void getCourse(HttpServletRequest request) throws Exception;
}
