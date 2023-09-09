package step6_01.classObject;

import java.util.Scanner;

// 2023-09-04 16:58 ~ 17:05
/*
 * # OMR카드 : 클래스 + 변수
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 20점이다.
 * 예)
 * answer = {1, 3, 4, 2, 5}
 * hgd    = {1, 1, 4, 4, 3}
 * 정오표     = {O, X, O, X, X}
 * 성적        = 40점
 */

class Ex06_연습{
	int[] answer = {1, 3, 4, 2, 5};		// 시험답안
	int[] hgd = new int[5];				// 학생답안
	
	int answerCnt = 0;					// 정답 맞춘 개수
	int score = 0;						// 성적
}



public class ClassEx06_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Ex06_연습 e = new Ex06_연습();
		
		for(int i = 0 ; i < e.hgd.length; i++) {
			System.out.print(i+1 + "번 문제의 답을 입력하시오 : ");
			e.hgd[i] = scan.nextInt();
		}
		
		for(int i = 0; i < e.answer.length; i++) {
			if (e.answer[i] == e.hgd[i]) {
				System.out.print("O ");
				e.answerCnt++;
			}
			else System.out.print("X ");
		}
		
		e.score = e.answerCnt * 20;
		System.out.println();
		System.out.println("점수는 " + e.score + "점 입니다.");

	}

}
