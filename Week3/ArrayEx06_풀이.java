package step2_01.array;

import java.util.Scanner;

/*
 * # 학생성적관리 프로그램[3단계] : 예외처리
 */



public class ArrayEx06_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] studentNums = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		// 문제) 학번을 입력받아 성적 출력
		// 		단, 없는학번 입력 시 예외처리
		// 예)
		// 학번 입력 : 1002		성적 : 11점
		// 학번 입력 : 1000		해당학번은 존재하지 않습니다.
		
		int hakbun = 0;
		int existenceCnt = 0;
		System.out.print("학번을 입력하시오 : ");
		hakbun = scan.nextInt();
		
		for (int i = 0; i < studentNums.length; i++) {
			if (studentNums[i] == hakbun) {
				System.out.println("성적 : " + scores[i] + "점");
				existenceCnt++;
			}
		}
		if (existenceCnt == 0) System.out.println("해당학번은 존재하지 않습니다.");
			
	}
	
}
