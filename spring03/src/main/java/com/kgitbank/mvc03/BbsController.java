package com.kgitbank.mvc03;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {

	@RequestMapping("bInsert.do")
	public void insert (BbsDTO bbsDTO) {

		System.out.println(bbsDTO.getContent());
		System.out.println(bbsDTO.getTitle());
		System.out.println(bbsDTO.getWriter());

	}

}
