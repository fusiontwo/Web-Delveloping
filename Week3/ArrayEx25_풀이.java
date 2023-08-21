package step3_01.arrayAdvanced;

import java.util.Scanner;

/*
 * 
 * # 최대값 구하기[3단계]
 * 
 * 1. 가장 큰 값을 찾아 입력한다.
 * 2. 정답이면 해당 값을 -1로 변경한다.
 * 3. arr배열의 모든 값이 -1로 변경되면 프로그램은 종료된다.
 * 예)
 * 11, 87, 42, 100, 24
 * 입력 : 100
 * 
 * 11, 87, 42, -1, 24
 * 입력 : 87
 * 
 * 11, -1, 42, -1, 24
 * 
 */


public class ArrayEx25_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {11, 87, 42, 100, 24};
		boolean isRunning = true;
		
		int num = 0;
		while (isRunning) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			System.out.print("입력 : ");
			num = scan.nextInt();
			
			for (int i = 0; i < arr.length; i++) {
				if (num == arr[i]) arr[i] = -1;
			}
			
			int flag = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != -1) flag = 1;
			}
			
			if (flag != 1) {// -1이 아닌 값이 하나도 남아있지 않으면
				isRunning = false;
				System.out.println("종료되었습니다.");
			}
		}
	
	}
}
