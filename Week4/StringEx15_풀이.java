package step4_01.string;

import java.util.Scanner;

/*
 * # 문자열 속 숫자검사
 * 
 * 예) adklajsiod
 * 	     문자만 있다.
 * 예) 123123
 *    숫자만 있다.
 * 예) dasd12312asd
 *    문자와 숫자가 섞여있다.
 */

public class StringEx15_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력 : ");
		String text = scan.next();
		int strFlag = 0;
		int numFlag = 0;

		// 아래 3줄로 'a','A','z','Z','1','2'의 숫자값을 확인했다.
//		char ch = 'a';
//		int n = ch; 
//		System.out.println(n);


		char ch = ' ';
		int num = 0;
		for (int i = 0; i < text.length(); i++) {
			ch = text.charAt(i);
			if (ch >= 97 && ch <= 122 || ch >= 65 && ch >= 90) strFlag = 1;
			else if (ch >= 49 && ch <= 57) numFlag = 1;
		}
		
		if (strFlag == 1 && numFlag == 0) System.out.println("문자만 있다.");
		else if (strFlag == 0 && numFlag == 1) System.out.println("숫자만 있다.");
		else if (strFlag == 1 && numFlag == 1) System.out.println("문자와 숫자가 섞여있다.");
	}

}
