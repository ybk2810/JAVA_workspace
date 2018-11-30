package day20;
//day10 Login
public class MemberVO {
	private String id;
	private String pw;
	private String name;
	private int grade;
	private String regdate;
	
	// 기본 생성자
	public MemberVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// 다양한 매개변수 있는 생성자
	public MemberVO(String id, String pw, String name, int grade, String regdate) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.grade = grade;
		this.regdate = regdate;
	}
	
	//setter, getter
	public String getId() {
		return id;
	}
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
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
}
