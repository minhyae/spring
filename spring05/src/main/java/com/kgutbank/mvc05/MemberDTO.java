package com.kgutbank.mvc05;

public class MemberDTO {

	//글로벌 변수(자동 초기화, null로 초기화)
	private String id;
	private String pw;
	private String name;
	private String tel;
	
	
	//get 메소드, getter
	public String getId() {
		return id;
	}

	//set 메소드 , setter
	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
}
