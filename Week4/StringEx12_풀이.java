package step4_01.string;

// 2023-09-01 17:20 ~ 17:57
import java.util.Scanner;

/*
 * # 쇼핑몰 [장바구니]
 * 1. 로그인 후 쇼핑 메뉴를 선택하면, 다음과 같이 상품목록을 보여준다.
 * 	1) 사과
 *  2) 바나나
 *  3) 딸기
 * 2. 번호를 선택해 상품을 장바구니에 담을 수 있다.
 * 3. 로그인 회원의 인덱스 번호는 각 행의 첫번째 열에 저장한다.
 * 4. 해당 회원이 구매한 상품의 인덱스 번호는 각 행의 두번째 열에 저장한다.
 * 예)
 * {
 * 		{0, 1},				qwer회원 			> 사과구매
 * 		{1, 2},				javaking회원 		> 바나나구매
 * 		{2, 1},				abcd회원			> 사과구매
 * 		{0, 3},				qwer회원			> 딸기구매
 * 		...
 * }
 */



public class StringEx12_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[] ids = {"qwer", "javaking", "abcd"};
		String[] pws = {"1111",     "2222", "3333"};
		
		int[][] cart = new int[100][2];  // 100번 구매 가능, 2개의 방에는 회원 인덱스 번호와 상품 인덱스 번호를 저장
		
		int itemCnt = 0;  // 구매한 상품 개수를 나타냄
		
		String[] items = {"사과", "바나나", "딸기"};
		
		int identifier = -1;  // 로그아웃(-1), qwer(0), javaking(1), abcd(2)
		
		int cartCnt = 0;
		
		while(true) {
			
			System.out.println("[MEGA MART]");
			System.out.println("[1]로 그 인");
			System.out.println("[2]로그아웃");
			System.out.println("[3]쇼     핑");
			System.out.println("[4]장바구니");
			System.out.println("[0]종     료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if		(sel == 1) {
				if (identifier == -1) {
					while(true) {
						System.out.print("ID 입력 : ");
						String id = scan.next();
						System.out.print("PW 입력 : ");
						String pw = scan.next();
						
						for(int i = 0; i < ids.length; i++) {
							if (id.equals(ids[i]) && pw.contentEquals(pws[i])) {
								identifier = i;
							}
						}
						
						if (identifier == -1) System.out.println("ID와 PW를 다시 확인하세요.");
						else {
							System.out.println(ids[identifier] + "로 로그인 되었습니다.");
							break;
						}
					}
				}
				else if (identifier != -1) {
					System.out.println("이미 " + ids[identifier] + "로 로그인 되어 있습니다.");
				}
			}
			
			else if (sel == 2) {
				System.out.print(ids[identifier] + " 계정에서 로그아웃 하시겠습니까(yes, no)? ");
				String approval = scan.next();
				if (approval.equals("yes")) {
					identifier = -1;
					System.out.println("로그아웃 되었습니다.");
				}
				else if (approval.equals("no")) System.out.println("로그아웃 하지 않습니다.");
			}
			
			else if (sel == 3) {
				int itemNum = -1;
				System.out.print("구매하려는 상품을 입력하시오 : ");
				String boughtThing = scan.next();
				for (int i = 0; i < items.length; i++) {
					if (boughtThing.equals(items[i])) itemNum = i + 1; 
				}
				cart[cartCnt][0] = identifier;
				cart[cartCnt][1] = itemNum;
				if (cartCnt < cart.length - 1) cartCnt++;
			}
			
			else if (sel == 4) {
				for(int i = 0; i < cart.length; i++) {
					if (cart[i][1] == 1 || cart[i][1] == 2 || cart[i][1] == 3) {
						System.out.print(ids[cart[i][0]] + "회원   >    ");
						System.out.println(items[cart[i][1]-1] + "구매");
					}
					else if (cart[i][1] != 1 && cart[i][1] != 2 && cart[i][1] != 3) break;
				}
			}
			
			else if (sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}



	}

}
