package com.kgitbank.mvc04;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

	@Autowired
	ProductDAO dao;
	
	@Autowired
	ReplyDAO dao2;
	
	@RequestMapping("selectAll2")
	public void selectAll (Model model) throws Exception {
		List<ProductDTO> list = dao.selectAll();
		model.addAttribute("list", list);
		for (int i = 0; i < list.size(); i++) {
			//리스트에 들어있는 dto를 꺼낸다.
			ProductDTO dto = list.get(i);
			System.out.println(dto.getId());
			System.out.println(dto.getTitle());
			System.out.println(dto.getContent());
			System.out.println(dto.getPrice());
			System.out.println(dto.getImg());
			System.out.println("-----------------");
		}
	
	}
	
	@RequestMapping("select2")
	public void select(ProductDTO productDTO, Model model) {
		System.out.println("컨트롤러 넘어왔음.");
		ProductDTO dto = dao.select(productDTO);
		model.addAttribute("dto",dto);
		System.out.println(dto);
	
	
	//댓글 가지고 오기
	System.out.println("--------------------------------------");
	ReplyDTO dto2 = new ReplyDTO();
	dto2.setProductId(dto.getId());
	List<ReplyDTO> list = dao2.selectAll(dto2);
	model.addAttribute("list", list);
	for (ReplyDTO replyDTO : list) {
		System.out.println(replyDTO);
	}
	
	
	}
}
