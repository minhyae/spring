<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%

	String id = request.getParameter("id");
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	String writer = request.getParameter("writer");
	
	//1. 드라이버 설정
	Class.forName("com.mysql.jdbc.Driver"); //void형 메서드 설정만으로도 끝
	out.print("1. 드라이버 설정 성공!");
	
	//2. DB연결
	String url="jdbc:mysql://localhost:3307/spring"; //연결할 db
	String user="root"; //id
	String password="1234"; //password
	Connection con  = DriverManager.getConnection(url, user, password); //램에 생기는 변수 Driver manager가 3개의 변수로 db를 연결해줌
	//return해줌 
	out.print("2. DB연결 성공!");
	
	//3. SQL결정
	String sql = "insert into bbs values (?,?,?,?)"; //sql
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setString(1, id);
	ps.setString(2, title);
	ps.setString(3, content);
	ps.setString(4, writer);
	out.print("3. SQL결정 성공!");
	
	//4. SQL전송
	ps.executeUpdate();
	out.print("4. SQL전송성공!");
	
%>