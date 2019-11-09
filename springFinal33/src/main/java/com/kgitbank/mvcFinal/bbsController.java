package com.kgitbank.mvcFinal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class bbsController {

	@Autowired
	bbsDAO dao;
	
	@RequestMapping("selectAll")
	public void selectAll () {
		List<bbsDTO> list = dao.selectAll();
		for(bbsDTO x: list) {
			System.out.println(x);
		}
	
	}
}
