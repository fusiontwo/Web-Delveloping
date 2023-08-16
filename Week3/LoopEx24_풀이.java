package step1_06.loop;

import java.util.Random;

/*
 * # 랜덤학생
 * 
 * 1. 10회 반복을 한다.
 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
 * 3. 성적이 60점 이상이면 합격생이다.
 * ---------------------------------------
 * . 전교생(10명)의 총점과 평균을 출력한다.
 * . 합격자 수를 출력한다.
 * . 1등 학생의 번호와 성적을 출력한다.
 * 
 */

public class LoopEx24_풀이 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		int num = 0;
		int totalScore = 0;
		int passCnt = 0;
		int greatScore = 0;
		int greatStudentNum = 0;
		int average = 0;
		
		for (int i = 1; i <= 10; i++) {
			num = ran.nextInt(100) + 1;
			totalScore += num;
			if (num >= 60) passCnt++;
			if (num >= greatScore) {
				greatStudentNum = i;
				greatScore = num;
			}
		}
		average = totalScore / 10;
		
		System.out.println("전교생(10명)의 총점 : " + totalScore + "점");
		System.out.println("전교생(10명)의 평균 : " + average + "점");
		System.out.println("합격자 수 : " + passCnt + "명");
		System.out.println("1등 학생의 번호 : " + greatStudentNum + "번");
		System.out.println("1등 학생의 성적 : " + greatScore + "점");

	}

}
