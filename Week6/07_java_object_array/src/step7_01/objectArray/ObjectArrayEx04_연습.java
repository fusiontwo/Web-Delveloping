package step7_01.objectArray;

import java.util.Scanner;


class User_연습 {
	
	String id;
	int money;
	
}

public class ObjectArrayEx04_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		User_연습[] userList = new User_연습[100];
		
		for (int i = 0; i < userList.length; i++) {
			userList[i] = new User_연습();
		}
		
		int userCnt = 0;
		
		while (true) {
			System.out.println("1.회원가입");
			System.out.println("2.탈퇴");
			System.out.println("3.출력");
			System.out.println("4.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				
				User_연습 temp = new User_연습();
				System.out.print("이름을 입력하세요 : ");
				temp.id = scan.next();
				System.out.print("금액을 입력하세요 : ");
				temp.money = scan.nextInt();
				
				userList[userCnt] = temp;
				userCnt++;
			}
			
			else if (sel == 2) {
				int idx = 0;
				System.out.print("삭제할 인덱스를 입력하세요 : ");
				idx = scan.nextInt();
				for (int i = idx; i < userList.length - 1; i++) {
					userList[i] = userList[i + 1];
				}
				userCnt--;
			}
			
			else if (sel == 3) {
				for (int i = 0; i < userCnt; i++) {  // 조건식 주의
					System.out.println(userList[i].id + " " + userList[i].money);
				}
			}
			 
			else if (sel == 4) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}
		
		


	}

}
