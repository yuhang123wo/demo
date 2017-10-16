package cn.yh.study.base.service;

import cn.yh.study.base.domain.User;

public interface UserService {

	void saveOne(User user);

	User findOne();
}
