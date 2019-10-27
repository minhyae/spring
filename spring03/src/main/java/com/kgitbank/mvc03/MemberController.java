package com.kgitbank.mvc03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	@Autowired
	MemberDAO dao; //싱글톤
	//스프링에서 사용할 객체를 딱 1개만 만들어서
	//어디서든지 그 객체의 주소값을 가져다 사용할 수 있는 기법
	@RequestMapping("insert.do")
	public void insert(MemberDTO memberDTO) throws Exception { //db연동시 에러처리 필수 
		
		System.out.println(memberDTO.getId());
		System.out.println(memberDTO.getPw());
		dao.insert(memberDTO);
	}
}
