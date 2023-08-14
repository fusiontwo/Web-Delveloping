package step1_06.loop;

import java.util.Scanner;

/*
 * # 영수증 출력[2단계]
 * 1. 5번 주문을 받는다.
 * 2. 주문이 끝난 후, 돈을 입력받는다.
 * 3. 각 메뉴별 주문수량과 총금액을 출력한다.
 * 
 * 예)
 * 메뉴 선택 : 1
 * 메뉴 선택 : 1
 * 메뉴 선택 : 2
 * 메뉴 선택 : 2
 * 메뉴 선택 : 3
 * 총 금액 = 31300원
 * 현금 입력 : 32000
 * === 롯데리아 영수증 ===
 * 1. 불고기 버거 : 2개
 * 2. 새우    버거 : 2개
 * 3. 콜         라 : 1개
 * 4. 총   금   액 : 31300원
 * 5. 잔         돈 : 700원
 */


public class LoopEx05_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int bulgogiBurgerPrice = 8700;
		int shrimpBurgerPrice  = 6200;
		int colaPrice = 1500;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + bulgogiBurgerPrice + "원");
		System.out.println("2.새우    버거 : " + shrimpBurgerPrice + "원");
		System.out.println("3.콜         라 : " + colaPrice + "원");
		
		int cnt = 0;
		int menuNum = 0;
		int cntBulgogi = 0;
		int cntShrimp = 0;
		int cntCola = 0;
		int totalPay = 0;
		int change = 0;
		int money = 0;
		
		while (cnt <= 4) {
			System.out.print("메뉴 선택 : ");
			menuNum = scan.nextInt();
			switch(menuNum) {
			case 1:
				cntBulgogi++;
				break;
			case 2:
				cntShrimp++;
				break;
			case 3:
				cntCola++;
				break;
			}
			cnt++;
		}
		
		totalPay = cntBulgogi * bulgogiBurgerPrice + cntShrimp * shrimpBurgerPrice + cntCola * colaPrice;
		System.out.println("총 금액 = " + totalPay + "원");
		System.out.print("현금 입력 : ");
		money = scan.nextInt();
		
		change = money - totalPay;
		System.out.println("=== 롯데리아 영수증 ===");
		System.out.println("1. 불고기 버거 : " + cntBulgogi + "개");
		System.out.println("2. 새우    버거 : " + cntShrimp + "개");
		System.out.println("3. 콜         라 : " + cntCola + "개");
		System.out.println("4. 총   금   액 : " + totalPay);
		System.out.println("5. 잔         돈 : " + change);

	}

}
