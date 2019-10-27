package com.kgitbank.mvc02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {

	//자동 import ctrl+shift+o
	public void insert(String id, String pw, String name, String tel) throws Exception {

		//Model(m)
		//1. 드라이버 설정
		Class.forName("com.mysql.jdbc.Driver"); //void형 메서드 설정만으로도 끝
		//view(v)
		System.out.print("1. 드라이버 설정 성공!");

		//2. DB연결
		String url="jdbc:mysql://localhost:3307/spring"; //연결할 db
		String user="root"; //id
		String password="1234"; //password
		Connection con  = DriverManager.getConnection(url, user, password); //램에 생기는 변수 Driver manager가 3개의 변수로 db를 연결해줌
		//return해줌 
		System.out.print("2. DB연결 성공!");

		//3. SQL결정
		String sql = "insert into member values (?,?,?,?)"; //sql
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.print("3. SQL결정 성공!");

		//4. SQL전송
		ps.executeUpdate();
		System.out.print("4. SQL전송성공!");

	}
	public void delete(String id) throws Exception {

		//Model(m)
		//1. 드라이버 설정
		Class.forName("com.mysql.jdbc.Driver"); //void형 메서드 설정만으로도 끝
		//view(v)
		System.out.print("1. 드라이버 설정 성공!");

		//2. DB연결
		String url="jdbc:mysql://localhost:3307/spring"; //연결할 db
		String user="root"; //id
		String password="1234"; //password
		Connection con  = DriverManager.getConnection(url, user, password); //램에 생기는 변수 Driver manager가 3개의 변수로 db를 연결해줌
		//return해줌 
		System.out.print("2. DB연결 성공!");

		//3. SQL결정
		String sql = "delete from member where id = ?"; //sql
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);

		System.out.print("3. SQL결정 성공!");

		//4. SQL전송
		ps.executeUpdate();
		System.out.print("4. SQL전송성공!");

	}
	public MemberDTO select(String id) throws Exception {

		//Model(m)
		//1. 드라이버 설정
		Class.forName("com.mysql.jdbc.Driver"); //void형 메서드 설정만으로도 끝
		//view(v)
		System.out.print("1. 드라이버 설정 성공!");

		//2. DB연결
		String url="jdbc:mysql://localhost:3307/spring"; //연결할 db
		String user="root"; //id
		String password="1234"; //password
		Connection con  = DriverManager.getConnection(url, user, password); //램에 생기는 변수 Driver manager가 3개의 변수로 db를 연결해줌
		//return해줌 
		System.out.print("2. DB연결 성공!");

		//3. SQL결정
		String sql = "select * from member where id = ?"; //sql
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);

		System.out.print("3. SQL결정 성공!");

		
		//4. SQL전송
		ResultSet rs = ps.executeQuery();
		MemberDTO dto2 = null;
		//curd중엑서 r만다름 //반환되는 것을 받아줌
		if(rs.next()) {//검색 결과가 있는지 체크:true
			String gid = rs.getString(1);//id, 첫번째 칼럼을 갖고옴
			String pw = rs.getString(2); 
			String name = rs.getString(3);
			String tel = rs.getString(4);

			System.out.println(gid);
			System.out.println(pw);
			System.out.println(name);
			System.out.println(tel);
			
			dto2 = new MemberDTO();
			dto2.setId(gid);
			dto2.setPw(pw);
			dto2.setName(name);
			dto2.setTel(tel);
		}	
		System.out.print("4. SQL전송성공!");

		return dto2;

	}
}
