package step3_01.arrayAdvanced;

import java.util.Scanner;

/*
 * 
 * # 배열 컨트롤러[2단계] : 어레이리스트(ArrayList)
 * 
 * 1. 추가
 * . 데이터를 입력받아 순차적으로 추가
 * 2. 삭제(인덱스)
 * . 인덱스를 입력받아 해당 위치의 데이터 삭제
 * 3. 삭제(데이터)
 * . 데이터를 입력받아 삭제
 * . 없는 데이터 입력 시 예외처리
 * 4. 삽입
 * . 인덱스와 데이터을 입력받아 삽입
 * 
 */

/*
 * 1. 디버그
 * 2. 돌려보기
 * 3. 주석 다 써보기
 * */



public class ArrayEx35_ArrayList_모방 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = null;
		int elementCnt = 0;
		
		
		while (true) {
			
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			// 메뉴 출력
			System.out.println("어레이리스트 컨트롤러");
			System.out.println("[1]추가");
			System.out.println("[2]삭제(인덱스)");
			System.out.println("[3]삭제(데이터)");
			
			// 사용자 메뉴 입력
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			// 메뉴 if-else if문
			if (sel == )
			
		}
		
		
		
		
	}

}