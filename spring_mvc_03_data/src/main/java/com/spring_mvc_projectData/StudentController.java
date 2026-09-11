package com.spring_mvc_projectData;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {
	
	@RequestMapping("/newView")
	public String newViewT(Model model) {
		model.addAttribute("name", "홍길동");
		model.addAttribute("no", "1001");
		model.addAttribute("year", "4");
		return "newView";
	}
	
	//URI를 통한 데이터 전달 받기
	@RequestMapping("/student/studentDetailView/{stdNo}")
	public String studentDetailView(@PathVariable String stdNo) {// stdNo pathVariable과 매개변수 stdNo는 동일해야 함
		System.out.println(stdNo);
		return "student/studentResult5";
	}
	
	// 서로 다른 타입 데이터의 전송 - 검색 관련
	// 검색 관련 폼 반환
	@RequestMapping("/student/studentSearchFrom")
	public String studentSearchForm() {
		return "student/studentSearchForm";
	}
	// 검색폼에서 전달된 파라미터값을 받아서 HashMap에 받아 DAO에서 활용하도록 전달
	//DAO에서 검색한 학생 data가 컨트롤러로 전달되었다고 가정
	@RequestMapping("/student/studentSearch")
	public String studentSearch(@RequestParam HashMap<String, Object> param) {
		
		// param 값 출력 : key로 value 찾아서 출력 -> 파라미터명이 key, 파라미터값 value
		System.out.println(param.get("type"));
		System.out.println(param.get("keyword"));
		
		// 검색결과를 view에 전달하기 위한 준비
		Student vo1 = new Student();
		vo1.setNo("1001");
		vo1.setName("홍길동");
		vo1.setYear(2);
		
		Student vo2 = new Student();
		vo2.setNo("1002");
		vo2.setName("김길동");
		vo2.setYear(2);
		
		ArrayList<Student> stdList = new ArrayList<Student>();
		stdList.add(vo1);
		stdList.add(vo2);
		
		model.addAttribute("stdList", stdList);
		return "student/studentSearchResult";
	}
	
	//URI를 통한 여러 데이터 전달 받기
	@RequestMapping("/student/studentDetailView/{stdNo}/{stdName}/{stdYear}")
	public String studentDetailView(@PathVariable String stdNo,
			@PathVariable String stdName,
			@PathVariable String stdYear) {
		System.out.println(stdNo);
		return "student/studentResult5";
	}
	
	@RequestMapping("/student/studentForm")
	public String studentFormView() {
		return "student/studentForm3";
	}
	
	//getParameter() 메소드 사용 - 파라미터 값 추출
	public String insertStudent(HttpServletRequest request, Model model) {
		//form에서 각 input 태그의 name 속성값 받아오기
		String no = request.getParameter("no");
		String name = request.getParameter("name");
		String year = request.getParameter("year");
		
		// view로 전달
		model.addAttribute("no", no);
		model.addAttribute("name", name);
		model.addAttribute("year", year);
		
		return "student/studentResult2";
	}
	//2. @RequestParam 이용 - 처리함수의 매개변수로 주입
	@RequestMapping("/student/newStudent2")
	public String insertStudent2(
			@RequestParam("no") String no,
			@RequestParam("name") String name,
			@RequestParam("year") String year,
			Model model) {
		model.addAttribute("no", no);
		model.addAttribute("name", name);
		model.addAttribute("year", year);
		return "student/studentResult";
	}
	
	//2-1. @RequestParam 이용 - 처리함수의 매개변수로 주입
	// form태그 내 input의 name 속성값이 매개변수와 동일하면 @RequestParam을 생략할 수 있다
	@RequestMapping("/student/newStudent3")
	public String insertStudent3(String no,
								String name,
								String year,
								Model model) {
		model.addAttribute("no", no);
		model.addAttribute("name", name);
		model.addAttribute("year", year);
		return "student/studentResult3";
	}
	
	// 3. command 객체 사용 -> 요청 처리에 사용되는 객체 command 객체라고 함 매개변수에 사용됨
	// student command 객체가 되고 파라미터가 전달된다면 필드명과 같은 이름의 파라미터 값이 필드값으로 대입된 객체가 전달됨
	// command 객체를 사용하면 지정된 뷰로 model이 자동 전송됨 -> model에 command 객체가 포함되어 전송 command 객체명으로 전달
	// command 객체 사용시 주의사항 : 파라미터명과 필드명이 동일해야 함 다르면 매칭되지 않음 null 저장
	@RequestMapping("/student/newStudent4")
	public String insertStudent3(Student student) {
		System.out.println(student.getNo());
		System.out.println(student.getName());
		System.out.println(student.getYear());
		return "student/studentResult4";
	}
	
	// 3-1. command 객체 사용
	// attr의 이름을 변경해서 view로 전달 ->@ModeldAttribute("새로운 이름") 사용해서 변경
	@RequestMapping("/student/newStudent5")
	public String insertStudent4(@ModelAttribute("studentInfo") Student student) {
		return "/student/studentResult5";
	}
}
