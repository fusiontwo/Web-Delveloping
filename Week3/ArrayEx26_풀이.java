package step3_01.arrayAdvanced;

import java.util.Random;

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
		
		final int SIZE = 9;
		
		int[] oneToNine = new int[SIZE];
		int[] tenToEightTeen  = new int[SIZE];
		boolean[] isCheck = new boolean[SIZE * 2];
		
		int i = 0;
		int ranNum = 0;
		
		while (i < oneToNine.length) {
			ranNum = ran.nextInt(9);
			if (!isCheck[ranNum]) {  // isCheck 배열에 저장된 값이 false이면 실행
				isCheck[ranNum] = true;  // isCheck은 1~9의 값이 사용되었는지 사용되지 않았는지 표시하는 배열
				oneToNine[i++] = ranNum + 1;
			}
		}
		
		while (i < tenToEightTeen.length) {
			ranNum = ran.nextInt(9);
			if (!isCheck[ranNum + 9]) {
				isCheck[ranNum + 9] = true;
				tenToEightTeen[i++] = ranNum + 10;
			}
		}
		
		for (int j = 0; j < oneToNine.length; j++) {
			System.out.print(oneToNine[j] + " ");
		}
		for (int j = 0; j < tenToEightTeen.length; j++) {
			System.out.print(tenToEightTeen[j] + " ");
		}
		
	}
	
}
