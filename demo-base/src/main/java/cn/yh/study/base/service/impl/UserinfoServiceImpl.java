package cn.yh.study.base.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.yh.study.base.domain.Auth;
import cn.yh.study.base.domain.Role;
import cn.yh.study.base.domain.Userinfo;
import cn.yh.study.base.mapper.AuthMapper;
import cn.yh.study.base.mapper.RoleMapper;
import cn.yh.study.base.mapper.UserinfoMapper;
import cn.yh.study.base.service.UserinfoService;

import com.github.abel533.entity.Example;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class UserinfoServiceImpl implements UserinfoService {

	@Resource
	private UserinfoMapper userinfoMapper;
	@Resource
	private RoleMapper roleMapper;
	@Resource
	private AuthMapper authMapper;

	@Override
	public PageInfo<Userinfo> queryUserinfo(int pageNo, int pageSize) {
		PageHelper.startPage(pageNo, pageSize);
		Example example = new Example(Userinfo.class);
		example.createCriteria().andEqualTo("sex", 1);
		List<Userinfo> list = userinfoMapper.selectByExample(example);
		return new PageInfo<Userinfo>(list);
	}

	@Override
	public List<Role> findRoleAll() {
		return roleMapper.select(null);
	}

	@Override
	public List<Auth> findAuthAll() {
		return authMapper.select(null);
	}
}
