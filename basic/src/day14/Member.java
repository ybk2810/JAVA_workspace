package day14;

import java.io.Serializable;

// ��ü�� ����ȭ: Serializable
public class Member implements Serializable{
	private String id, name, email;
	private transient String pw; // ������ �� �� �׸��� ���� ��Ų��
	private int age;
	
	// �⺻������
	// �Ű����� �ִ� ������
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
