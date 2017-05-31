package com.study.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
/**
 * 自定义拦截器
 * @author 1
 *
 */
public class MyInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}
	//拦截前处理
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse arg1, Object arg2) throws Exception {
	String url = request.getRequestURL().toString();
        
		boolean manage = url.contains("/queryAllUser/");
		if(manage){
			System.out.println("走到这里了》》》》》》》》》》》》》》");
		}else{
			System.out.println("没有走到这里了》》》》》》》》》》》》》》");
		return true;
	}
		return true;
	}

}
