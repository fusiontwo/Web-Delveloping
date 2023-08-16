package step1_06.loop;

// 2023-08-11 19:16 ~
import java.util.Scanner;

/*
 * # ATM[2단계]
 * 
 * 1. 로그인
 * . 로그인 후 재 로그인 불가
 * . 로그아웃 상태에서만 이용 가능
 * 2. 로그아웃
 * . 로그인 후 이용가능
 * 3. 입금
 * . 로그인 후 이용가능
 * 4. 출금
 * . 로그인 후 이용가능
 * 5. 이체
 * . 로그인 후 이용가능
 * 6. 조회
 * . 로그인 후 이용가능
 * 7. 종료
 * 
 */

public class LoopEx10_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;	
		
		int identifier = -1;						// -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)
		
		int acc = 0;  // user input
		int pw = 0;
		
		int depositMoney = 0;
		int withdrawalMoney = 0;
		int transferMoney = 0;
		
		boolean isRun = true;
		while(isRun) {
			
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("3.입금");
			System.out.println("4.출금");
			System.out.println("5.이체");
			System.out.println("6.조회");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			// 로그인
			if (sel == 1) {
				if (identifier == -1) {
					System.out.print("ID : ");
					acc = scan.nextInt();
					System.out.print("PW : ");
					pw = scan.nextInt();
					if (acc == dbAcc1 && pw == dbPw1) {
						System.out.println("dbAcc1으로 로그인되었습니다.");
						identifier = 1;
					}				
					else if (acc == dbAcc2 && pw == dbPw2) {
						System.out.println("dbAcc2로 로그인되었습니다.");
						identifier = 2;
					}
					else System.out.println("id 또는 pw가 일치하지 않습니다.");					
				}
				else if (identifier == 1) System.out.println("dbAcc1으로 로그인 중입니다.");
				else System.out.println("dbAcc2로 로그인 중입니다.");
			}
			// 로그아웃 
			else if (sel == 2) {
				if (identifier == 1 || identifier == 2) {
					System.out.println("로그아웃 되었습니다.");
					identifier = -1;
				}
				else System.out.println("이미 로그아웃 상태입니다.");
			}
			// 입금
			else if (sel == 3) {
				if (identifier == 1) {
					System.out.print("입금할 금액을 입력하시오 : ");
					depositMoney = scan.nextInt();
					dbMoney1 += depositMoney;
					System.out.println("입금 후 잔액은 " + dbMoney1 + "원 입니다.");
				}
				else if (identifier == 2) {
					System.out.print("입금할 금액을 입력하시오 : ");
					depositMoney = scan.nextInt();
					dbMoney2 += depositMoney;
					System.out.println("입금 후 잔액은 " + dbMoney2 + "원 입니다.");
				}
				else System.out.println("로그인 후 이용 가능합니다.");
			}
			// 출금
			else if (sel == 4) {
				if (identifier == 1) {
					System.out.print("출금할 금액을 입력하시오 : ");
					withdrawalMoney = scan.nextInt();
					dbMoney1 -= withdrawalMoney;
					System.out.println("출금 후 잔액은 " + dbMoney1 + "원 입니다.");
				}
				else if (identifier == 2) {
					System.out.print("출금할 금액을 입력하시오 : ");
					withdrawalMoney = scan.nextInt();
					dbMoney2 -= withdrawalMoney;
					System.out.println("출금 후 잔액은 " + dbMoney2 + "원 입니다.");
				}
				else System.out.println("로그인 후 이용 가능합니다.");
			}
			// 이체
			else if (sel == 5) {
				if (identifier == 1) {
					System.out.print("dbAcc2에게 이체할 금액을 입력하시오 : ");
					transferMoney = scan.nextInt();
					dbMoney2 += transferMoney;
					System.out.println("dbAcc2에게 " + transferMoney + "원 이체 완료했습니다.");
				}
				else if (identifier == 2) {
					System.out.print("dbAcc1에게 이체할 금액을 입력하시오 : ");
					transferMoney = scan.nextInt();
					dbMoney1 += transferMoney;
					System.out.println("dbAcc1에게 " + transferMoney + "원 이체 완료했습니다.");
				}
				else System.out.println("로그인 후 이용 가능합니다.");
			}
			// 조회
			else if (sel == 6) {
				if (identifier == 1) {
					System.out.println("dbAcc1님의 잔고는 " + dbMoney1 + "원 입니다.");
				}
				else if (identifier == 2) {
					System.out.println("dbAcc2님의 잔고는 " + dbMoney2 + "원 입니다.");
				}
				else System.out.println("로그인 후 이용 가능합니다.");
			}
			// 종료
			else if (sel == 0) {
				isRun = false;
				System.out.println("프로그램 종료");
			}
		}
	
		scan.close();
		
	}

}
