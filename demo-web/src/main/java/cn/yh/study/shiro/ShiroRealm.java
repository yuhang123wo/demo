package cn.yh.study.shiro;

import javax.annotation.Resource;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import cn.yh.study.base.domain.Userinfo;
import cn.yh.study.base.service.UserinfoService;
import cn.yh.study.common.util.MD5;

public class ShiroRealm extends AuthorizingRealm {
/*
	@Resource
	private UserinfoService userinfoService;*/

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principals) {
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		System.out.println(111);
		return info;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken authcToken) throws AuthenticationException {
		try {
			UsernamePasswordCaptchaToken token = (UsernamePasswordCaptchaToken) authcToken;
			System.out.println(111);
			AuthenticationInfo info = new SimpleAuthenticationInfo(
					new Userinfo(), MD5.md5Encode("1232"), "yh");
			return info;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
