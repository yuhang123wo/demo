package cn.yh.study.base.mapper;

import java.util.List;

import cn.yh.study.base.domain.Auth;
import cn.yh.study.base.domain.Role;
import cn.yh.study.base.domain.Userinfo;

import com.github.abel533.mapper.Mapper;

public interface UserinfoMapper extends Mapper<Userinfo> {

	List<Role> findRoleAll();

	List<Auth> findAuthAll();
}
