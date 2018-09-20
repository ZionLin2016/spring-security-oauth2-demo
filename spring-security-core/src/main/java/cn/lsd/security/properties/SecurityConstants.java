package cn.lsd.security.properties;

/**
 * @Author: LSD
 * @Date: 2018/9/20
 */
public interface SecurityConstants {
	/**
	 * 当请求需要身份认证时，默认跳转的url
	 */
	public static final String DEFAULT_UNAUTHENTICATION_URL = "/auth/require";

	/**
	 * 默认的用户名密码登录请求处理url
	 */
	public static final String DEFAULT_LOGIN_PROCESSING_URL = "/auth/login";

	/**
	 * 默认登录页面
	 */
	public static final String DEFAULT_LOGIN_PAGE = "/custom-login.html";

}
