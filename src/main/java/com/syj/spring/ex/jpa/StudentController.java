package com.syj.spring.ex.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.syj.spring.ex.jpa.domain.Student;
import com.syj.spring.ex.jpa.service.StudentService;

@RequestMapping("/jpa/student")
@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	//학생 정보 저장기능
	@GetMapping("/create")
	@ResponseBody
	public Student createStudent() {

		String name = "송여진";
		String phoneNumber = "010-1234-5678";
		String email = "syj@gmail.com";
		String dreamjob ="개발자";
		
		Student student = studentService.addStudent(name, phoneNumber, email, dreamjob);
		
		return student;
	}
	
	@GetMapping("/update")
	@ResponseBody
	public Student updateStudent() {
		
		// id가 3인 학생의 정보 중 장래 희망을 강사로 수정
		Student student = studentService.updateStudent(3, "강사");
		
		return student;
	}
	
	@GetMapping("/delete")
	@ResponseBody
	public String deleteStudent() {
		
		// id가 4인 행 삭제
		studentService.deleteStudent(8);
		
		return "삭제 완료";
	}
	
	
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
