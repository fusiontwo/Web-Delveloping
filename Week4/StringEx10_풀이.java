package step4_01.string;

import java.util.Scanner;

/*
 * # 끝말잇기 게임
 * 
 * 제시어 : 자전거
 * 입력 : 거미
 * 제시어 : 거미
 * 입력 : 미술
 * 제시어 : 미술
 * 입력 : quit
 * 
 * - 종료 -
 * 
 */

public class StringEx10_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String start = "자전거";
		String userStr = "";
		boolean isRunning = true;
		
		while (isRunning) {
			System.out.println("제시어 : " + start);
			System.out.print("입력 : ");
			userStr = scan.next();
			if (userStr.contentEquals("quit")) {
				System.out.println("\n- 종료 -");
				isRunning = false;
			}
			start = userStr;
		}

	}

}
