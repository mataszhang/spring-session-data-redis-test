package com.matas.contoller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.matas.bean.User;

@Controller
public class TestController {
	@RequestMapping("{jump}")
	public String jump(String jump) {
		return jump;
	}
	
	@RequestMapping("auth")
	public String auth(HttpSession session){
		User user = new User();
		user.setName("jack");
		user.setAge(20);
		session.setAttribute("user", user);
		return "redirect:/index";
	}
}
