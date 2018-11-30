package day14;

import java.io.Serializable;

// 객체의 직렬화: Serializable
public class Member implements Serializable{
	private String id, name, email;
	private transient String pw; // 저장할 때 이 항목은 예외 시킨다
	private int age;
	
	// 기본생성자
	// 매개변수 있는 생성자
	// setter, getter
	public Member() {
		
	}
	
	public Member(String id, String name, String email, String pw, int age) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.pw = pw;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
