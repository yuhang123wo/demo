package cn.yh.study.web.config;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.Filter;

import org.apache.commons.collections.CollectionUtils;
import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cn.yh.study.base.domain.Auth;
import cn.yh.study.base.service.UserinfoService;
import cn.yh.study.shiro.CustomCredentialsMatcher;
import cn.yh.study.shiro.FormAuthenticationCaptchaFilter;
import cn.yh.study.shiro.ShiroRealm;

/**
 * 
 * @author yh
 * @Date 2017年10月18日
 * @desc shiro 配置
 */
@Configuration
public class ShiroConfiguration {

	@Autowired
	private UserinfoService userinfoService;

	@Bean
	public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
		return new LifecycleBeanPostProcessor();
	}

	/**
	 * cache
	 * 
	 * @return
	 */
	@Bean(name = "cacheManager")
	public EhCacheManager getEhCacheManager() {
		EhCacheManager em = new EhCacheManager();
		em.setCacheManagerConfigFile("classpath:ehcache-shiro.xml");
		return em;
	}

	@Bean(name = "shiroFilter")
	public ShiroFilterFactoryBean shiroFilter(SecurityManager manager) {
		ShiroFilterFactoryBean bean = new ShiroFilterFactoryBean();
		// 配置登录的url和登录成功的url
		bean.setLoginUrl("/login");
		bean.setSuccessUrl("/home");
		Map<String, Filter> filters = bean.getFilters();
		filters.put("loginAuth", new FormAuthenticationCaptchaFilter());
		bean.setFilters(filters);
		bean.setSecurityManager(manager);

		// 配置访问权限
		LinkedHashMap<String, String> filterChainDefinitionMap = new LinkedHashMap<>();
		filterChainDefinitionMap.put("/login", "loginAuth");// 表示需要认证才可以访问
		List<Auth> list = userinfoService.findAuthAll();
		if (CollectionUtils.isNotEmpty(list)) {
			for (Auth auth : list) {
				filterChainDefinitionMap.put(auth.getAuthUrl(),
						"perms[" + auth.getAuthUrl() + "]");
			}
		}
		System.out.println("abc");
		filterChainDefinitionMap.put("/**", "authc");// 表示需要认证才可以访问
		bean.setFilterChainDefinitionMap(filterChainDefinitionMap);
		return bean;
	}

	// 配置核心安全事务管理器
	@Bean(name = "securityManager")
	public SecurityManager securityManager(
			@Qualifier("shiroRealm") ShiroRealm authRealm) {
		DefaultWebSecurityManager manager = new DefaultWebSecurityManager();
		manager.setRealm(authRealm);
		return manager;
	}

	// 配置自定义的权限登录器
	@Bean(name = "shiroRealm")
	public ShiroRealm authRealm(EhCacheManager cacheManager) {
		ShiroRealm authRealm = new ShiroRealm();
		authRealm.setCacheManager(cacheManager);
		authRealm.setCredentialsMatcher(new CustomCredentialsMatcher());
		return authRealm;
	}

	@Bean
	public DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator() {
		DefaultAdvisorAutoProxyCreator creator = new DefaultAdvisorAutoProxyCreator();
		creator.setProxyTargetClass(true);
		return creator;
	}

	@Bean
	public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(
			@Qualifier("securityManager") SecurityManager manager) {
		AuthorizationAttributeSourceAdvisor advisor = new AuthorizationAttributeSourceAdvisor();
		advisor.setSecurityManager(manager);
		return advisor;
	}
}
