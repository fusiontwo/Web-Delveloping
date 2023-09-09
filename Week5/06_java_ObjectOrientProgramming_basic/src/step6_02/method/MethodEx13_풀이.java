package step6_02.method;

import java.util.Arrays;
import java.util.Random;


/*
 * # OMR카드 : 클래스 + 메서드
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 20점이다.
 * 예)
 * answer = {1, 3, 4, 2, 5}
 * hgd    = {1, 1, 4, 4, 3}
 * 정오표 = {O, X, O, X, X}
 * 성적   = 40점
 */


class ScoreMng_연습 {
	
	Random ran = new Random();
	
	int[] omr = {1, 4, 3, 2, 5};		// 모범답안
	int[] rNum = new int[5];			// 학생답안
	
	int answerCnt = 0;					// 정답을 맞춘 개수
	int score = 0;						// 성적
	
	// 1.me 답안 완성하기
	void makeAnswer() {
		for (int i = 0; i < rNum.length; i++) {
			rNum[i] = ran.nextInt(5) + 1;
		}
	}
	
	
	
	// 2.정답 출력하기
	void showAnswer() {
		System.out.print("omr    : ");
		for (int i = 0; i < omr.length; i++) {
			System.out.print(omr[i] + " ");
		}
		System.out.println();
		System.out.print("rNum   : ");
		for (int i = 0; i < rNum.length; i++) {
			System.out.print(rNum[i] + " ");
		}
		System.out.println();

	}
	
	
	
	// 3.정답 비교하기
	void checkAnswer() {
		int correctCnt = 0;
		System.out.print("정오표 : ");
		for (int i = 0; i < omr.length; i++) {
			if (omr[i] == rNum[i]) {
				System.out.print("O ");
				correctCnt++;
			}
			else System.out.print("X ");
		}
		System.out.println();
		int score = correctCnt * 20;
		System.out.println("점수 : " + score + "점");
	}
	
	
	// 4.실행하기
	void run() {
		
		makeAnswer();
		showAnswer();
		checkAnswer();
		
	}
	
}

public class MethodEx13_풀이 {

	public static void main(String[] args) {
		
		ScoreMng_연습 sm = new ScoreMng_연습();
		sm.run();
		
		/*
		 * # 유용한 단축키
		 * 
		 * 1) ctrl + 메서드 호출부 클릭 > 메서드 정의부로 이동
		 * 2) 1)번 작업 이후 alt 왼쪽,오른쪽방향키로 메서드 호출부 정의부 자유롭게 이동
		 * 
		 * */
		
		

	}

}
