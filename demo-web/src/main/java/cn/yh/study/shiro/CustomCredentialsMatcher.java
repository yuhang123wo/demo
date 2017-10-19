package cn.yh.study.shiro;

import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.credential.SimpleCredentialsMatcher;

import cn.yh.study.common.util.MD5;

/**
 * Created on 2014/6/19.
 */
public class CustomCredentialsMatcher extends SimpleCredentialsMatcher {
	@Override
	public boolean doCredentialsMatch(AuthenticationToken authcToken,
			AuthenticationInfo info) {
		UsernamePasswordCaptchaToken token = (UsernamePasswordCaptchaToken) authcToken;
		Object accountCredentials = getCredentials(info);
		try {
			String password = String.valueOf(token.getPassword());
			return equals(MD5.md5Encode(password), accountCredentials);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}
