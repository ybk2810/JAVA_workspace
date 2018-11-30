package day04;

public class Hw0604No3 {
	public static void main(String[] args) {
		int[][] score = {
				{80,80,80,0,0},
				{60,80,45,0,0},
				{80,50,90,0,0},
				{80,72,90,0,0},
				{60,87,100,0,0},
				{42,55,99,0,0}
			};
		for(int i=0;i<=score.length-1;i++) {
			score[i][3] = score[i][0]+score[i][1]+score[i][2];
			score[i][4] = (score[i][0]+score[i][1]+score[i][2])/3;
			System.out.println((i+1)+"번째 학생의 총점은"+score[i][3]+", 평균은"+score[i][4]);
		}
	}
}
