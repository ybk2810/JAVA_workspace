package day19;

import java.util.Scanner;

public class TestMain2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		System.out.print("������ �μ��� �μ���ȣ: ");
		int deptno = sc.nextInt();
		
		System.out.print("�μ���: ");
		String dname = sc2.nextLine();
		
		System.out.print("��ġ: ");
		String loc = sc3.nextLine();
		System.out.println(deptno + " : " + dname + " : " + loc);
		
		DeptDAO dao = new DeptDAO();
		DeptVO vo = new DeptVO();
		vo.setDeptno(deptno);
		vo.setDname(dname);
		vo.setLoc(loc);
		dao.updateOne(vo);
		
		DeptVO vo2 = dao.selectOne(deptno);
		System.out.println(vo2.getDeptno() + " : " + vo2.getDname() + " : " + vo2.getLoc());

		dao.close();
		
	}
}
