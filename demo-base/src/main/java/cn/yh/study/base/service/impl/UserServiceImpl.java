package cn.yh.study.base.service.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
		return userMapper.findOne();
	}

	@Override
	public Map getMap() {
		return userMapper.getMap();
	}

}
