package com.yc.web.core;

/**
 * 包装http请求的处理
 * company 源辰信息
 * @author navy
 * @date 2020年8月21日
 * Email haijunzhou@hnit.edu.cn
 */
public interface ServletRequest {
	/**
	 * 解析请求的方法
	 */
	public void parse();
	 
	/**
	 * 获取请求参数的方法
	 * @param key 键
	 * @return
	 */
	public String getParameter(String key);
	
	/**
	 * 获取解析出来的请求的地址
	 * @return
	 */
	public String getUrl();
	
	/**
	 * 请求方式
	 * @return
	 */
	public String getMethod();
	
}	
