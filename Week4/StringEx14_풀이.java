package step4_01.string;

import java.util.Scanner;

/*
 * # 문자열 비교
 * 
 *  equals메서드를 사용하지 않고 두 문자열이 같은지 판별하는 코드를 작성해보시오.
 *  
 */

public class StringEx14_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String name = "코끼리";
		
		System.out.print("동물 이름을 입력하세요 : ");
		String myName = scan.next();
		
		char[] nameArr = new char[100];
		for (int i = 0; i < name.length(); i++) {
			nameArr[i] = name.charAt(i);
		}
		
		char[] myNameArr = new char[100];
		for (int i = 0; i < myName.length(); i++) {
			myNameArr[i] = myName.charAt(i);
		}
		
		int flag = 0;
		for (int i = 0; i < nameArr.length; i++) {
			if (nameArr[i] != myNameArr[i]) flag = 1;
		}
		
		if (flag == 0) System.out.println("두 문자열은 같습니다.");
		else if (flag == 1) System.out.println("두 문자열은 다릅니다.");

	}

}
