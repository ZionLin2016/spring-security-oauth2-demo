package cn.lsd.security.properties;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @Author: LSD
 * @Date: 2018/9/20
 */
@Data
@Component
public class GlobalProperties {
	
	private String loginPage = SecurityConstants.DEFAULT_LOGIN_PAGE;
	
	private LoginResponseType loginType = LoginResponseType.JSON;
	
	private int rememberMeSeconds = 10;


}
