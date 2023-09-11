package step3_01.arrayAdvanced;

import java.util.Arrays;

// 2023-09-11 18:17 ~ 18:27
/*
 * # 석차 출력
 * 
 * . 성적 순으로 이름 출력
 */

public class ArrayEx32_풀이 {

	public static void main(String[] args) {

		String[] names = {"홍길동", "김영", "자바킹", "민병철", "메가맨"};
		int[] scores   = {    87,    42,    100,     11,     98};
		
		for (int i = 0; i < scores.length; i++) {
			for (int j = i; j < scores.length; j++) {
				if (scores[i] < scores[j]) {
					int tempScore = scores[i];
					scores[i] = scores[j];
					scores[j] = tempScore;
					
					String tempName = names[i];
					names[i] = names[j];
					names[j] = tempName;
				}
			}
		}
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + " : " + scores[i]);
		}
	}

}
