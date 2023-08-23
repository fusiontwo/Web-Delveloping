package step3_01.arrayAdvanced;

import java.util.Scanner;

/*
 *	# 관리비
*/

public class ArrayEx40_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] apt = {
				{101, 102, 103},	
				{201, 202, 203},	
				{301, 302, 303}	
			};
			
		int[][] pay = {
			{1000, 2100, 1300},	
			{4100, 2000, 1000},	
			{3000, 1600,  800}
		};
			
		// 문제 1) 각층별 관리비 합 출력
		// 정답 1) 4400, 7100, 5400
		int moneyFloor1 = 0;
		int moneyFloor2 = 0;
		int moneyFloor3 = 0;
		
		for (int i = 0; i < pay.length; i++) {
			for (int j = 0; j < pay[i].length; j++) {
				if (apt[i][j] / 100 == 1) moneyFloor1 += pay[i][j];
				else if (apt[i][j] / 100 == 2) moneyFloor2 += pay[i][j];
				else moneyFloor3 += pay[i][j];
			}
		}
		System.out.println(moneyFloor1 + " " + moneyFloor2 + " " + moneyFloor3);
		
		// 문제 2) 호를 입력하면 관리비 출력
		// 예    2) 입력 : 202	관리비 출력 : 2000
		int roomNum = 0;
		System.out.print("입력 :");
		roomNum = scan.nextInt();
		for (int i = 0; i < apt.length; i++) {
			for (int j = 0; j < apt[i].length; j++) {
				if (roomNum == apt[i][j]) {
					System.out.println("관리비 출력 : " + pay[i][j]);
				}
			}
		}
		
		// 문제 3) 관리비가 가장 많이 나온 집, 적게 나온 집 출력
		// 정답 3) 가장 많이 나온 집(201), 가장 적게 나온 집(303)
		int maxPay = 0;
		int minPay = 10000;
		int maxApt = 0;
		int minApt = 0;
		for (int i = 0; i < pay.length; i++) {
			for (int j = 0; j < pay[i].length; j++) {
				if (pay[i][j] > maxPay) {
					maxPay = pay[i][j];
					maxApt = apt[i][j];
				}
				if (pay[i][j] < minPay) {
					minPay = pay[i][j];
					minApt = apt[i][j];
				}
			}
		}
		System.out.println("가장 많이 나온 집 : " + maxApt);
		System.out.println("가장 적게 나온 집 : " + minApt);
		
		// 문제 4) 호 2개를 입력하면 관리비 교체
		int roomNum1 = 0;
		int roomNum2 = 0;
		int pay1 = 0;
		int pay2 = 0;
		int row1 = 0;
		int row2 = 0;
		int col1 = 0;
		int col2 = 0;
		
		System.out.print("첫 번째 호를 입력하시오 : ");
		roomNum1 = scan.nextInt();
		System.out.print("두 번째 호를 입력하시오 : ");
		roomNum2 = scan.nextInt();
		
		for (int i = 0; i < apt.length; i++) {
			for (int j = 0; j < apt[i].length; j++) {
				if (apt[i][j] == roomNum1) {
					row1 = i;
					col1 = j;
					pay1 = pay[i][j];
				}
				if (apt[i][j] == roomNum2) {
					row2 = i;
					col2 = j;
					pay2 = pay[i][j];
				}
				
			}
		}
		pay[row1][col1] = pay2;
		pay[row2][col2] = pay1;
		
		for (int i = 0; i < pay.length; i++) {
			for (int j = 0; j < pay[i].length; j++) {
				System.out.print(pay[i][j] + " ");
			}
			System.out.println();
		}

	}

}
