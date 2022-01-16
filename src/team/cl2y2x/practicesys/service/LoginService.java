package team.cl2y2x.practicesys.service;

import javax.servlet.http.HttpServletRequest;

public interface LoginService {
	/**
     * 注册
     * @param request HttpServletRequest 注册请求
     * @return boolean 返回结果
     */
	boolean register(HttpServletRequest request) throws Exception;
	/**
     * 登录验证
     * @param request HttpServletRequest 登录请求
     * @return boolean 返回结果
     */
	boolean validate(HttpServletRequest request) throws Exception;
	/**
     * 判断请求是否有效
     * @param request HttpServletRequest 请求
     * @return boolean 返回结果
     */  
    boolean isValidate(HttpServletRequest request) throws Exception;
}
