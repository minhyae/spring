package com.kgitbank.mvc02;

public class DTOTest {

	public static void main(String[] args) {
		
		MemberDTO dto = new MemberDTO();
		
		dto.setId("orange");
		dto.setPw("orange");
		dto.setName("orange");
		dto.setTel("orange");
		//dto에 값이 들어감 
		
		DTO전달받음 send = new DTO전달받음();
		send.받음(dto);
		
	}
}
