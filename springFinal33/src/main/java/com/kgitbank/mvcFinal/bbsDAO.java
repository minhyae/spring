package com.kgitbank.mvcFinal;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class bbsDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public List<bbsDTO> selectAll(){
		return my.selectList("bbs.selectAll");
	}
}
