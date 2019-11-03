package com.kgutbank.mvc05;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookmarkDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public void insert(BookmarkDTO dto) throws Exception {
		my.insert("book.insert", dto);
		//book.mapperspace(book)
	}
	
	public void update(BookmarkDTO dto) throws Exception {
		my.insert("book.update", dto);
		//book.mapperspace(book)	
	}
	
	public void delete(BookmarkDTO dto) {
		my.delete("book.delete", dto);
	}

	public BookmarkDTO selectOne(BookmarkDTO dto) {
		return my.selectOne("book.selectOne", dto);
		//반환값이 있다. selectAll일경우 list로 return해줘야함
	}
	
	public List<BookmarkDTO> selectAll() {
		return my.selectList("book.selectAll");
	}
	
}

