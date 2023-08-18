package step2_01.array;

import java.util.Scanner;

/*
 * # 즉석복권
 * 
 * 1. 숫자 7이 연속으로 3번 등장하면, 당첨복권이다.
 * 2. 메뉴를 선택해서 1번 2번 3번이 당첨인지 확인한다.
 * 3. 0번은 반복문을 종료한다.
 * 
 */


public class ArrayEx10_풀이 {
	
	public static boolean win(int[] array) {
		boolean win = false;
		for (int i = 0; i < array.length - 2; i++) {
			if (array[i] == 7 && array[i+1] == 7 && array[i+2] == 7) {
				win = true;
			}
		}
		return win;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] lotto1 = {0, 0, 7, 7, 7, 0, 0, 0};
		int[] lotto2 = {7, 0, 7, 7, 0, 0, 0, 0};
		int[] lotto3 = {7, 0, 7, 7, 7, 0, 7, 0};
		int sel      = 0;
		String lotto1Win = "당첨되지 않았습니다.";
		String lotto2Win = "당첨되지 않았습니다.";
		String lotto3Win = "당첨되지 않았습니다.";
		
		while (true) {
					
			System.out.println("\n[1]번복권 결과확인");
			System.out.println("[2]번복권 결과확인");
			System.out.println("[3]번복권 결과확인");
			System.out.println("[0]종료");
			System.out.print("메뉴 선택 : ");
			sel = scan.nextInt();
			
			if (sel == 1) {
				if (win(lotto1)) lotto1Win = "당첨되었습니다.";
				System.out.println("1번 복권은 " + lotto1Win);
			}
			
			else if (sel == 2) {
				if (win(lotto2)) lotto2Win = "당첨되었습니다.";
				System.out.println("2번 복권은 " + lotto2Win);
			}
			
			else if (sel == 3) {
				if (win(lotto3)) lotto3Win = "당첨되었습니다.";
				System.out.println("3번 복권은 " + lotto3Win);
			}
			
			else if (sel == 0) {
				System.out.println("종료되었습니다.");
				break;
			}
			
			else System.out.println("0 ~ 3 사이의 메뉴를 선택하시오.");
			
		}
		
	}
}
