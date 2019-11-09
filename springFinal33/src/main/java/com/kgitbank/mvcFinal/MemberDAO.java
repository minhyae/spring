package com.kgitbank.mvcFinal;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public void insert(MemberDTO dto) {
		my.insert("member.insert",dto);
	}
}
