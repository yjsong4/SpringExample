package com.syj.spring.ex.lifecycle;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Ex01Controller {
	
	@RequestMapping("/lifecycle/ex01/1")
	@ResponseBody
	public String stringResponse() {
		return "<h1>예제 1번 문자열 담기</h1>";
	}

	@RequestMapping("/lifecycle/ex01/2")
	@ResponseBody
	public Map<String, Integer> mapResponse() {
		
		// 과일 이름 : 가격
		Map<String, Integer> fruitMap = new HashMap<>();
		
		fruitMap.put("apple", 2600);
		fruitMap.put("banana", 4900);
		fruitMap.put("cherry", 9900);
		
		return fruitMap;	
	}
	
}
