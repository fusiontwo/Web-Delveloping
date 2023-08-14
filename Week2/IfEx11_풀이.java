package step1_05.condition;

import java.util.Scanner;

/*
 * # 영수증 출력[1단계]
 * 
 * 1. 메뉴판을 출력한다.
 * 2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다.
 * 3. 현금을 입력받는다.
 * 4. 입력받은 현금과 메뉴가격을 확인해, 영수증을 출력한다.
 * 5. 단, 현금이 부족한 경우 "현금이 부족합니다."라는 메세지를 출력한다.
 */


public class IfEx11_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우    버거 : " + price2 + "원");
		System.out.println("3.콜         라 : " + price3 + "원");
		
		System.out.print("주문하려는 메뉴의 번호를 입력하세요(1~3) : ");
		int menuNum = scan.nextInt();
		
		int payment;
		if (menuNum == 1) payment = price1;
		else if (menuNum == 2) payment = price2;
		else payment = price3;
		
		System.out.print("현금을 입력하세요 : ");
		int money = scan.nextInt();
		if (payment > money) System.out.println("현금이 부족합니다.");
		else {
			if (payment == money) {
				System.out.println("넣은 금액 : " + money);
				System.out.println("거스름돈 : 0원");
			}
			else {
				System.out.println("넣은 금액 : " + money);
				System.out.println("거스름돈 : " + (money - payment));
			}
		}
		scan.close();
	}

}
