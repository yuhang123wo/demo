package cn.yh.study.base.mapper;

import java.util.Map;

import cn.yh.study.base.domain.User;

import com.github.abel533.mapper.Mapper;

public interface UserMapper extends Mapper<User> {

	User findOne();

	Map getMap();
}
