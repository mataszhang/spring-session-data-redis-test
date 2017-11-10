package com.matas.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping("{jump}")
	public String jump(String jump) {
		return jump;
	}
}
