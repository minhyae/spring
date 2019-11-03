package com.kgutbank.mvc05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.springframework.stereotype.Repository;

@Repository
public class BookmarkDAO_old {

		public static void insert(BookmarkDTO dto) throws Exception {

			// 1. db드라이버(커넥터 설정)
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1.드라이버 설정 성공");
			
			// 2. db연결(db주소, id, pw)
			String url="jdbc:mysql://localhost:3307/spring";
			String user="root";
			String password="1234";
			Connection con = DriverManager.getConnection(url, user, password); 
			System.out.println("2. db 연결 성공");
			
			// 3. sql문 생성
			String sql = "insert into bookmark values (?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getName());
			ps.setString(3, dto.getSite());
			System.out.println("3. sql문 생성 성공");
			
			// 4. sql문 전송
			ps.executeUpdate();
			System.out.println("4. sql문 전송 성공");
			// 5. 검색인 경우에는 받은 데이터 처리
			
	}
	
}
