package cn.yh.study.base.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.abel533.entity.Example;

import cn.yh.study.base.domain.User;
import cn.yh.study.base.mapper.UserMapper;
import cn.yh.study.base.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;

	@Transactional
	@Override
	public void saveOne(User user) {
		userMapper.insert(user);
	}

	@Override
	public User findOne() {
		User user = new User();
		user.setId(1L);
		Example  e = new Example(User.class);
		e.createCriteria().andEqualTo("id", 1);
		userMapper.selectByExample(e);
		return userMapper.findOne();
	}

	@Override
	public Map getMap() {
		return userMapper.getMap();
	}

}
