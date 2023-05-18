package com.dev.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

	
	@RequestMapping("/devtools")
	@ResponseBody
	public String test()
	{
		int a=9990;
		int b=200;
		int c=-200;
		return "Addtion program for testiong purpose "+(a+b+c);
	}
}
