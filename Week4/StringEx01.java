package step4_01.string;

import java.util.Scanner;

/*
 * 
 * # 문자열 입력
 * 
 *  next() : 공백을 기준으로 한단어만 입력받는다.
 * 
 * */

public class StringEx01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
//		String getName = scan.next();  // 띄어쓰기를 제외한 문자열을 입력받는다.
		String getName = scan.nextLine();
		System.out.println("이름 : " + getName);
		
		System.out.println("나이를 입력하세요 : ");
		int getAge = scan.nextInt();
		System.out.println("나이 : " + getAge);
		
		scan.nextLine();  // 위쪽의 enter를 처리해줌.
		
		System.out.println("연락처를 입력하세요 : ");
		String getCall = scan.next();
		System.out.println("연락처 : " + getCall);
		
		scan.close();  // 잊지 않도록 Scanner 생성할 때 써놓는 것도 좋음.
	}

}
