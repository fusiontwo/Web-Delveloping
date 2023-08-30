package step2_01.array;

import java.util.Scanner;

// 2023-08-30 14:10 ~ 16:00
public class ArrayEx24_테스트문제1_3_풀이 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 문제 13) 아래 배열 l과 m을 비교해서 둘의 합이 짝수 일때만 n에 저장 	
		// 예) n = {74 , 82 , 0 , 0 , 0}
		int[] l = { 10 , 20 , 30 , 40 , 50 };
		int[] m = { 13 , 54 , 17 , 42 , 1 };
		int[] n = { 0 , 0 , 0 , 0 , 0};
		int idx = 0;
		for(int i = 0; i < l.length; i++) {
			if ((l[i] + m[i]) % 2 == 0) {
				n[idx] = l[i] + m[i];
				idx++;
			}
		}
		for(int i = 0; i < n.length; i++) {
			System.out.print(n[i] + " ");
		}
		System.out.println();
				
				
		// 문제 14) 아래는 시험결과 이다. 시험에 합격한 사람의 번호만 win에 저장 (60점이상 합격)
		int[] num = { 1001 , 1002 , 1003 };
		int[] score = { 50 , 83 , 78 };
		int[] win = { 0 , 0 , 0 };
		// 예) win[3]= {1002 , 1003 , 0};
		idx = 0;
		for(int i = 0; i < num.length; i++) {
			if (score[i] >= 60) {
				win[idx] = num[i];
				idx++;
			}
		}
		
		for(int i = 0; i < win.length; i++) {
			System.out.print(win[i] + " ");
		}
		System.out.println();
		
		// 문제 15) 아래는 시험결과이다. 시험에 합격한 사람의 번호만 win2에 저장 (60점이상 합격)
		int[] data = { 1001 , 80 , 1002 , 23, 1003 , 78 };
		int[] win2 = { 0 , 0 , 0 };
		// 예) win2[3] = {1001 , 1003 , 0};
		idx = 0;
		for(int i = 0; i < data.length; i++) {
			if (i % 2 == 1) {
				if (data[i] >= 60) {
					win2[idx] = data[i-1];
					idx++;
				}
			}
		}
		
		for (int i = 0; i < win2.length; i++) {
			System.out.print(win2[i] + " ");
		}
		System.out.println();
	
		// 문제 16) 아래 배열o 에서 내가 입력한 값만 빼고 p배열에 저장 
		int[] o = { 10 , 20 , 30 , 40 , 50 };
		int[] p = { 0 , 0 , 0 , 0 , 0 };
		// 예) 30 ==> p = {10 , 20 , 40 , 50 , 0};
		int exceptNum = 0;
		System.out.print("빼고 싶은 값을 입력하시오 : ");
		exceptNum = scan.nextInt();
		idx = 0;
		for(int i = 0; i < o.length; i++) {
			if (o[i] != exceptNum) {
				p[idx] = o[i];
				idx++;
			}
		}
		
		for (int i = 0; i < p.length; i++) {
			System.out.print(p[i] + " ");
		}
		System.out.println();
		
		// 문제 17) 아래 배열 q에서 내가 입력한 번호와 값만 빼고 다른 번호와 값을 r 에 저장 
		int[] q = { 1001 , 40 , 1002 , 65 , 1003 , 70 };
		int[] r = { 0 , 0 , 0 , 0 , 0 , 0 };
		// 예) 1002 ==> r = {1001 , 40 , 1003 , 70 , 0 , 0};
		exceptNum = 0;
		idx = 0;
		System.out.print("빼고 싶은 번호를 입력하시오 : ");
		exceptNum = scan.nextInt();
		for (int i = 0; i < q.length; i++) {
			if (i % 2 == 0) {
				if (q[i] != exceptNum) {
					r[idx] = q[i];
					r[idx+1] = q[i+1];
					idx += 2;
				}
			}
		}
		
		for(int i = 0; i < r.length; i++) {
			System.out.print(r[i] + " ");
		}
		System.out.println();
		
		// 문제 18) 미완!!!!!!!!!!!!!!!!!
		int[] arr = {10 , 20 , 30 , 40 , 50};
		int[] userInput = new int[5];
		int[] s = new int[5];
		
		// 숫자를 5개 입력받고 arr 배열안에 입력한값이 있을때마다 
		// s배열안에 해당 값의 인덱스를 차례대로 저장할려고 한다. 
		// 조건) 만약에 입력한 숫자가 arr에 없으면 인덱스 대신 -1 저장 
		
		// 예) 10, 20, 10, 1, 50
		//  s = { 0, 1, 0, -1, 4}
		
		// 예)  30, 40, 1, 10, 2
		// s = { 2, 3, -1, 0, -1}
		for (int i = 0; i < userInput.length; i++) {
			System.out.print((i+1) + "번째 숫자를 입력하시오 : ");
			userInput[i] = scan.nextInt();
		}

//		for (int i = 0; i < arr.length; i++) {
//			if (userInput[0] == arr[i]) {
//				s[0] = i;
//			}
//		}
		int[] nonMatchIdx = new int[s.length];
		idx = 0;
		int flag = 0;
		for (int i = 0; i < userInput.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (userInput[i] == arr[j]) {
					s[i] = j;
					flag = 1;
				}			
				else if (userInput[i] != arr[j]) {
					nonMatchIdx[idx] = i;
				}
			}
		}
		
//			for (int p = 0; p < nonMatchIdx.length; p++) {
//				if (flag == 0) {
//					s[nonMatchIdx[p]] = -1;
//				}
//			}			

		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}
		
	}

}
