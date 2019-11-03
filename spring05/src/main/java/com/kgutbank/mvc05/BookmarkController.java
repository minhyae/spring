package com.kgutbank.mvc05;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookmarkController {
	
	@Autowired //찾아서 주소값을 넣어줌 
	BookmarkDAO dao;
	
	@RequestMapping("insert")
	public void insert(BookmarkDTO bookmarkDTO) throws Exception{
		System.out.println(bookmarkDTO.getId());
		System.out.println(bookmarkDTO.getName());
		System.out.println(bookmarkDTO.getSite());
		dao.insert(bookmarkDTO);
	}
	
	@RequestMapping("update")
	public void update(BookmarkDTO bookmarkDTO) throws Exception{
		System.out.println(bookmarkDTO.getId());
		System.out.println(bookmarkDTO.getName());
		dao.update(bookmarkDTO);
	}
	@RequestMapping("delete")
	public void delete(BookmarkDTO bookmarkDTO) throws Exception{
		System.out.println(bookmarkDTO.getId());
		dao.delete(bookmarkDTO);
	}
	@RequestMapping("selectOne")
	public void selectOne(BookmarkDTO bookmarkDTO,Model model) throws Exception{
		System.out.println(bookmarkDTO.getId());
		BookmarkDTO dto = dao.selectOne(bookmarkDTO);
		model.addAttribute("result", dto);
		
	}
	@RequestMapping("selectAll")
	public void selectAll(Model model) throws Exception{
		System.out.println("전체검색 요청됨");
		List<BookmarkDTO> list = dao.selectAll();
		model.addAttribute("list", list);
		
	}
	
}
