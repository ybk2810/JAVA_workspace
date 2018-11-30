package day19;

// Value Object
public class DeptVO {
	private int deptno;
	private String dname;
	private String loc;
	
	// 기본생성자 (우클릭 소스 마지막)
	public DeptVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// 매개변수 있는 생성자 (우클릭 소스 마지막에서 두번째)
	public DeptVO(int deptno, String dname, String loc) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.loc = loc;
	}
	
	


	// setter
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	// getter
	public int getDeptno() {
		return deptno;
	}
	public String getDname() {
		return dname;
	}
	public String getLoc() {
		return loc;
	}
	
	
}
