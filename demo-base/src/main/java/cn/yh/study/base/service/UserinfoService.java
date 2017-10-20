package cn.yh.study.base.service;

import java.util.List;

import cn.yh.study.base.domain.Auth;
import cn.yh.study.base.domain.Role;
import cn.yh.study.base.domain.Userinfo;

import com.github.pagehelper.PageInfo;

public interface UserinfoService {

	/**
	 * 
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	PageInfo<Userinfo> queryUserinfo(int pageNo, int pageSize);

	/**
	 * 
	 * @return
	 */
	List<Role> findRoleAll();

	/**
	 * 
	 * @return
	 */
	List<Auth> findAuthAll();
}
