package com.liujie.controller;



import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.liujie.beans.Citys;
import com.liujie.service.CityService;

@Controller
public class CityController {
	@Resource
	private CityService service;
	@RequestMapping("list.do")
	public String getList(Model model){
		
		List<Citys> list = service.getList();
		System.out.println(list);
		model.addAttribute("list",list);
		return "list";
	}
}
