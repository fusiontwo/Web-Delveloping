package step1_06.loop;

// 2023-08-10 21:35~
import java.util.Scanner;

/*
 * # ATM[2단계]
 * 
 * id 변수가 -1 이면 로그아웃 상태이고
 * 				   1 이면 dbAcc1유저가 로그인한 상태이며
 * 				   2 이면 dbAcc2유저가 로그인한 상태이다.
 * 
 * 
 * 1. 로그인
 *  - dbAcc1유저 및 dbAcc2유저가 로그인 후 다시 로그인을 누를경우 '현재 000 유저님 로그인중' 출력
 * 	- 로그아웃 상태에서만 이용 가능
 * 		> 로그인 되었습니다. '000 유저님 환영합니다.' 출력
 * 2. 로그아웃
 *  - 로그 아웃 상태에서 진행시 '로그인 이후 이용해주세요' 출력
 * 	- 로그인 후 이용가능 ' 로그아웃 되었습니다.' 출력
 * 
 */

public class LoopEx08_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		
		int acc = 0;
		int pw = 0;
		
		int id = -1;						// -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)
		boolean isRun = true;
		
		
		while (isRun) {
			
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int selectMenu = scan.nextInt();
			
			if (selectMenu == 1) {
				if (id == 1) System.out.println("현재 dbAcc1 유저님 로그인중");
				else if (id ==2) System.out.println("현재 dbAcc2 유저님 로그인중");
				else {
					System.out.print("ID : ");
					acc = scan.nextInt();
					System.out.print("PW : ");
					pw = scan.nextInt();
					if (acc == dbAcc1 && pw == dbPw1) {
						System.out.println("로그인 되었습니다. dbAcc1 유저님 환영합니다.");
						id = 1;
					}
					else if (acc == dbAcc2 && pw == dbPw2) {
						System.out.println("로그인 되었습니다. dbAcc2 유저님 환영합니다.");
						id = 2;
					}
					else System.out.println("해당 id와 pw가 존재하지 않습니다.");
				}
			}
			else if (selectMenu == 2) {
				if (id == -1) System.out.println("로그인 이후 이용해주세요");
				else System.out.println("로그아웃 되었습니다.");
			}
			else if (selectMenu == 0) {
				isRun = false;
				System.out.println("프로그램 종료");
			}
		}

		scan.close();
	}

}
