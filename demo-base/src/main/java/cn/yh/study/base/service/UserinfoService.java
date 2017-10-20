package cn.yh.study.base.service;

import cn.yh.study.base.domain.Userinfo;

import com.github.pagehelper.PageInfo;

public interface UserinfoService {

	PageInfo<Userinfo> queryUserinfo(int pageNo, int pageSize);
}
