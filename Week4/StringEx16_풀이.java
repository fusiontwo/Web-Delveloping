package step4_01.string;

// 2023-08-30 18:00 ~ 18:46
import java.util.Scanner;

/*
 * # 단어 검색
 * 
 * 1. 단어를 입력받아 text변수 문장 속에 해당 단어가 있는지 검색한다.
 * 2. 단어가 존재하면 true
 *    단어가 없으면 false를 출력한다.
 */

public class StringEx16_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		String text = "Life is too short.";
		System.out.println(text);
		
		System.out.print("검색할 단어를 입력하세요 : ");
		String word = scan.next();
		

		char[] arr = new char[text.length()];
		for (int i = 0; i < text.length(); i++) {
			arr[i] = text.charAt(i);
		}
		
		int wordSize = word.length();
		boolean isSame = false;
		for (int i = 0; i < text.length() - wordSize; i++) {
			int correctCnt = 0;
			for (int j = 0; j < word.length(); j++) {
				if (arr[i+j] == word.charAt(j)) {
					correctCnt++;
				}
			}
			if (correctCnt == wordSize) isSame = true; 
		}

		if (isSame) System.out.println("true");
		else System.out.println("false");
	}
}

