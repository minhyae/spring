package com.kgutbank.mvc05;


import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {


	@Autowired
	SqlSessionTemplate my; //myBatis¿Â¬¯
	
	public List<MemberDTO> selectAll() {
		return my.selectList("member.selectAll");
		 
	}
}
