package step1_05.condition;

// 2023-08-08 21:32 ~ 21:35
import java.util.Scanner;

/*
 * # 로그인[2단계]
 * 
 * 1. id와 pw를 입력받아 회원가입을 진행한다.
 * 2. 이후 로그인을 위해 다시 id와 pw를 입력받는다.
 * 3. 가입 후 저장된 데이터와 로그인 시 입력받은 데이터를 비교한다.
 * 예) 로그인 성공 or 로그인 실패
 */


public class IfEx05_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dbId = 0;
		int dbPw = 0;
		System.out.println("[회원가입]");
		System.out.print("New ID : ");
		dbId = scan.nextInt();
		System.out.print("New PW : ");
		dbPw = scan.nextInt();
		
		System.out.println("[로그인]");
		System.out.print("ID : ");
		int id = scan.nextInt();
		System.out.print("PW : ");
		int pw = scan.nextInt();
		
		if (dbId == id && dbPw == pw) System.out.println("로그인 성공");
		else System.out.println("로그인 실패");
		
	}

}
