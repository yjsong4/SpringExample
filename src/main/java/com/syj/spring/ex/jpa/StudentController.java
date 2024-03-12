package com.syj.spring.ex.jpa;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.syj.spring.ex.jpa.domain.Student;

@Controller
public class StudentController {
	
	@GetMapping("/lombok/test")
	@ResponseBody
	public Student lombokTest() {
		
		// Student 객체를 만들고 값을 채워서 response에 담는다.
//		Student student = new Student();
//		student.setName("송여진");
//		student.setDreamJob("개발자");
//		student.setPhoneNumber("010-1234-5678");
		
//		Student student = new Student(1, "송여진", "010-1234-5678", "syj@gmail.com", "개발자", new Date(), new Date());
		
		// builder 패턴
		// 데이터를 저장하기 위한 목적의 클래스 객체 생성과정에서 명료하고 명확하게 표현하기 위한 방법
		Student student = Student.builder()
							.name("송여진")
							.email("syj@gmail.com")
							.dreamJob("개발자")
							.phoneNumber("010-1234-5678")
							.build();
		
		return student;
	}

}
