package com.kgitbank.mvc02;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {

	@Autowired
	//싱글톤객체(객체를 하나만 사용)
	BbsDAO dao;
	
	@RequestMapping("insert2") //요청이 매칭되면 밑에있는 메서드를 무조건 실행
	public void insert(String id, String title, String content, String writer) throws Exception {
		System.out.println("insert요청 들어옴");
		System.out.println("입력한 id는 " + id);
		System.out.println("입력한 pw는 " + title);
		System.out.println("입력한 name은 " + content);
		System.out.println("입력한 tel는 " + writer);
		dao.insert(id, title, content, writer);
	}
	
	@RequestMapping("delete2")
	public void delete(String id) throws Exception {

		System.out.println("delete요청 들어옴");
		System.out.println("삭제할 id는: " + id);
		dao.delete(id);
	}
	
	@RequestMapping("select2")
	public void select(String id, Model model) throws Exception {
		BbsDTO dto = dao.select(id);
		model.addAttribute("dto", dto);
	
	}
}
