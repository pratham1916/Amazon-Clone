package com.AmazonClone;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicBean1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.AmazonClone.MainDao;
import com.AmazonClone.loginModel;

@Controller
public class MainController 
{
	@Autowired
	MainDao dao;
	@RequestMapping("/login")
	public String getindex0(Model model)
	{
		model.addAttribute("command", new loginModel());
		return "login";
	}
}
