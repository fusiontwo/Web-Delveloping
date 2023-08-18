package step2_01.array;

import java.util.Random;

/*
 * # 중복숫자 금지[1단계]
 * 
 * 1. 0~4 사이의 숫자를 arr배열에 저장한다.
 * 2. 단, 중복되는 숫자는 없어야 한다.
 * 힌트) 랜덤 숫자를 isFirst배열의 인덱스로 활용한다.
 * 
 *  예)
 *  
 * [ 처음상태 ]
 * isFirst = {false , false , false , false , false}
 * arr     = {0, 0, 0, 0, 0}
 *  
 * 랜덤숫자 : 1
 * isFirst = {false , true , false , false , false}
 * arr     = {1, 0, 0, 0, 0}
 * 
 * 랜덤숫자 : 3
 * isFirst = {false , true , false , true , false}
 * arr     = {1, 3, 0, 0, 0}
 * 
 * 랜덤숫자 : 2
 * isFirst = {false , true , true , true , false}
 * arr     = {1, 3, 2, 0, 0}
 */


public class ArrayEx11_풀이 {

	public static void main(String[] args) {
	
		Random ran  = new Random(); 
		
		boolean[] isFirst = new boolean[5];
		int[] arr   = new int[5];
		int trueIndex = 0;
		int randomNum = 0;
		boolean matchingStatus = false;
		
		// 초기값 입력
		for (int i = 0; i < arr.length; i++) {
			isFirst[i] = false;
			arr[i] = 0;
		}
		
		for(int p = 0; p < 5; p++) {
			// 랜덤 숫자 부여
			while (true) {
				randomNum = ran.nextInt(5);
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] == randomNum) matchingStatus = true;
				}
				if (matchingStatus == false) break;
			}
			
			System.out.println("랜덤 숫자 : " + randomNum);
			arr[p] = randomNum;  // 주의
			
			// true 부여
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != 0) {
					trueIndex = arr[i];
					isFirst[trueIndex] = true;				
				}
			}
			
			// 배열의 값을 출력
			for (int i = 0; i < arr.length; i++) {
				System.out.print(isFirst[i] + " ");
			}
			System.out.println();
			
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
//		// 랜덤 숫자 부여
//		while (true) {
//			randomNum = ran.nextInt(5);
//			for (int i = 0; i < arr.length; i++) {
//				if (arr[i] == randomNum) matchingStatus =true;
//			}
//			if (matchingStatus == false) break;
//		}
//		
//		System.out.println("랜덤 숫자 : " + randomNum);
//		arr[0] = randomNum;  // 주의
//		
//		// true 부여
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] != 0) {
//				trueIndex = arr[i];
//				isFirst[trueIndex] = true;				
//			}
//		}
//		
//		// 배열의 값을 출력
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(isFirst[i] + " ");
//		}
//		System.out.println();
//		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		System.out.println();
					
	}
	
}
