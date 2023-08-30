package step4_01.string;

// 미완!!
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
		
		
		int wordLength = word.length();
		boolean flag = false;
		for (int i = 0; i < text.length() - wordLength; i++) {
			if (text.substring(i, i + wordLength) == word) flag = true;
			else flag = false;
		}
		if (flag) System.out.println("true");
		else System.out.println("false");
	
		
//		word.charAt(0)
//		word.charAt(1)
//		...
//		word.charAt(wordLength-2)
//		word.charAt(wordLength-1)

	}
}

