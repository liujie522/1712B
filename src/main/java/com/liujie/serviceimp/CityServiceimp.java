package com.liujie.serviceimp;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.liujie.beans.Citys;
import com.liujie.mapper.CityMapper;
import com.liujie.service.CityService;
@Service
public class CityServiceimp implements CityService{
	@Resource
	private CityMapper mapper;
	//列表
	public List<Citys> getList() {
		// TODO Auto-generated method stub
		return mapper.getList();
	}
}
