package cn.lsd.security.properties;

/**
 * 定义授权通过后，返回JSON数据或是跳转页面
 *
 * @Author: LSD
 * @Date: 2018/9/20
 */
public enum LoginResponseType {
	
	/**
	 * 跳转
	 */
	REDIRECT,
	
	/**
	 * 返回json
	 */
	JSON

}
