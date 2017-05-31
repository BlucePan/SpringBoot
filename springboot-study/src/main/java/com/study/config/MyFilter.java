package com.study.config;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
*
* 使用注解标注过滤器
* @WebFilter将一个实现了javax.servlet.Filter接口的类定义为过滤器
* 属性filterName声明过滤器的名称,可选
* 属性urlPatterns指定要过滤的URL模式,也可使用属性value来声明.(指定要过滤的URL模式是必选属性)
* @author Angel(QQ:412887952)
* @version v.0.1
*/
@WebFilter(filterName="myFilter",urlPatterns="/*")
public class MyFilter implements Filter {		
	ServletContext context = null;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		context = filterConfig.getServletContext();

	}

	@Override
	public void doFilter(ServletRequest requests, ServletResponse responses, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest)requests;
	  	HttpServletResponse response = (HttpServletResponse)responses; 
	  	HttpSession session = ((HttpServletRequest) request).getSession(true);
	  	String url = request.getRequestURL().toString();
		boolean lean = url.contains("/app/");
		if(lean){
			System.out.println("有的");
			chain.doFilter(request, response);
		}else{
			System.out.println("没有");
			chain.doFilter(request, response);
		}
		
		
		}

	@Override
	public void destroy() {
		System.out.println("销毁-----------------");

	}

}
