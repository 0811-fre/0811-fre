package team.cl2y2x.practicesys.service;

import javax.servlet.http.HttpServletRequest;

public interface LoginService {
	/**
     * ע��
     * @param request HttpServletRequest ע������
     * @return boolean ���ؽ��
     */
	boolean register(HttpServletRequest request) throws Exception;
	/**
     * ��¼��֤
     * @param request HttpServletRequest ��¼����
     * @return boolean ���ؽ��
     */
	boolean validate(HttpServletRequest request) throws Exception;
	/**
     * �ж������Ƿ���Ч
     * @param request HttpServletRequest ����
     * @return boolean ���ؽ��
     */  
    boolean isValidate(HttpServletRequest request) throws Exception;
}
