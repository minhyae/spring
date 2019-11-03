package com.kgutbank.mvc05;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@Autowired //찾아서 주소값을 넣어줌 
	MemberDAO dao;
	
	@RequestMapping("memberAll")
	public void selectAll(Model model) throws Exception{
		System.out.println("전체검색 요청됨");
		List<MemberDTO> list = dao.selectAll();
		model.addAttribute("list2", list);
		
	}
	
}
