package com.syj.spring.ex.lifecycle;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // @Controller + @ResponseBody
public class Ex01RestController {
	
	// 직접 만든 클래스 객체 리턴
	@RequestMapping("/lifecycle/ex01/3")
	public Person objectResponse() {
		Person me = new Person("송여진", 99);
		// name = "송여진"
		// age = 29
		return me;
	}
	
}
