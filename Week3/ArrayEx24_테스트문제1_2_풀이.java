package step2_01.array;

// 2023-08-29 17:00 ~ 17:53 
import java.util.Scanner;

public class ArrayEx24_테스트문제1_2_풀이 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		// 문제 8) 아래 d에서 scanner로 내가 입력한 값만 빼고 e에 저장 
		int[] d = { 10 , 20 , 30 , 40 , 50 };
		int[] e = { 0 , 0 , 0 , 0 , 0 };
		// 예) 30 ==> e = {10 , 20 , 40 , 50 , 0};
		int num = 0;
		int idx = 0;
		System.out.print("빼고 싶은 값을 입력하시오 : ");
		num = scan.nextInt();
		for(int i = 0; i < d.length; i++) {
			if (d[i] != num) {
				e[idx] = d[i];
				idx++;
			}
		}
		for (int i = 0; i < e.length; i++) {
			System.out.print(e[i] + " ");
		}
		System.out.println();

		// 문제 9) 아래 f에서 scanner로 내가 입력한 번호와 값을 빼고 d에 저장 
		int[] f = { 1001 , 40 , 1002 , 65 , 1003 , 70 };
		int[] g = { 0 , 0 , 0 , 0 , 0 , 0 };
		// 예) 1002 ==> {1001 , 40 , 1003 , 70 , 0 , 0};
		num = 0;
		int arrIndex = 0;
		idx = 0;
		System.out.print("빼고 싶은 값을 입력하시오 : ");
		num = scan.nextInt();
		System.out.print("빼고 싶은 값의 인덱스를 입력하시오 : ");
		arrIndex = scan.nextInt();
		for (int i = 0; i < f.length; i++) {
			if (f[i] != num && f[i] != f[arrIndex]) {
				g[idx] = f[i];
				idx++;
			}
		}
		for (int j = 0; j < g.length; j++) {
			System.out.print(g[j] + " ");
		}
		System.out.println();
		
		// 문제 10) 숫자를 하나 입력받고 아래 배열을 앞으로 하나씩 밀어낸후 맨뒤에 저장
		int[] h = { 10 , 20 , 30 , 40 , 50 };
		// 예)  60 ==> {20 , 30 , 40 , 50 , 60};
		num = 0;
		System.out.print("삽입할 숫자를 입력하시오 : ");
		num = scan.nextInt();
		for (int i = 0; i < h.length-1; i++) {
			h[i] = h[i+1];
		}
		h[h.length-1] = num;
		for (int i = 0; i < h.length; i++) {
			System.out.print(h[i] + " ");
		}
		System.out.println();
		
		// 문제 11) 숫자를 하나 입력받고 아래 배열을 뒤로 하나씩 밀어낸후 맨 앞에 저장 
		int[] i = { 10 , 20 , 30 , 40 , 50 };
		// 예) 60 ==> {60 , 10 , 20 , 30 , 40};
		num = 0;
		int temp = 0;
		System.out.print("삽입할 숫자를 입력하시오 : ");
		num = scan.nextInt();

		for (int j = i.length-1; j > 0; j--) {
			i[j] = i[j-1];
		}
		i[0] = num;
		
		for (int j = 0; j < i.length; j++) {
			System.out.print(i[j] + " ");
		}
		System.out.println();
		
		// 문제 12) 아래배열을 거꾸로 저장 
		int[] j = { 1 , 2 , 3 , 4 , 5 };
		int[] k = { 0 , 0 , 0 , 0 , 0 };
		//예) k => {5 , 4 , 3 , 2 , 1};
		for (int p = 0; p < j.length; p++) {
			k[p] = j[j.length-1-p];
		}
		for (int q = 0; q < j.length; q++) {
			System.out.print(k[q] + " ");
		}
		System.out.println();

	}

}
