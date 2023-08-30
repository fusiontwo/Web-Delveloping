package step4_01.string;

import java.util.Scanner;

/*
 * # 쇼핑몰 [관리자]
 * 
 * 1. 카테고리와 아이템을 입력받아 아래의 예시와 같이 저장한다.
 * 2. 카테고리는 각 행의 첫번째 열에 저장한다.
 * 3. 아이템은 각 행의 두번째 열에 저장한다.
 *    단, 아이템은 여러개를 추가할 수 있도록 슬러시(/)를 구분자로 연결해준다.
 * 예)
 * {
 * 		{"과일", "사과/포도/"},
 * 		{"과자", "홈런볼/쪼리퐁/"},
 * 		{"음료", "콜라/"},
 * 		{"육류", "소고기/"}
 * 		...
 * 
 * 
 * } 
 */



public class StringEx11_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[][] items = new String[100][2];
		for(int i = 0; i < items.length; i++) {
			items[i][0] = "";
			items[i][1] = "";
		}
		
		int itemCnt = 0;
		String category = "";
		String item = "";
		String categoryOfItem = "";
		int categoryIdx = 0;
		
		while(true) {

			System.out.println("[관리자 모드]");
			System.out.println("[1]카테고리 관리");
			System.out.println("[2]아 이 템  관리");
			System.out.println("[3]전체품목 출력");
			System.out.println("[4]종료");
			
			System.out.print("메뉴 선택: ");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				System.out.print("추가할 카테고리를 입력하시오 : ");
				category = scan.next();
				items[itemCnt][0] = category;
				itemCnt++;
			}
			else if (sel == 2) {
				System.out.print("추가할 아이템이 속하는 카테고리를 입력하시오 : ");
				categoryOfItem = scan.next();
				for (int i = 0; i < items.length; i++) {
					if (categoryOfItem.equals(items[i][0])) categoryIdx = i;
				}
				System.out.print("추가할 아이템을 입력하시오 : ");
				item = scan.next();
				items[categoryIdx][1] += item + "/";
			}
			else if (sel == 3) {
				for (int i = 0; i < items.length; i++) {
					if (!items[i][0].equals("")) {
						// 아래와 같이 포맷팅해서 쓸 수도 있음.
//					String formattedStr = String.format("{\"%s\", \"%s\"}", items[i][0], items[i][1]);
						System.out.println("{\"" + items[i][0] + "\", \"" + items[i][1] + "\"}");						
					}
				}				
			}
			else if (sel == 4) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			
		}



	}

}
