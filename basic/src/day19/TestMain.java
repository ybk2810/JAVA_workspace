package day19;

import java.util.ArrayList;
import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		DeptDAO dao = new DeptDAO();
		Scanner sc = new Scanner(System.in);
		
		
//		ArrayList<DeptVO> list = dao.selectAll();
//
//		for (DeptVO vo : list) {
//			System.out.println(vo.getDeptno() + " : " + vo.getDname() + " : " + vo.getLoc());
//		}

//		System.out.println("-----------------------------------------");
//
//		DeptVO vo = dao.selectOne(10);
//		System.out.println(vo.getDeptno() + " : " + vo.getDname() + " : " + vo.getLoc());

//		System.out.println("-----------------------------------------");
//
//		// ����ڷκ��� ���� �Է¹޾� db�� ����
//		// �μ���: ...
//		// ��ġ: ...
//
//		System.out.print("�μ���: ");
//		String deptName = sc.nextLine();
//		System.out.println();
//		System.out.print("��ġ: ");
//		String deptLoc = sc.nextLine();
//		System.out.println("deptName: " + deptName);
//		System.out.println("deptLoc: " + deptLoc);
//
//		DeptVO vo1 = new DeptVO();
//		vo1.setDname(deptName);
//		vo1.setLoc(deptLoc);
//
//		dao.insertOne(vo1);
//
//		ArrayList<DeptVO> list2 = dao.selectAll();
//
//		for (DeptVO vo2 : list2) {
//			System.out.println(vo2.getDeptno() + " : " + vo2.getDname() + " : " + vo2.getLoc());
//		}
		
		System.out.println("-----------------------------------------");
		// ����
		//TestMain2
		
		
		
		
		
		
		
		

		System.out.println("-----------------------------------------");
		// ����
		System.out.print("������ �μ��� �μ���ȣ: ");
		int no = sc.nextInt();
		dao.deleteOne(no);
		System.out.println();

		ArrayList<DeptVO> list3 = dao.selectAll();

		for (DeptVO vo3 : list3) {
			System.out.println(vo3.getDeptno() + " : " + vo3.getDname() + " : " + vo3.getLoc());
		}
		
		
		
		
		
		
		
		
		
	}
}
