package step3_01.arrayAdvanced;

// 2023-09-01 9:53 ~ 10:30, 14:40 ~ 15:02
/* 느낀 점 : 배열 안의 값을 shuffle하는 코드에 익숙해지고 있는 것 같다. 
 * 사용자가 정답을 맞췄을 때, 배열 안의 값을 변경하는 조건문을 짜는 부분에 가장 주의해야 하는 것 같다.
*/

import java.util.Random;
import java.util.Scanner;

/* 
 * # 1 to 50[3단계] : 1 to 18
 * 
 * 1. 구글에서 1 to 50 이라고 검색한다.
 * 2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
 * 3. 위 게임을 숫자범위를 좁혀 1 to 18로 직접 구현한다.
 * 4. 숫자 1~9는 oneToNine 배열에 저장하고,
 *    숫자 10~18은 tenToEightTeen 배열에 저장한다.
 */


public class ArrayEx26_풀이 {

	public static void main(String[] args) {
	
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		final int SIZE = 9;
		
		// 배열 생성
		int[] oneToNine = new int[SIZE];
		int[] tenToEightTeen  = new int[SIZE];

		// 1 ~ 9로 초기화 & 10 ~ 18으로 초기화
		for(int i = 0; i < oneToNine.length; i++) {
			oneToNine[i] = i + 1;
			tenToEightTeen[i] = i + SIZE + 1; 
		}
		
		int ranIdx = 0; 
		int temp = 0;
		
		// oneToNine 배열에 있는 값을 shuffle
		for(int i = 0; i < 1000; i++) {
			ranIdx = ran.nextInt(9);
			temp = oneToNine[0];
			oneToNine[0] = oneToNine[ranIdx];
			oneToNine[ranIdx] = temp;
		}
		
		// tenToEightTeen 배열에 있는 값을 shuffle
		for(int i = 0; i < 1000; i++) {
			ranIdx = ran.nextInt(9);
			temp = tenToEightTeen[0];
			tenToEightTeen[0] = tenToEightTeen[ranIdx];
			tenToEightTeen[ranIdx] = temp;
		}

		int userAnswer = 0;  // 사용자 입력을 저장하는 변수
		int answer = 1;  // 맞춰야 하는 값
		int correctCnt = 0;  // 맞춘 문제의 개수
		while (true) {
			if (correctCnt == 18) {
				System.out.println("모두 맞혔습니다. 게임을 종료합니다.");
				break;
			}

			// oneToNine 배열 출력
			for(int i = 0; i < oneToNine.length; i++) {
				if (oneToNine[i] == -1 ) System.out.print("\t");
				else					 System.out.print(oneToNine[i] + "\t");
				
				if (i % 3 == 2) System.out.println();
			}
			
			System.out.print("숫자 [ "+ answer + " ]의 인덱스를 입력하세요 : ");
			userAnswer = scan.nextInt();
			
			if (oneToNine[userAnswer] == answer) {
				if (answer >= 1 && answer <= SIZE) oneToNine[userAnswer] = tenToEightTeen[userAnswer];
				else oneToNine[userAnswer] = -1;
				answer++;
				correctCnt++;
			}
			else System.out.println("틀렸습니다. 다시 입력하세요.");
			
		}
		
		scan.close();
	}
	
}
