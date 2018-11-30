package day07;

public class TestMain5 {
	public static void main(String[] args) {
		강아지 d = new 강아지();
		토끼 r = new 토끼();
		고래 w = new 고래();
		말 h = new 말();
		
		r.뛰기();
		d.달리기();
		w.헤엄치기();
		
		r.먹기();
		d.먹기();
		w.먹기();
		System.out.println("------------------");
		r.자기();
		d.자기();
		w.자기();
		
		System.out.println("------------------");
		h.먹기();
		h.자기();
		h.달리기();
		
	}
}
