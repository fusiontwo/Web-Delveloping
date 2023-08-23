package step3_01.arrayAdvanced;

import java.util.Scanner;

/*
 * 
 * # 나만의 마블
 * 
 * 옷 □ □ □ □ 
 * □ ■ ■ ■ □ 
 * □ ■ ■ ■ □ 
 * □ ■ ■ ■ □ 
 * □ □ □ □ □
 * 
 * 
 * 정답의 소스를 컴파일 해보고 동작을 파악하여 코드를 작성하기.
 * 
 */

public class ArrayEx42_풀이 {

	public static void main(String[] args) {
		
		int [][] location = {{1, 2, 3, 4, 5},
							{16, 50, 50, 50, 6},
							{15, 50, 50, 50, 7},
							{14, 50, 50, 50, 8},
							{13, 12, 11, 10, 9}};
		
		
//		for (int i = 0; i < location.length; i++) {
//			for (int j = 0; j < location[i].length; j++) {
//				location[i][j] = '□';
//			}
//		}
//		
//		for (int i = 1; i < location.length-1; i++) {
//			for (int j = 1; j < location[i].length-1; j++) {
//				location[i][j] = '■';
//			}
//		}
		
		for (int i = 0; i < location.length; i++) {
			for (int j = 0; j < location[i].length; j++) {
				if (location[i][j] == 50) System.out.print('■' + " ");
				else System.out.print('□' + " ");
			}
			System.out.println();
		}

	}

}
