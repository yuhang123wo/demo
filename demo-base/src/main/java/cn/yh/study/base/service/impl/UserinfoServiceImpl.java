package cn.yh.study.base.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.yh.study.base.domain.Userinfo;
import cn.yh.study.base.mapper.UserinfoMapper;
import cn.yh.study.base.service.UserinfoService;

import com.github.abel533.entity.Example;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class UserinfoServiceImpl implements UserinfoService {

	@Resource
	private UserinfoMapper userinfoMapper;

	@Override
	public PageInfo<Userinfo> queryUserinfo(int pageNo, int pageSize) {
		PageHelper.startPage(pageNo, pageSize);
		Example example = new Example(Userinfo.class);
		example.createCriteria().andEqualTo("sex", 1);
		List<Userinfo> list = userinfoMapper.selectByExample(example);
		return new PageInfo<Userinfo>(list);
	}
}
