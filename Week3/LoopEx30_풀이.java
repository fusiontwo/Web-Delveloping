package step1_06.loop;

/*
 * # 2차원 반복문
 * 
 * 1 2 3 4 5
 * 10 9 8 7 6
 * 11 12 13 14 15
 * 20 19 18 17 16
 * 21 22 23 24 25
 * 
 * 
 * 1) 오른쪽방향으로 순서대로 출력
 * 2) 왼쪽방향대로 순서대로 출력
 * 
 * 1)2) 5번 반복
 * 
 */


public class LoopEx30_풀이 {

	public static void main(String[] args) {
		
//		for (int i = 1; i < 6; i++) {
//			System.out.print(i + " ");
//		}
//		
//		System.out.println();
//		
//		for (int i = 10; i > 5; i--) {
//			System.out.print(i + " ");
//		}
		
//		for (int i = 1; i < 6; i++) {
//			for (int j = 1; j <= 5; j++) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
//		System.out.println();
		
//		for (int i = 1; i < 6; i++) {
//			for (int j = 1; j <= 5; j++) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}
//		System.out.println();
		
		int start = 1;
		int end = 5;
		
		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				for (int j = start; j <= end; j++) {
					System.out.print(j + " ");
				}
				System.out.println();
			}
			else {
				for (int j = end; j >= start; j--) {
					System.out.print(j + " ");
				}
				System.out.println();
			}
			
			start = start + 5;
			end = end + 5;
		}

	}

}
