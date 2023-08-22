package step3_01.arrayAdvanced;

import java.util.Scanner;

/*
 *	# 2차원배열 기본문제[2단계]
*/

public class ArrayEx38_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] arr = new int[3][3];
		
		int k = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		
		// 문제 1) 인덱스 2개를 입력받아 값 출력
		// 예    1) 인덱스1 입력 : 1	인덱스2 입력 : 2
		//		   값 출력 : 60 
		int index1 = 0;
		int index2 = 0;
		System.out.print("인덱스1 입력 : ");
		index1 = scan.nextInt();		
		System.out.print("인덱스2 입력 : ");
		index2 = scan.nextInt();
		
		System.out.println("값 출력 : " + arr[index1][index2]);
		
		
		// 문제 2) 값을 입력받아 인덱스 2개 출력
		// 예    2) 값 입력 : 60
		//		   인덱스1 출력 : 1	인덱스2 출력 : 2
		int value = 0;
		System.out.print("값 입력 : ");
		value = scan.nextInt();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == value) System.out.println("인덱스 1 출력 : " + i + " 인덱스2 출력 : " + j);
			}
		}
		
		// 문제 3) 가장 큰 값의 인덱스 2개 출력
		// 정답 3) 2 2
		int max = 0;
		int row = 0;
		int col = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > max) {
					row = i;
					col = j;
				}
			}
		}
		System.out.println(row + " " + col);
		
		// 문제 4) 값 2개를 입력받아 값 교체
		int num1 = 0;
		int num2 = 0;
		int row1 = 0; 
		int row2 = 0;
		int col1 = 0;
		int col2 = 0;
		System.out.print("값1 입력 : ");
		num1 = scan.nextInt();
		System.out.print("값2 입력 : ");
		num2 = scan.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (num1 == arr[i][j]) {
					row1 = i;
					col1 = j;
				}
				if (num2 == arr[i][j]) {
					row2 = i;
					col2 = j;
				}
			}
		}
		arr[row2][col2] = num1;
		arr[row1][col1] = num2;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
