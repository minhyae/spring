package com.kgitbank.mvc02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@Autowired
	//싱글톤객체(객체를 하나만 사용)
	MemberDAO dao;
	
	@RequestMapping("insert") //요청이 매칭되면 밑에있는 메서드를 무조건 실행
	public void insert(String id, String pw, String name, String tel) throws Exception {
		System.out.println("insert요청 들어옴");
		System.out.println("입력한 id는 " + id);
		System.out.println("입력한 pw는 " + pw);
		System.out.println("입력한 name은 " + name);
		System.out.println("입력한 tel는 " + tel);
		dao.insert(id, pw, name, tel);
	}

	@RequestMapping("select")
	public void select(String id, Model model) throws Exception {

		System.out.println("select요청 들어옴\n");
		System.out.println("검색한 id는: " + id);
		MemberDTO dto2 = dao.select(id);
		//Model객체는 view까지만 값을 넘기고 싶을 때 session과 유사하지만, 더 좁다. (session은 브라우저를 닫을 때 까지)
		model.addAttribute("dto2", dto2);
		
	}
	
	@RequestMapping("delete")
	public void delete(String id) throws Exception{

		System.out.println("delete요청 들어옴");
		System.out.println("삭제한 id는: " + id);
		dao.delete(id);
	}
	
}
