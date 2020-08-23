package com.yc.web.core;

/**
 * Servlet接口定义
 * company 源辰信息
 * @author navy
 * @date 2020年8月21日
 * Email haijunzhou@hnit.edu.cn
 */
public interface Servlet {
	public void init();
	
	public void service(ServletRequest request, ServletResponse response);
	
	public void doGet(ServletRequest request, ServletResponse response);
	
	public void doPost(ServletRequest request, ServletResponse response);
}
